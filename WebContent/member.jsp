<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Members Page</title>
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
	<%-- <c:if test="${session == null}">
		<jsp:forward page="/notloggedin.jsp"></jsp:forward>
	</c:if>  --%>

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
					<li class="nav-item"  ><a class="nav-link" style="color:yellow">${user}</a></li>
					<li class="nav-item"><a class="nav-link" href="">Contact us</a>
					</li>
				</ul>
			</div>
		</nav>
	</div>

	<!-- Pagination -->


	<div class="container" style="padding-top: 170px;">
		<div class="jumbotron " style="text-align: center">
			<h1>
				Welcome to <span class="badge badge-success">Mi Jardin!</span>
			</h1>
			<h5>Offering you a great selection in plants.</h5>
		</div>
	</div>

	<!-- Displaying item from product -->

	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h2 style="margin-bottom: 20px">Our products</h2>
				<p>Hover on the image to enlarge it</p>

			</div>
			<div class="col-md-12">
				<table class="table table-bordered text-center" >
					<thead>
						<tr>
							<th scope="col">Image</th>
							<th scope="col">Name</th>
							<th scope="col">Price</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="prod" items="${prodlist}">
							<tr>
								
								<td width="150px"><img src="${prod.imageUrl}" alt="picture"
									width="100%"></td>
								<td style="vertical-align: middle">${prod.description}</td>
								<td style="vertical-align: middle">$${prod.price}</td>
								<td width="80" style="vertical-align: middle"><form
										method="post" action="Confirm">
										<input type="hidden" name="selection"
											value="${prod.productId}"> <input class="btn" style="color: black; background-color: #ffe75e" type="submit"
											value="Add to Cart">
									</form></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-md-12 text-right"">
				<button type="button" class="btn " style="color: black; background-color: #ffe75e" >Checkout</button>
			</div>
		</div>
	</div>


</body>

</html>
