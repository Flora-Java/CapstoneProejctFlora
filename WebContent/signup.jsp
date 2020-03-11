<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Sign Up</title>
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:400,900|Ubuntu|Kalam&display=swap"
	rel="stylesheet">
<!-- CSS Stylesheets -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<!-- Font Awesome -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
<!-- Bootstrap scripts -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<link rel="stylesheet" href="styles.css">
</head>
<body id="signup">
	<div class="container-fluid">
		<nav class="navbar navbar-expand-md fixed-top navbar-light"
			class="navbar-default">
			<a class="navbar-brand" href="#"> <img src="logo1.jpg" width="90"
				height="90" alt="logo"> Mi Jardin
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
					</li>
					<li class="nav-item"><a class="nav-link" href="login.jsp">Sign
							in / Register</a></li>
					<li class="nav-item"><a class="nav-link" href="">Contact us</a>
					</li>
				</ul>
			</div>
		</nav>
	</div>

	<!--Signup form-->

	<form method="post" action="SigningUp" name="myForm">
		<div class="container-fluid">
			<div class="row">
				<div class="well center-block">
					<div class="well-header">
						<h3 class="text-center text-warning">Register Here!</h3>
						<div style="color: white; font-weight: bold; font-size: 1.6rem">${errorMessage1}</div>
						<hr>
					</div>

					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fas fa-user"></i></span>
									</div>
									<input type="text" placeholder="First Name" name="firstname"
										required class="form-control">
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fas fa-user"></i></span>
									</div>
									<input type="text" placeholder="Last Name" name="lastname"
										required class="form-control">
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-xs-12 col-sm-12 col-md-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fas fa-key"></i></span>
									</div>
									<input type="password" placeholder="Password" name="txtpass"
										pattern="^([a-zA-Z0-9]+){8,15}$"
										title="Password must be between 8 to 15 characters. And contain only letters and numbers"
										required class="form-control">
								</div>
							</div>
						</div>
					</div>
			
					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fas fa-phone"></i></span>
									</div>
									<input type="text" size="12" class="form-control" name="phone"
										placeholder="123-456-7890"
										pattern="[1-9]{3}-[0-9]{3}-[0-9]{4}"
										title="Format: 123-456-7890" required>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i
											class="fas fa-envelope"></i></span>
									</div>
									<input type="email" class="form-control" name="email" required
										placeholder="E-Mail">
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i
											class="fas fa-list-alt"></i></span>
									</div>
									<input type="text" placeholder="Address" name="address"
										required class="form-control">

								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i
											class="fas fa-list-alt"></i></span>
									</div>
									<input type="text" name="city" placeholder="City" required
										class="form-control">
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i
											class="fas fa-map-marker"></i></span>
									</div>
									<input type="number" name="zipcode" placeholder="Zipcode"
										pattern="^\d{5}$" required class="form-control">
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<div class="form-group">
								<div class="input-group">
									<div class="input-group-prepend">
										<span class="input-group-text"><i class="fas fa-map-marker-alt"></i></span>
									</div>
									<input type="text" name="state" placeholder="State" required
										class="form-control">
								</div>
							</div>
						</div>
					</div>

					<div class="row widget">
						<div class="col-md-12 col-xs-12 col-sm-12">
							<button class="btn  btn-block "
								style="color: black; background-color: #ffe75e">Submit</button>
						</div>

					</div>
				</div>
			</div>
		</div>
		<!-- btn-warning -->

	</form>
</body>
</html>
