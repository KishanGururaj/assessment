<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function validate(){
var teamName=document.f2.teamName.value;
if(teamName==""){
	document.getElementById("nameLocation").innerHtml=alert("please enter proper details");
}
}


</script>
<form action="deleteteam.do" name="f2" onsubmit="return validate()">
TeamName:<input type="text" name="teamName"><span id="nameLocation" style="color:red"></span>
<input type="submit" value="delete">
</form>
</body>
</html>