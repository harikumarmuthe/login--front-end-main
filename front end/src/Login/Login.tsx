

import axios from "axios";
import { useState } from "react";
import { useNavigate } from "react-router-dom";
import "./Login.css";

function Login() {
  const [details, setDetails] = useState({
    username: "",
    email: "",
    password: "",
  });
  const navigate = useNavigate();
  
  const handleSubmit = (e: any) => {
    e.preventDefault();
    axios
      .get(`http://localhost:8080/user/login`, {
        params: {
          username: details.username,
          email: details.email,
          password: details.password,
        },
      })
      .then((response) => {
        if (response.data === "success") {
          localStorage.setItem('UserName', details.username);
          localStorage.setItem('Email', details.email);
          localStorage.setItem('Password', details.password);
          navigate("/home");
        } else {
          setDetails({ username: "", email: "", password: "" });
          navigate("/");
        } 
      })
      .catch((error) => {
        console.error("There was an error logging in:", error);
        alert("An error occurred. Please try again later.");
      });
  };
  
  return (
    <div>
      <center>
        <div className="form-container">
          <h2 className="heading1">SPEC CampX</h2>
          <form onSubmit={handleSubmit}>
            <h2 className="heading2">Login</h2>
            <h3>Username</h3>
            <input
              type="text"
              className="name"
              placeholder="Enter your username"
              value={details.username}
              required
              onChange={(e) => {
                setDetails({ ...details, username: e.target.value });
              }}
            />
            <h3>Password</h3>
            <input
              type="password"
              className="name"
              placeholder="Enter your password"
              value={details.password}
              required
              onChange={(e) => {
                setDetails({ ...details, password: e.target.value });
              }}
            />
            <br />
            <h3>email</h3>
            <input
              type="text"
              className="name"
              placeholder="Enter your email"
              value={details.email}
              required
              onChange={(e) => {
                setDetails({ ...details, email: e.target.value });
              }}
            />
          
            <br />
            <br />
            <button className="submit-button">Submit</button>
            <br />
            <p>
              Not registered? <a href="/create">create account</a>
            </p>
          </form>
        </div>      
      </center>
    </div>
  );
}
export default Login;
