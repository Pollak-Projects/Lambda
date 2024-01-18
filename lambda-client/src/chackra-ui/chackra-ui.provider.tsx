import React from "react";
import {ChakraProvider} from "@chakra-ui/react";
import {chakraCustomTheme} from "./chackra-ui.theme.ts";

export const ChackraUiProvider = ({
    children
} : {
    children: React.ReactNode
}) => {
    return <ChakraProvider theme={chakraCustomTheme}>{children}</ChakraProvider>
}