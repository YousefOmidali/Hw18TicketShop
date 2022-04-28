<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ticket</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Gender</th>
            <th>Origin</th>
            <th>Destination</th>
            <th>Date</th>
            <th>Hour</th>
            <th>Travel id</th>
        </tr>
        <c:for var="ticket" items="${ticket}">
            <tr>
                <td><c:out value="${ticket.id}" /></td>
                <td><c:out value="${ticket.users.name}" /></td>
                <td><c:out value="${ticket.users.gender}" /></td>
                <td><c:out value="${ticket.travel.origin}" /></td>
                <td><c:out value="${ticket.travel.destination}" /></td>
                <td><c:out value="${ticket.travel.date}" /></td>
                <td><c:out value="${ticket.travel.hour}" /></td>
                <td><c:out value="${ticket.travel.id}" /></td>
            </tr>
        </c:for>
    </table>
</div>
</body>
</html>
