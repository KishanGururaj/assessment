<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
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
<body style="font-size:150%;text-align:center;background-image: url('lib-addbook.jpeg');background-repeat:no-repeat;
background-attachment:fixed;background-size: cover">
<script type="text/javascript">
	function validate(){
			var id=document.f1.book_id.value;
			var name=document.f1.book_name.value;
			var author=document.f1.book_author.value;
			var price=document.f1.book_price.value;
			var status =false;
            if(name==""&&author==""&&id==""&&price==""){
                    document.getElementById("namelocation").innerHTML=alert("Please enter proper details ");
                    status=false;
            }
            else{
               // document.getElementById("namelocation").innerHTML=alert(" correct");
                status =true;

            }
            return status;

		}




</script>
	<form name="f1" action="addbook" method="get" onsubmit="return validate()">

		<h1>Add Book Details</h1>

		<fieldset>
			<legend>Add account info</legend>
			<label for="name">Book id:</label> 
			<input type="text" id="name" name="book_id">
			<span id="namelocation" style="color:steelblue;"></span><br>
			<label for="name">Book Name:</label> 
			<input type="text" id="name" name="book_name">
			<span id="namelocation1" style="color:steelblue;"></span><br> 
			<label for="name">Book Price:</label> 
			<input type="text" id="name" name="book_price"> 
			<span id="namelocation2" style="color:steelblue;"></span><br>
			<label for="name">Author Name:</label> 
			<input type="text" id="name" name="book_author">
			<span id="namelocation3" style="color:steelblue;"></span><br> 
			<input type="submit" value="add ">
		</fieldset>
	</form>


</body>
</html>