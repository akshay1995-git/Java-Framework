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
<body >
<span class="border border-success">
	<h1 align="center" class="text-success"><b>Add New Course</b></h1>
	<div class="container my-5 border border-success">
		<!-- form action for where to pass that data after submitting action -->
		<!-- "/verify" is request mapped in controller to get data show further result -->
		<!-- Placed relative URL in action  -->
		<form action="verify_course" method="post">
			<div class="form-group">
				<label for="coursename"><b>Name of Course</b></label> <input
					type="text" class="form-control" id="coursename"
					placeholder="Enter a course" name="course_name" />
			</div>
			<div class="form-group">
				<label for="courseduration"><b>Course Duration</b></label> <input
					type="number" class="form-control" id="courseduration"
					 placeholder="Enter Course Duration" name="course_duration">
			</div>
			<div class="form-group">
				<label for="fees"><b>Course Fees</b></label> <input
					type="number" step="0.01" class="form-control" id="fees"
					placeholder="Enter Course Fees" name="course_fees">
			</div>
			<div class="form-group">
				<label for="teacher"><b>Course Teacher</b></label> <input
					type="text" class="form-control" id="teacher"
					 placeholder="Enter Course Teacher" name="course_teacher">
			</div>
			<div class="container my-5 text-center">
				<button type="submit" class="btn btn-success">Add Course</button>
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
		</span>
</body>
</html>