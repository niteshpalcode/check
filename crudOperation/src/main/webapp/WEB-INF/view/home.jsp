<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">

<title>Student Home</title>
</head>
<body>
	<h1 class="text-center">Student Registration</h1>

	<form action="addStudent" method="post">

		<input type="firstName" name="firstName" placeholder="First Name">
		<br>
		<input type="lastName" name="lastName"	placeholder="Last Name"><br> 
		
		<input type="radio"	id="gender" name="gender" value="Male"> 
		
			<label for="Male">Male</label>
		<input type="radio" id="gender" name="gender" value="Female">
		<label for="Male">Female</label><br>
		
		 <input type="email" name="email" placeholder="abc@email.com"><br>
		 
		<input	type="date" name="dateOfBirth"><br> 
		
		<input type="submit" value="Submit">



	</form>



























	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
		crossorigin="anonymous"></script>

</body>
</html>