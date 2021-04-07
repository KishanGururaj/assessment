<html>
<body>
<h2>Hello World!</h2>
<script type="text/javascript">
function validate(){
var teamId=document.f2.teamId.value;
var teamName=document.f2.teamName.value;
var teamGround=document.f2.teamGround.value;
var teamCaptain=document.f2.teamCaptain.value;
if(teamId!=""&&teamName!=""&&teamGround!=""&&teamCaptain!=""){
	
}
else{
	document.getElementById("nameLocation").innerHtml=alert("please enter proper details");

	}
}


</script>
<form action="addteam.do"name="f2" onsubmit="return validate()">
IplTeamId:<input type="text"name="teamId"><span id="nameLocation" style="color:red"></span>
IplTeamName:<input type="text" name="teamName"><span id="nameLocation" style="color:red"></span>
IplTeamGround:<input type="text" name="teamGround"><span id="nameLocation" style="color:red"></span>
IplTeamCaptain:<input type="text" name="teamCaptain"><span id="nameLocation" style="color:red"></span>
<input type="submit" value="register">

</form>
</body>
</html>
