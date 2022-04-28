<%@ page import="Repository.SessionFactoryConnection" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Buying bus ticket site</title>
</head>
<body>
<title> Login Page </title>
<style>
    Body {
        font-family: Calibri, Helvetica, sans-serif;
        background-color: lightgray;
    }

    button {
        background-color: #4CAF50;
        width: 100%;
        color: black;
        padding: 15px;
        margin: 10px 0px;
        border: none;
        cursor: pointer;
    }

    form {
        border: 3px solid #f1f1f1;
        margin: auto 500px;
    }

    input[type=text], input[type=password] {
        width: 100%;
        margin: 8px 0;
        padding: 12px 20px;
        display: inline-block;
        border: 2px solid green;
        box-sizing: border-box;
    }

    button:hover {
        opacity: 0.7;
    }

    .container {
        padding: 25px;
        background-color: lightblue;
    }
</style>
<center><h1> Login </h1></center>
<form action="login" method="post">
    <div class="container">
        <label>Username : </label>
        <input type="text" placeholder="Enter Username" name="username" required>
        <label>Password : </label>
        <input  type="password" placeholder="Enter Password" name="password" required>
        <button type="submit">Login</button>
        <br>
         <a href="signUp.jsp"> SignUp ? </a>
    </div>
</form>
<br/>
<script>

</script>
</body>
</html>