import { createApi, fetchBaseQuery } from "@reduxjs/toolkit/query/react";
import {
    deleteCredentials,
    setCredentials,
} from "../../features/authSlice";
//import keycloak from "../../types/Keycloak";

const baseQuery = fetchBaseQuery({
    baseUrl: "",
    credentials: "include",
    prepareHeaders: (headers) => {
        //const token = keycloak.token;
        //if (token) {
        //    headers.set("Authorization", `Bearer ${token}`);
        //    headers.set("Access-Control-Allow-Origin", "true");
        //}
        return headers;
    },
});

const baseQueryWithRetry = async (args: any, api: any, extraOptions: any) => {
    let result = await baseQuery(args, api, extraOptions);

    if (result.error && result.error.status === 401) {
        const refreshResult = (await baseQuery(
            "/api/auth/refresh",
            api,
            extraOptions
        )) as any;
        if (refreshResult?.data) {
            const user = api.getState().auth.user;
            api.dispatch(setCredentials({ ...refreshResult?.data, user }));
            result = await baseQuery(args, api, extraOptions);
        } else {
            api.dispatch(deleteCredentials());
        }
    }

    return result;
};

export const apiSlice = createApi({
    baseQuery: baseQueryWithRetry,
    endpoints: (_builder) => ({}),
});