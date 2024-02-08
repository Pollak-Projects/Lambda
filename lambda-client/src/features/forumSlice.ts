import { PayloadAction, createSlice } from "@reduxjs/toolkit";
import { RootState } from "../app/store";
import { User } from "./userSlice";


interface ForumState {
    id: string | null,
    groupID: string | null,
    forumName: string | null,
    users: User[],
    leader_id: string | null
}

const ForumSlice = createSlice({
    name: "forum",
    initialState: {
       
 forumName: null,
    groupID: null,
    id: null
    } as ForumState,
    reducers: {
         setName(state: ForumState, action: PayloadAction<ForumState>){
            state.forumName = action.payload.forumName
        },
         delete(state: ForumState, action: PayloadAction<ForumState>){
            state.forumName = action.payload.forumName
        },
   },
});

export const { setName } = ForumSlice.actions;
export default ForumSlice.reducer;

export const selectUser = (state: RootState) => state.auth.user;
export const selectAccessToken = (state: RootState) => state.auth.access_token;
