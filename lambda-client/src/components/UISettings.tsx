import {ColorModeToggler} from "./ColorModeToggler.tsx";
import {Box, Divider, Text} from "@chakra-ui/react";

export const UISettings = () => {

    return (
        <Box alignItems='left' padding={5}>
            <Text align={"left"}>UI Settings</Text>
            <Divider marginTop={2} marginBottom={2} />
            <Box>
                <ColorModeToggler />
            </Box>
        </Box>
    );
}