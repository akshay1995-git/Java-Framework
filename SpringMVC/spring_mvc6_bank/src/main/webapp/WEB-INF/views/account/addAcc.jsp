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

<title>home</title>
</head>
<body>
	<h1 align="center">Log In</h1>

	<form method="post" action="show">
		<table style="background-color: lightgrey; margin: auto"
			class="border border success">
			<tr>
					<div class="form-group">
						<label for="accountNo"><b>Account Number :</b></label> <input
							type="text" class="form-control" id="accountNo"
							placeholder="Enter Account Number" name="accNo" />
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<label for="accountType"><b>Account Type :</b></label> <input
							type="email" class="form-control" id="accountType"
							 placeholder="Enter Account Type"
							name="type">
					</div>
				</tr>
				<tr>
					<div class="form-group">
						<label for="accountBalence"><b>Add Balence :</b></label> <input
							type="number" class="form-control" step="0.1" id="accountBalence"
							 placeholder="Enter Account Type"
							name="type">
					</div>
				</tr>
			
			
			<tr>
				<td>
					<button type="submit" class="btn btn-success" formaction="showinfo">submit</button>
				</td>
			</tr>
		</table>
	</form>


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