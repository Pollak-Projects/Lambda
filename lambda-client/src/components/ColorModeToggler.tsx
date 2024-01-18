import {FormControl, FormLabel, Switch, useColorMode} from "@chakra-ui/react";

export const ColorModeToggler = () => {
    const {colorMode, toggleColorMode} = useColorMode();

    return (
            <FormControl display='flex' alignItems='center'>
                <FormLabel htmlFor='dark-mode' mb='0'>
                    Enable {colorMode === "light" ? "Dark" : "Light"}
                </FormLabel>
                <Switch id='dark-mode' onClick={toggleColorMode}/>
            </FormControl>
    );
}