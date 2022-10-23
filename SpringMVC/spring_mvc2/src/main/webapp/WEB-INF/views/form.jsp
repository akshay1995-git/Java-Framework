<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>form</title>
</head>
<body>
	<h1>Hello Welcome to Your Application</h1>
	<div class="container my-5">
		<!-- form action for where to pass that data after submitting action -->
		<!-- "/verify" is request mapped in controller to get data show further result -->
		<!-- Placed relative URL in action  -->
		<form action="verify" method="post">
			<div class="form-group">
				<label for="exampleInputname"><b>Name of Applicant</b></label> <input
					type="text" class="form-control" id="exampleInputname"
					placeholder="Enter Your Name" name="name" />
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1"><b>Email address</b></label> <input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email">
			</div>
			<div class="form-group">
				<label for="exampleInputPassword1"><b>Password</b></label> <input
					type="password" class="form-control" id="exampleInputPassword1"
					placeholder="Password" name="password">
			</div>
			<div class="form-group">
				<label for="dob"><b>Birth date</b></label> <input type="date"
					id="dob" name="dob" value="2018-07-22" min="2018-01-01"
					max="2018-12-31"> <label for="inputphone"><b>Phone
						No </b></label> <input type="number" id="inputphone"
					placeholder="Mobile Number" name="phone">
			</div>
			<div class="form-group">
				<label for="gender"><b>Gender </b></label><br> <input
					type="radio" id="gender" name="gender" value="Male">   <label
					for="html">Male</label><br> <input type="radio" id="gender"
					name="gender" value="Female">   <label for="html">Female</label><br>
				<input type="radio" id="gender" name="gender" value="Transgender">
				  <label for="html">Transgender</label><br>
			</div>
			<div>
			<label for="courses"><b>Courses</b></label><br> 
			<input type="checkbox" id="course" name="course" value="C"/>    
                 <label>C</label> <br>    
              <input type="checkbox" id="course" name="course" value="Java" checked=?yes?/>    
                 <label>Java</label> <br>    
              <input type="checkbox" id="course" name="course" value="Python"/>    
                 <label>Python</label> <br>  
         <input type="checkbox" id="course" name="course" value="PHP"/>    
                 <label>PHP</label>  
			</div>












			<div class="container my-5 text-center">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>