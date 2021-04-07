<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Click on sumbit to get data</title>
</head>
<body>
<table>
<thead>
<tr>
<th>BookId</th>
<th>BookName</th>
<th>BookPrice</th>
<th>BookAuthor</th>

<th>Update</th>
<th>Delete</th>

</tr>
</thead>
<tbody>
<c:forEach var="book" items="${bookList}">
<tr>
<td>${book.getBookId()}</td>
<td>${book.getBookName()}</td>
<td>${book.getPrice()}</td>
<td>${book.getBookAuthor()}</td>
<td><a href="updatebook.jsp">edit</a>
<td><a href="deletebook.jsp">delete</a>
</tr>
</c:forEach>
</tbody>

</table>
</body>
</html>