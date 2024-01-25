// import { Box, Center, Image, Flex, Badge, Text } from "@chakra-ui/react";
// import { MdStar } from "react-icons/md";
// TODO finish xd
import {UISettings} from "../components/UISettings.tsx";
import {EmailNotification} from "../components/EmailNotification.tsx";

export default function Settings () {

    return (
        <>
            <p>Beállítások</p>
            <UISettings />
            <EmailNotification />
        </>
    );
}