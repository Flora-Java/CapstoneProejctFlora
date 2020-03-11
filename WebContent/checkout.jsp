<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Checkout</title>
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
					<li class="nav-item"><a class="nav-link" style="color: yellow">${user}</a></li>

					<li class="nav-item"><a class="nav-link" href="contactUs.jsp">Contact
							us</a></li>
				</ul>
			</div>
		</nav>
	</div>

	<!--Signup form-->

	<form method="post" action="CheckingOut" name="myForm">
		<div class="container-fluid">
			<div class="row">
				<div class="container ">

					<!-- Heading -->
					<div class="column-md-12">
						<h2 style="margin-top: 150px; margin-bottom: 35px">Checkout
							Form</h2>
					</div>


					<!--Grid row-->
					<div class="row checkout">

						<!--Grid column-->
						<div class="col-md-8 mb-4">

							<!--Card-->
							<div class="card" style="font-size: 2vw">

								<!--Card content-->
								<form class="card-body">

									<!--Grid row-->
									<div class="row">

										<!--Grid column-->
										<div class="col-md-6 mb-2">

											<!--firstName-->
											<div class="md-form ">
												<input type="text" name="firstName" id="firstName" class="form-control"
													required> <label for="firstName" class="">First
													name</label>
											</div>

										</div>
										<!--Grid column-->

										<!--Grid column-->
										<div class="col-md-6 mb-2">

											<!--lastName-->
											<div class="md-form">
												<input type="text" id="lastName" class="form-control"
													required> <label for="lastName" class="">Last
													name</label>
											</div>

										</div>
										<!--Grid column-->

									</div>
									<!--Grid row-->

									<!--email-->
									<div class="md-form mb-5">
										<input type="text" id="email" class="form-control"
											placeholder="youremail@example.com" required> <label
											for="email" class="">Email</label>
									</div>

									<!--address-->
									<div class="md-form mb-5">
										<input type="text" id="address" class="form-control"
											placeholder="1234 Main St" required> <label
											for="address" class="">Address</label>
									</div>


									<!--Grid row-->
									<div class="row">

										<!--Grid column-->
										<div class="col-lg-4 col-md-12 mb-4">

											<label for="country">Country</label> <select
												class="custom-select d-block w-100" id="country" required>
												<option value="">Choose...</option>
												<option>United States</option>
												<option>Canada</option>

											</select>
											<div class="invalid-feedback">Please select a valid
												country.</div>

										</div>
										<!--Grid column-->

										<!--Grid column-->
										<div class="col-lg-4 col-md-6 mb-4">

											<label for="state">State</label> <select
												class="custom-select d-block w-100" id="state" required>
												<option value="">Choose...</option>
												<option value="AL">Alabama</option>
												<option value="AK">Alaska</option>
												<option value="AZ">Arizona</option>
												<option value="AR">Arkansas</option>
												<option value="CA">California</option>
												<option value="CO">Colorado</option>
												<option value="CT">Connecticut</option>
												<option value="DE">Delaware</option>
												<option value="DC">District Of Columbia</option>
												<option value="FL">Florida</option>
												<option value="GA">Georgia</option>
												<option value="HI">Hawaii</option>
												<option value="ID">Idaho</option>
												<option value="IL">Illinois</option>
												<option value="IN">Indiana</option>
												<option value="IA">Iowa</option>
												<option value="KS">Kansas</option>
												<option value="KY">Kentucky</option>
												<option value="LA">Louisiana</option>
												<option value="ME">Maine</option>
												<option value="MD">Maryland</option>
												<option value="MA">Massachusetts</option>
												<option value="MI">Michigan</option>
												<option value="MN">Minnesota</option>
												<option value="MS">Mississippi</option>
												<option value="MO">Missouri</option>
												<option value="MT">Montana</option>
												<option value="NE">Nebraska</option>
												<option value="NV">Nevada</option>
												<option value="NH">New Hampshire</option>
												<option value="NJ">New Jersey</option>
												<option value="NM">New Mexico</option>
												<option value="NY">New York</option>
												<option value="NC">North Carolina</option>
												<option value="ND">North Dakota</option>
												<option value="OH">Ohio</option>
												<option value="OK">Oklahoma</option>
												<option value="OR">Oregon</option>
												<option value="PA">Pennsylvania</option>
												<option value="RI">Rhode Island</option>
												<option value="SC">South Carolina</option>
												<option value="SD">South Dakota</option>
												<option value="TN">Tennessee</option>
												<option value="TX">Texas</option>
												<option value="UT">Utah</option>
												<option value="VT">Vermont</option>
												<option value="VA">Virginia</option>
												<option value="WA">Washington</option>
												<option value="WV">West Virginia</option>
												<option value="WI">Wisconsin</option>
												<option value="WY">Wyoming</option>
											</select>
											<div class="invalid-feedback">Please provide a valid
												state.</div>

										</div>
										<!--Grid column-->

										<!--Grid column-->
										<div class="col-lg-4 col-md-6 mb-4">

											<label for="zip">Zip</label> <input type="number"
												class="form-control" id="zip" placeholder="" required>
											<div class="invalid-feedback">Zip code required.</div>

										</div>
										<!--Grid column-->

									</div>
									<!--Grid row-->



									<!--  <div class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="same-address">
                <label class="custom-control-label" for="same-address">Shipping address is the same as my billing address</label>
              </div>
              <div class="custom-control custom-checkbox">
                <input type="checkbox" class="custom-control-input" id="save-info">
                <label class="custom-control-label" for="save-info">Save this information for next time</label>
              </div>
 -->

									<div class="d-block my-3">
										<div class="custom-control custom-radio">
											<input id="credit" name="paymentMethod" type="radio"
												class="custom-control-input" checked required> <label
												class="custom-control-label" for="credit">Credit
												card</label>
										</div>
										<div class="custom-control custom-radio">
											<input id="debit" name="paymentMethod" type="radio"
												class="custom-control-input" required> <label
												class="custom-control-label" for="debit">Debit card</label>
										</div>
										<div class="custom-control custom-radio">
											<input id="paypal" name="paymentMethod" type="radio"
												class="custom-control-input" required> <label
												class="custom-control-label" for="paypal">Paypal</label>
										</div>
									</div>
									<div class="row">
										<div class="col-md-6 mb-3">
											<label for="cc-name">Name on card</label> <input type="text"
												class="form-control" id="cc-name" placeholder="" required>
											<small class="text-muted">Full name as displayed on
												card</small>
											<div class="invalid-feedback">Name on card is required</div>
										</div>
										<div class="col-md-6 mb-3">
											<label for="cc-number">Credit card number</label> <input
												type="number" class="form-control" id="cc-number"
												placeholder="" required>
											<div class="invalid-feedback">Credit card number is
												required</div>
										</div>
									</div>
									<div class="row">
										<div class="col-md-3 mb-3">
											<label for="cc-expiration">Expiration</label> <input
												type="text" class="form-control" id="cc-expiration"
												placeholder="" required>
											<div class="invalid-feedback">Expiration date required</div>
										</div>
										<div class="col-md-3 mb-3">
											<label for="cc-expiration">CVV</label> <input type="number"
												class="form-control" id="cc-cvv" placeholder="" required
												min="000" max="999">
											<div class="invalid-feedback">Security code required</div>
										</div>
									</div>
									<hr class="mb-4">
									<button class="btn  btn-lg btn-block"
										style="color: black; background-color: #ffe75e" type="submit">Continue
										to checkout</button>

								</form>

							</div>
							<!--/.Card-->

						</div>
						<!--Grid column-->

						<!--Grid column-->
						<div class="col-md-4 mb-4">

							<!-- Heading -->
							<!-- <h4 class="d-flex justify-content-between align-items-center mb-3">
            <span class="text-muted">Your cart</span>
            <span class="badge badge-secondary badge-pill">3</span>
          </h4>

          Cart
          <ul class="list-group mb-3 z-depth-1">
            <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0">Product name</h6>
                <small class="text-muted">Brief description</small>
              </div>
              <span class="text-muted">$12</span>
            </li>
            <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0">Second product</h6>
                <small class="text-muted">Brief description</small>
              </div>
              <span class="text-muted">$8</span>
            </li>
            <li class="list-group-item d-flex justify-content-between lh-condensed">
              <div>
                <h6 class="my-0">Third item</h6>
                <small class="text-muted">Brief description</small>
              </div>
              <span class="text-muted">$5</span>
            </li>
            <li class="list-group-item d-flex justify-content-between bg-light">
              <div class="text-success">
                <h6 class="my-0">Promo code</h6>
                <small>EXAMPLECODE</small>
              </div>
              <span class="text-success">-$5</span>
            </li>
            <li class="list-group-item d-flex justify-content-between">
              <span>Total (USD)</span>
              <strong>$20</strong>
            </li>
          </ul> -->
							<!-- Cart -->


						</div>
						<!--Grid column-->

					</div>
					<!--Grid row-->

				</div>
			</div>
		</div>

	</form>
</body>
</html>