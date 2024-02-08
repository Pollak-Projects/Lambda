
import { PayloadAction, createSlice } from "@reduxjs/toolkit";
import { RootState } from "../app/store";


type FromPair = {
    key: string,
}
type FromText = {
    s: string,
}
type FromSelect = {
    key: string,
}
type FromMultipleSelect = {
    key: string[],
}
interface FormData {
    data: FromText | FromPair[] | FromSelect | FromMultipleSelect 

}

interface FormItem {
    id: string | null,
    type: string | null,
    data: FormData
}
interface QuizState {
    id: string | null,
    formItems:  FormItem[] | null
}


const QuizSlice = createSlice({
    name: "forum",
    initialState: {
        id: null,
        formItems: null
    } as QuizState,
    reducers: {
         updateFormItem(state: QuizState, action: PayloadAction<QuizState>){
            // TODO only replace items that have changed
            state = action.payload;
        },
        
   },
});

export const { updateFormItem } = QuizSlice.actions;
export default QuizSlice.reducer;

export const selectUser = (state: RootState) => state.auth.user;
export const selectAccessToken = (state: RootState) => state.auth.access_token;
