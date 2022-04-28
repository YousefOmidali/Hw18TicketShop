<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<title> SignUp Page </title>
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
<center><h1> SignUp </h1></center>
<form action="hello-servlet" method="POST">
    <div class="container">
        <label>Username : </label>
        <input type="text" placeholder="Enter Username" name="username" required>
        <label>Password : </label>
        <input  type="password" placeholder="Enter Password" name="password" required>
        <label>Name : </label>
        <input  type="text" placeholder="Enter Name" name="Name" required>
        <label >Gender:</label>
        <select name="Gender" id="Gender" >
            <option value="Male">Male</option>
            <option value="Female">Female</option>
        </select>
        <br>
        <button type="submit">SignUp</button>
        <br>
    </div>
</form>
<br/>
<script>

</script>
</body>
</html>
