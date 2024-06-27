
import { useEffect, useState } from "react";
import "./home.css";

function Home() {
    const [userDetails, setUserDetails] = useState({
        username: "",
        email: "",
        password: ""
    });

    useEffect(() => {
        const username = localStorage.getItem('UserName');
        const email = localStorage.getItem('Email');
        const password = localStorage.getItem('Password');

        setUserDetails({
            username: username || "",
            email: email || "",
            password: password || ""
        });
    }, []);

    return (
        <div className="container">
            <h2> User details :</h2>
            <p>Username: {userDetails.username}</p>
            <p>Email: {userDetails.email}</p>
            <p>Password: {userDetails.password}</p>
        </div>
    );
}

export default Home;
