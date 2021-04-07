<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update-form</title>
<link href='https://fonts.googleapis.com/css?family=Nunito:400,300'
	rel='stylesheet' type='text/css'>


<style>
.header {
	background-color: yellow;
	text-align: center;
}

.footer {
	background-color: tomato;
	text-align: center;
}

.fieldset {
	margin-bottom: 30px;
	border: none;
}

.legend {
	font-size: 1.4em;
	margin-bottom: 10px;
}

.label {
	display: block;
	margin-bottom: 5px;
}

.label.light {
	font-weight: 300;
	display: inline;
}
</style>
</head>
<body style="font-size:150%;text-align:center;background-image: url('lib-update.jpg');background-repeat:no-repeat;
background-attachment:fixed;background-size: cover">
<script type="text/javascript">
	function validate(){
			var name=document.f1.book_name.value;
			var author=document.f1.book_author.value;
			var status =false;
            if(name==""&&author==""){
                    document.getElementById("namelocation").innerHTML=alert("Please enter proper details ");
                    status=false;
            }
            else{
                document.getElementById("namelocation").innerHTML=" correct";
                status =true;

            }
            return status;

		}




</script>
	<form name="f1"action="updatebook" method="get" onsubmit="return validate()">

		<h1>Update Book Details</h1>

		<fieldset>
			<legend>Update account info</legend>
			<label for="name">Book Name:</label> 
			<input type="text" id="name" name="book_name"> 
			<span id="namelocation" style="color:steelblue;"></span><br>
			
			<label for="name">New Author Name:</label> 
			<input type="text" id="name" name="book_author">
			<span id="namelocation1" style="color:steelblue;"></span><br>
			 
			<input type="submit" value="update ">
		</fieldset>
	</form>


</body>
</html>