<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
var teamCaptain=document.f2.teamCaptain.value;
if(teamName!=""&&teamCaptain!=""){
	
}else{
	document.getElementById("nameLocation").innerHtml=alert("please enter proper details");
}
}


</script>
<h1>Update Team Captain with Team Name</h1>
<form action="updateteam.do"name="f2" onsubmit="return validate()">
TeamName:<input type="text" name="teamName"><span id="nameLocation" style="color:red"></span>
TeamCaptain:<input type="text" name="teamCaptain"><span id="nameLocation" style="color:red"></span>
<input type="submit" value="update">

</form>
</body>
</html>