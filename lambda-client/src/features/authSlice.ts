import { PayloadAction, createSlice } from "@reduxjs/toolkit";
import { RootState } from "../app/store";

export interface AuthState {
    user: string | null;
    access_token: string | null;
}

const authSlice = createSlice({
    name: "auth",
    initialState: {
        user: null,
        access_token: null,
    } as AuthState,
    reducers: {
        setCredentials(state: AuthState, action: PayloadAction<AuthState>) {
            const { user, access_token } = action.payload;
            state.user = user;
            state.access_token = access_token;
        },
        deleteCredentials(state: AuthState) {
            state.user = null;
            state.access_token = null;
        },
    },
});

export const { setCredentials, deleteCredentials } = authSlice.actions;
export default authSlice.reducer;

export const selectUser = (state: RootState) => state.auth.user;
export const selectAccessToken = (state: RootState) => state.auth.access_token;