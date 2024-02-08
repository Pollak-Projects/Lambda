// import { Box, Center, Image, Flex, Badge, Text } from "@chakra-ui/react";
// import { MdStar } from "react-icons/md";
// TODO finish xd
/* What should settings do:
 - change theme
 - change profile picture
 - change email
 - change username
*/
import {UISettings} from "../components/UISettings.tsx";
import {EmailNotification} from "../components/EmailNotification.tsx";
import {Button, Flex, Input, Text} from "@chakra-ui/react";
import {useState} from "react";

type dataChange = {
    email: string;
    name: string;
    password: string;
    password2: string;
}

export default function Settings () {
    const [newProfilePic, setNewProfilePic] = useState<File | null>(null);
    const [dataChange, setDataChange] = useState<dataChange>(
        {email: '', name: '', password: '', password2: ''});

    const handleProfilePicChange = (e: React.ChangeEvent<HTMLInputElement>) => {
        if (!e.target.files) return;
        setNewProfilePic(e.target.files[0]);
    }

    const handleProfilePicUpload = async () => {
        if (!newProfilePic) return;
        console.log("uploading a file");
        const fileAsBlob = new Blob([newProfilePic], {type: newProfilePic.type});
        // Call the API to upload the file
        console.log(fileAsBlob); // For now
    }

    return (
        <>
            <Text>Beállítások</Text>
            <UISettings />
            <EmailNotification />
            <Flex>
                <Text>Profilkép változtatása</Text>
                <Input
                    type={'file'}
                    onChange={handleProfilePicChange}
                    placeholder='Új profilkép'
                />
                <Button isDisabled={!newProfilePic} onClick={handleProfilePicUpload}>Új profilkép feltöltése</Button>

            </Flex>
            <Flex>
                <Text>Email cím változtatása</Text>
                <Input
                    value={dataChange.email}
                    onChange={(e) => setDataChange({...dataChange, email: e.target.value})}
                    type={'text'}
                    placeholder='Új felhasználónév'
                />
                <Input
                    value={dataChange.password}
                    onChange={(e) => setDataChange({...dataChange, password: e.target.value})}
                    type={'password'}
                    placeholder='Jelszó'
                />
                <Button isDisabled={!(dataChange.email && dataChange.password)} onClick={handleProfilePicUpload}>Új profilkép feltöltése</Button>
            </Flex>
            <Flex>
                <Text>Felhasználónév változtatása</Text>
                <Input
                    value={dataChange.name}
                    onChange={(e) => setDataChange({...dataChange, name: e.target.value})}
                    type={'text'}
                    placeholder='Új felhasználónév'
                />
                <Input
                    value={dataChange.password2}
                    onChange={(e) => setDataChange({...dataChange, password2: e.target.value})}
                    type={'password'}
                    placeholder='Jelszó'
                />
                <Button isDisabled={!(dataChange.name && dataChange.password2)} onClick={handleProfilePicUpload}>Új profilkép feltöltése</Button>
            </Flex>
        </>
    );
}