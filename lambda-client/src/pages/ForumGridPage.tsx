import "./ForumGridPage.css"
import {  Grid, GridItem } from '@chakra-ui/react'
function ForumGridPage(){

    function generateForumGridElements(){
        for(let i = 0; i < 9; i++){
          let gridContent = document.createElement("div")
         /* gridContent.id = String(i)
          gridContent.innerHTML = "idk bro"
          gridContent.setAttribute("class", "gridElements")
        //@ts-ignore
          document.getElementById("forumGridContent").appendChild(gridContent) make it in html */
    
        }
      }


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
                Header
            </GridItem>
            <GridItem pl='2' bg='pink.300' area={'nav'}>
                Nav
            </GridItem>
            <GridItem pl='2' bg='green.300' area={'main'}>


                Main
                <div className="column_middle" id="forumGridContent"></div>



            </GridItem>
            <GridItem pl='2' bg='blue.300' area={'footer'}>
                Footer
            </GridItem>
            </Grid>
        
        </>
    )

}



export default ForumGridPage