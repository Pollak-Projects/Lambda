import React from "react";
import {ChakraProvider} from "@chakra-ui/react";
import {chakraCustomTheme} from "./chackra-ui.theme.ts";

interface ChackraUiProviderProps {
    children: React.ReactNode
}

export const ChackraUiProvider = (props :ChackraUiProviderProps) => {
    return <ChakraProvider theme={chakraCustomTheme}>{props.children}</ChakraProvider>
}