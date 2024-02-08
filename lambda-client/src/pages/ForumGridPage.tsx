import "./ForumGridPage.css"
import {Grid, GridItem, SimpleGrid, Box, Link, List, ListItem, UnorderedList} from '@chakra-ui/react'
import {NavLink} from "react-router-dom";
import Navbar from "../components/Navbar.tsx";

function ForumGridPage(){

    /*function generateForumGridElements(){
        for(let i = 0; i < 9; i++){
            const gridContent = document.createElement("div")
            gridContent.id = String(i)
            gridContent.innerHTML = "idk bro"
            gridContent.setAttribute("class", "gridElements")
            //@ts-expect-error possible null
            document.getElementById("forumGridContent").appendChild(gridContent)


        }
    }*/

    // @ts-ignore
    // @ts-ignore
    return(
        <>

            <Grid
            templateAreas={`"header header"
                            "nav main"
                            "nav footer"`}
            gridTemplateRows={ '5vh 1fr 5vh'}
            gridTemplateColumns={'15vw 1fr'}
            h='100vh'
            gap='1'
            color='blackAlpha.700'
            fontWeight='bold'
            >
            <GridItem pl='2' bg='orange.300' area={'header'}>
//fx this shit ty
                <Navbar>
                    <UnorderedList className="leftNav">
                        <ListItem><Link as={NavLink} to="/home">Home</Link></ListItem>
                    </UnorderedList>
                </Navbar>
                <nav >
                    <ul className="rightNav">
                        <li><a>Notifications</a></li>
                        <li><a>Profile</a></li>
                        <li><a> Settings</a></li>
                    </ul>
                </nav>
            </GridItem>
            <GridItem pl='2' bg='pink.300' area={'nav'}>
                Nav
            </GridItem>
            <GridItem  bg='green.300' area={'main'}>



                <div className="column_middle" id="forumGridContent" >
                    <SimpleGrid minChildWidth='30em' spacing='10px' >
                        <Box bg='tomato'  className="gridElements"></Box>
                        <Box bg='tomato'  className="gridElements"></Box>
                        <Box bg='tomato'  className="gridElements"></Box>
                        <Box bg='tomato'  className="gridElements"></Box>
                        <Box bg='tomato'  className="gridElements"></Box>
                        <Box bg='tomato'  className="gridElements"></Box>
                    </SimpleGrid>

                </div>



            </GridItem>
            <GridItem pl='2' bg='blue.300' area={'footer'}>
                Footer
            </GridItem>
            </Grid>
        
        </>
    )

}



export default ForumGridPage