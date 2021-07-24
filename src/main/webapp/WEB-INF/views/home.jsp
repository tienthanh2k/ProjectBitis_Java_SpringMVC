<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css' />" />
</head>
<body>
	<!-- Phần top -->
	<div class="top">
		<div class="container">
			<div class="giohang">
				<a href="#">
					<img src="<c:url value='/resources/img/shopping-cart-black.png' />" alt="gio hang" />
				</a> 
				<a href="#">
					<p>Empty cart</p>
				</a>
			</div>
		</div>
	</div>
	<!-- Kết thúc top -->

	<!-- Phần logo -->
	<div class="logo">
		<a href="#trangchu"><h1>LUXURY WATCHES</h1></a>
	</div>
	<!-- Kết thúc logo -->

	<!-- Phần menu -->
	<div class="menu">
		<div class="container">
			<div id="divLeft">
				<ul>
					<li><a class="active" href="#list">Home</a></li>
					<li><a href="#list">Men</a></li>
					<li><a href="#list">Wonmen</a></li>
					<li><a href="#list">Kids</a></li>
					<li><a href="#list">Blog</a></li>
					<li><a href="#list">Contact</a></li>
				</ul>
			</div>
			<div id="divRight">
				<form action="#">
					<input type="submit" id="btnSubmit" value /> <input type="text"
						placeholder="Search" id="txtSearch" />
				</form>
			</div>
		</div>
	</div>
	<!-- Kết thúc menu -->

	<!-- Phần banner -->
	<div class="banner">
		<img src="<c:url value='/resources/img/banner-2.png' />" alt="banner-1" />
	</div>
	<!-- Kết thúc banner -->

	<!-- Phần 3 mục tiêu biểu -->
	<div class="about">
		<div class="container">
			<div class="hinhnoibat">
				<img src="<c:url value='/resources/img/spnb1.jpg' />" alt="hinh noi bat 1" />
			</div>

			<div class="hinhnoibat">
				<img src="<c:url value='/resources/img/spnb2.jpg' />" alt="hinh noi bat 2" />
			</div>

			<div class="hinhnoibat">
				<img src="<c:url value='/resources/img/spnb3.jpg' />" alt="hinh noi bat 3" />
			</div>
		</div>
	</div>

	<div class="product">
		<div class="container">
			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>

			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>
			
			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>
			
			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>
			
			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>
			
			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>
			
			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>
			
			<div class="oneproduct">
				<div class="hinhsp">
					<img src="<c:url value='/resources/img/p-1.png' />" alt="San pham" />
				</div>

				<div class="thongtinsp">
					<span>SMART WATCHES</span><br /> <span>Xem thử</span>
					<div>
						<img src="<c:url value='/resources/img/shopping-cart-2.png' />" alt="dat mua" /> <span><b>$
								350</b></span>
					</div>
				</div>
			</div>
			
			
		</div>
	</div>
	<!-- Kết thúc 3 mục tiêu biểu -->

	<div class="information">
		<div class="container">
			<div class="infor">
				<h2>Follow Us</h2>
				<ul>
					<li><a href="#"> <span id="facebook"><img
								src="<c:url value='/resources/img/facebook.png' />" alt="facebook" /></span> Facebook
					</a></li>
					<li><a href="#"> <span id="twitter"><img
								src="<c:url value='/resources/img/twitter.png' />" alt="twitter" /></span> Twitter
					</a></li>
					<li><a href="#"> <span id="google"><img
								src="<c:url value='/resources/img/google.png' />" alt="google" /></span> Google+
					</a></li>
				</ul>
			</div>
			<div class="infor">
				<h2>Follow Us</h2>
				<ul>
					<li><a href="#"> Special </a></li>
					<li><a href="#"> New Product </a></li>
					<li><a href="#"> Our store </a></li>
					<li><a href="#"> Contact us </a></li>
				</ul>
			</div>
			<div class="infor">
				<h2>Follow Us</h2>
				<ul>
					<li><a href="#"> Special </a></li>
					<li><a href="#"> New Product </a></li>
					<li><a href="#"> Our store </a></li>
					<li><a href="#"> Contact us </a></li>
				</ul>
			</div>
			<div class="infor">
				<h2>Follow Us</h2>
				<ul>
					<li><a href="#"> Special </a></li>
					<li><a href="#"> New Product </a></li>
					<li><a href="#"> Our store </a></li>
					<li><a href="#"> Contact us </a></li>
				</ul>
			</div>
		</div>

	</div>

	<div class="footer">
		<div class="footerLeft">© 2015 Luxury Watches. All Rights
			Reserved | Design by W3layouts</div>
		<div class="footerRight">© 2015 Luxury Watches. All Rights
			Reserved | Design by W3layouts</div>
	</div>
</body>
</html>