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

	<form method="post">
		<table style="background-color: lightgrey; margin: auto" class="border border success">
			<tr>
				<td><label for="InputEmail1"><b>Email address</b></label></td>
				<td><div class="form-group">
				 <input
					type="email" class="form-control" id="InputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email">
			</div></td>
			</tr>
			<tr>
				<td><label for="InputPassword1"><b>Password</b></label> </td>
				<td><div class="form-group">
				<input
					type="password" class="form-control" id="InputPassword1"
					placeholder="Password" name="password">
			</div></td>
			</tr>

			<tr>
				<td>
				<button type="submit" class="btn btn-success" formaction="login">Log In</button>
			</td>
			<td align="right">
			
				<button type="submit" class="btn btn-success" formaction="signup">Sign Up!</button>
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