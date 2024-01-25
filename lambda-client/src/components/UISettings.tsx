import {Box, Divider, FormControl, FormLabel, Switch, Text, useColorMode} from "@chakra-ui/react";
import {useState} from "react";

export const UISettings = () => {
    const {colorMode, toggleColorMode} = useColorMode();
    const [isCustomTheme, setIsCustomTheme] = useState(false);

    const toggleCustomTheme = () => {
        if(colorMode == "light") toggleColorMode();
        setIsCustomTheme(!isCustomTheme);
    }

    return (
        <Box alignItems='left' padding={5}>
            <Text align={"left"}>Téma beállítások</Text>
            <Divider marginTop={2} marginBottom={2} />
            <Box>
                <FormControl alignItems='center' display='flex'>
                    <FormLabel htmlFor='dark-mode' mb='0'>
                        Fehér téma bekapcsolása
                    </FormLabel>
                    <Switch
                        id='dark-mode'
                        onChange={toggleColorMode}
                        defaultChecked={colorMode == "light"}
                        isDisabled={isCustomTheme}
                        isChecked={colorMode == "light"}
                    />
                </FormControl>
            </Box>
            <Box>
                <FormControl alignItems='center' display='flex'>
                    <FormLabel htmlFor='dark-mode' mb='0'>
                        Egyedi téma bekapcsolása
                    </FormLabel>
                    <Switch id='dark-mode' onChange={toggleCustomTheme} defaultChecked={isCustomTheme}/>
                </FormControl>
            </Box>
        </Box>
    );
}