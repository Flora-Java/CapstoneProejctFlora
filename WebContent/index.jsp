<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title>Home Page</title>
  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Montserrat:400,900|Ubuntu|Kalam&display=swap" rel="stylesheet">
  <!-- CSS Stylesheets -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  <!-- Font Awesome -->
  <script defer src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
  <!-- Bootstrap scripts -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="styles.css">
</head>

<body>
  <div class="container-fluid">
  <nav class="navbar navbar-expand-md fixed-top navbar-light" class="navbar-default">
    <a class="navbar-brand" href="#">
      <img src="logo1.jpg" width="90" height="90" alt="logo"> Mi Jardin</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link" href="contactUs.jsp">Contact us</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Sign in / Register</a>
        </li>
      </ul>
    </div>
  </nav>
  </div>
  <!--Carousel Wrapper-->

  <div id="carousel-indexpage" class="carousel slide" style="max-width: 700px;  margin: 160px auto;" data-ride="carousel">
    <!--Indicators-->
    <ol class="carousel-indicators">
      <li data-target="#carousel-indexpage" data-slide-to="0" class="active"></li>
      <li data-target="#carousel-indexpage" data-slide-to="1"></li>
      <li data-target="#carousel-indexpage" data-slide-to="2"></li>
    </ol>
    <!--/.Indicators-->
    <!--Slides-->
    <div class="carousel-inner" height: 600px; role="listbox">
      <div class="carousel-item active img-fluid">
        <div class="view">
          <img class="d-block w-80" style="max-width: 700px; max-height: 550px; margin: 0 auto;" src="mini-cactus.jpg" alt="Cactus">
          <div class="mask rgba-black-light"></div>
        </div>
        <div class="carousel-caption">
          <h3 class="h3-responsive">Welcome!! Cactus, your best pick!</h3>
          <!-- <p>First text</p> -->
        </div>
      </div>
      <div class="carousel-item img-fluid">
        <!--Mask color-->
        <div class="view">
          <img class="d-block w-80" style="max-width: 700px; max-height: 550px; margin: 0 auto;" src="spring.jpg" alt="Tulips">
          <div class="mask rgba-black-strong"></div>
        </div>
        <div class="carousel-caption">
          <h3 class="h3-responsive">Decoration in an instant!</h3>
          <!-- <p>Secondary text</p> -->
        </div>
      </div>
      <div class="carousel-item img-fluid">
        <!--Mask color-->
        <div class="view">
          <img class="d-block w-80" style="max-width: 700px; max-height: 550px; margin: 0 auto;" src="people.jpg" alt="Restaurant">
          <div class="mask rgba-black-slight"></div>
        </div>
        <div class="carousel-caption">
          <h3 class="h3-responsive">Plants fit everywhere!</h3>
        </div>
      </div>
    </div>
    <!--/.Slides-->
    <!--Controls-->
    <a class="carousel-control-prev" href="#carousel-example-2" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carousel-example-2" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
    <!--/.Controls-->

  </div>

  <!--/.Carousel Wrapper-->

</body>

</html>
