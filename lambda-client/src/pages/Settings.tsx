// import { Box, Center, Image, Flex, Badge, Text } from "@chakra-ui/react";
// import { MdStar } from "react-icons/md";
// TODO finish xd
import {Box, Image} from "@chakra-ui/react";
import {ColorModeToggler} from "../components/ColorModeToggler.tsx";

export default function Settings () {
    return (
        <>
            <p>Settings</p>
            <Box boxSize='sm'>
                <Image src='https://bit.ly/dan-abramov' alt='Dan Abramov' />
            </Box>
            <Box border='1px' borderColor='gray.200'>
                <ColorModeToggler />
            </Box>
        </>
    );
}