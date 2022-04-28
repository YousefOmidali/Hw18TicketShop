<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ticket shop</title>
</head>
<body>
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




<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Tickets</h2></caption>
        <tr>
            <th>Ticket ID</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Date</th>
            <th>Hour</th>
        </tr>
        <c:forEach var="travel" items="${travelList}">
            <tr>
                <td><c:out value="${travel.id}" /></td>
                <td><c:out value="${travel.origin}" /></td>
                <td><c:out value="${travel.destination}" /></td>
                <td><c:out value="${travel.date}" /></td>
                <td><c:out value="${travel.hour}" /></td>
                <td>
<%--                    <a href="buy?id=<c:out value='${travel.id}' />"> Buy </a>--%>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <form action="buy" method="post">
        <div class="container">
            <label>travel id : </label>
            <input type="text" placeholder="Enter travel id" name="travel_id" required>
            <label>Password : </label>
            <input  type="your id: " placeholder="Enter your id" name="your_id" required>
            <button type="submit">Login</button>
            <br>
        </div>
    </form>
</div>
</body>
</html>
