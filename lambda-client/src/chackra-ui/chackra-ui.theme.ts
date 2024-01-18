import { extendTheme, ThemeConfig } from "@chakra-ui/react";

//
//
// NOTE :
// if you don't provide anything
// this is the default:
//
// const defaultChakraConfig = {
//   initialColorMode: 'light'
//   useSystemColorMode: false,
// }
//
//
const config: ThemeConfig = {
    initialColorMode: "dark",
    useSystemColorMode: true
};

export const chakraCustomTheme = extendTheme({
    config
});
