import Navbar from "../components/Navbar"

import { Outlet } from "react-router"
export default function Default() {
    return (
        <>
            <Navbar />
            <Outlet />
        </>
    )

}