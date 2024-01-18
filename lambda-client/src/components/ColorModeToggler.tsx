import {FormControl, FormLabel, Switch, useColorMode} from "@chakra-ui/react";

export const ColorModeToggler = () => {
    const {colorMode, toggleColorMode} = useColorMode();

    return (
        <FormControl alignItems='center' display='flex'>
            <FormLabel htmlFor='dark-mode' mb='0'>
                Toggle light mode
            </FormLabel>
            <Switch id='dark-mode' onChange={toggleColorMode} defaultChecked={colorMode == "light"}/>
        </FormControl>
    );
}