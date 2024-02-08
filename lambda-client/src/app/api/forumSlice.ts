import { apiSlice } from "./apiSlice";

export const forumApiSlice = apiSlice.injectEndpoints({
    overrideExisting: false,
    endpoints: (builder) => ({
             getForums: builder.query({
                query: () => ({
                    url: 
                    "/forums",
                    method: "GET"
                })
            })
    })
})

export const {
    useGetForumsQuery,
    useLazyGetForumsQuery
} = forumApiSlice;