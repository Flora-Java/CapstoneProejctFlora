<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Cart page</title>
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
<link rel="stylesheet" href="styles1.css">
</head>
<body>

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
					<li class="nav-item"><a class="nav-link" style="color: black">${user}</a></li>
					<li class="nav-item"><a class="nav-link" href="checkout.jsp">Checkout</a></li>
				</ul>
			</div>
		</nav>
	</div>

	<div class="container">
		<div class="row">
			<div class="column-md-12">
				<h2 style="margin-top: 150px; margin-bottom: 35px">My Shopping
					Cart</h2>
			</div>
			<div class="column-md-12"></div>
			<table class="table table-striped text-center" style="background-color:white">
				<thead class="thead-dark">
				<thead>
					<tr>
						<th scope="col">Quantity</th>
						<th></th>
						<th scope="col">Name</th>
						<th scope="col">Price</th>
						<th scope="col">Total</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach var="cart" items="${cartList}">
						<tr>
							<td width="60px"><input type="number" name="quantity"
								min="0" placeholder="1" class="form-control"></td>
							<td style="vertical-align: middle;"80""><form method="post"
									action="UpdateItem">
									<input type="hidden" name="selection" value="">
									<button class="btn" style="color: black; background-color: #ffe75e">
										<i class="far fa-edit"></i> Update</button>
								</form></td>
							<td style="vertical-align: middle;"80"">"${cart.description}"</td>
							<td style="vertical-align: middle;"80"">"$${cart.price}"</td>
							<td style="vertical-align: middle;"80"">"$${cart.total}"</td>
							<td style="vertical-align: middle;"80""><form method="post"
									action="DeleteItem">
									<input type="hidden" name="selection" value="">
									<button class="btn" style="color: black; background-color: #ffe75e">
										<i class="fa fa-trash"></i> Delete
									</button>
								</form></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="col-md-12 text-right"">
				<button type="button" class="btn " style="color: black; background-color: #ffe75e" onclick="window.location.href = checkout.jsp" >Checkout</button>
			</div>
		</div>
	</div>

</body>
</html>