import {Box, Divider, Select, Table, Text, Th, Thead, Tr} from "@chakra-ui/react";
import {useRef} from "react";

export const EmailNotification = () => {
    const asd = useRef<HTMLSelectElement>(null);

    const whenDropDown = (reference: React.RefObject<HTMLSelectElement>) => {
        return (
            <Select ref={reference}>
                <option defaultChecked={true} value='now'>Azonnal</option>
                <option value='endOfDay'>Nap végén</option>
                <option value='weekly'>Hetente</option>
            </Select>
        )
    }

    return (
        <Box alignItems='left' padding={5}>
            <Text>Értesítések</Text>
            <Divider marginTop={'2vw'} marginBottom={'2vw'} />
            <Box>
                <Table>
                    <Thead>
                        <Tr>
                            <Th>Értesítés fajtája</Th>
                            <Th>Mikor kapja meg</Th>
                        </Tr>
                        <Tr>
                            <Th>Új üzenet</Th>
                            <Th>{whenDropDown(asd)}</Th>
                        </Tr>
                    </Thead>
                </Table>
            </Box>
        </Box>
    )
}