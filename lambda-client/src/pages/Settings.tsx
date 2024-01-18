// import { Box, Center, Image, Flex, Badge, Text } from "@chakra-ui/react";
// import { MdStar } from "react-icons/md";
// TODO finish xd
import {Box, Image} from "@chakra-ui/react";
import {ColorModeToggler} from "../components/ColorModeToggler.tsx";
import {UISettings} from "../components/UISettings.tsx";

export default function Settings () {
    return (
        <>
            <p>Settings</p>
            <UISettings />
        </>
    );
}