<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Click on submit to get data</title>
</head>
<body>
<table>
<thead>
<tr>
<th>TeamId</th>
<th>TeamName</th>
<th>TeamGround</th>
<th>TeamCaptain</th>

<th>Update</th>
<th>Delete</th>

</tr>
</thead>
<tbody>
<c:forEach var="team" items="${teamList}">
<tr>
<td>${team.getTeamId()}</td>
<td>${team.getTeamName()}</td>
<td>${team.getTeamGround()}</td>
<td>${team.getTeamCaptain()}</td>
<td><a href="update.jsp">edit</a>
<td><a href="delete.jsp">delete</a>
</tr>
</c:forEach>
</tbody>

</table>
</body>
</html>