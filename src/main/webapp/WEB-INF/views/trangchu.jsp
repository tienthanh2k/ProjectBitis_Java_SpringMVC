<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
</head>
<link href="<c:url value='/resources/home/css/bootstrap.css' />"
	rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<c:url value='/resources/home/js/jquery.min.js' />"></script>
<!-- Custom Theme files -->
<link href="<c:url value='/resources/home/css/style.css' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<script type="application/x-javascript">
	

	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 


</script>
<!--webfont-->
<!-- for bootstrap working -->
<script type="text/javascript"
	src="<c:url value='/resources/home/js/bootstrap-3.1.1.min.js' />"></script>
<!-- //for bootstrap working -->
<!-- cart -->
<script src="<c:url value='/resources/home/js/simpleCart.min.js' />">
	
</script>
<!-- cart -->
<link rel="stylesheet"
	href="<c:url value='/resources/home/css/flexslider.css' />"
	type="text/css" media="screen" />
<body>
	<!-- header-section-starts -->
	<div class="header">
		<div class="header-top-strip">
			<div class="container">
				<div class="header-top-left">
					<c:if test="${user != null}">
						<div id="div_tendangnhap">
							<div class="btn-group">
								<button type="button" id="tendangnhap" class="dropdown-toggle"
									data-toggle="dropdown">
									<span>Wellcome <strong id="tendangnhap">${user.tenKH}</strong></span><span
										class="caret"></span>
								</button>
								<ul class="dropdown-menu">
									<li><a href="<c:url value='/khachhang' />">Thông tin tài khoản</a></li>
									<li><a href="<c:url value='/logout' />">Đăng xuất</a></li>
								</ul>
							</div>
						</div>

					</c:if>
					<c:if test="${user == null}">
						<ul>
							<li><a href="<c:url value='/login' />"><span
									class="glyphicon glyphicon-user"> </span>Login</a></li>
						</ul>
					</c:if>
				</div>

				<div class="header-right">
					<div class="cart box_1">
						<a href="checkout.html">
							<h3>
								<a href="<c:url value='/chitietgiohang' />"><span
									class="glyphicon glyphicon-shopping-cart" style="color: white;">
							</h3>
						</a>
						<p id="giohang">
							<c:if test="${soluongsanphamgiohang > 0 }">
									<span style="color: white;">${soluongsanphamgiohang }</span>
							</c:if>
							<c:if test="${soluongsanphamgiohang <= 0 || soluongsanphamgiohang == null}">
								<span style="color: white;">Empty cart</span>
							</c:if>
						</p>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- header-section-ends -->
	<div class="banner-top">
		<div class="container">
			<div class="row">
				<nav class="navbar navbar-default col-md-9" role="navigation">
					<div class="container-fluid">
						<div class="row">
							<div class="col-md-3">
								<button type="button" class="navbar-toggle"
									data-toggle="collapse"
									data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span> <span
										class="icon-bar"></span> <span class="icon-bar"></span> <span
										class="icon-bar"></span>
								</button>
								<div class="logo">
									<h1>
										<a href="trang-chu"><span>Bitis</span></a>
									</h1>
								</div>
							</div>
							<!--/.navbar-header-->

							<div class="collapse navbar-collapse col-md-9"
								id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<li><a href="trang-chu">Home</a></li>
									<c:forEach var="item" items="${listDanhMucs}">
										<li><a href="danhmuc/${item.maDanhMuc}">${item.tenDanhMuc}</a></li>
									</c:forEach>
								</ul>
							</div>

						</div>
					</div>
					<!--/.navbar-collapse-->
				</nav>
				<div class="col-md-3" id="divSearch">
					<input type="text" />
					<button id="btn-search" class="btn btn-default">Search</button>
				</div>
			</div>
			<!--/.navbar-->
		</div>
	</div>
	
	<div class="banner">
		<div class="container">
			<div class="banner-bottom">
				<div class="banner-bottom-left">
					<h2>
						B<br>I<br>T<br>I<br>S
					</h2>
				</div>
				<div class="banner-bottom-right">
					<div class="callbacks_container">
						<ul class="rslides" id="slider4">
							<li>
								<div class="banner-info">
									<h3>Smart But Casual</h3>
									<p>Start your shopping here...</p>
								</div>
							</li>
							<li>
								<div class="banner-info">
									<h3>Shop Online</h3>
									<p>Start your shopping here...</p>
								</div>
							</li>
							<li>
								<div class="banner-info">
									<h3>Pack your Bag</h3>
									<p>Start your shopping here...</p>
								</div>
							</li>
						</ul>
					</div>
					<!--banner-->
					<script
						src="<c:url value='/resources/home/js/responsiveslides.min.js' />"></script>
					<script>
						// You can also use "$(window).load(function() {"
						$(function() {
							// Slideshow 4
							$("#slider4")
									.responsiveSlides(
											{
												auto : true,
												pager : true,
												nav : false,
												speed : 500,
												namespace : "callbacks",
												before : function() {
													$('.events')
															.append(
																	"<li>before event fired.</li>");
												},
												after : function() {
													$('.events')
															.append(
																	"<li>after event fired.</li>");
												}
											});

						});
					</script>
				</div>
				<div class="clearfix"></div>
			</div>

		</div>
	</div>

	<!-- content-section-starts-here -->
	<div class="container">
		<!-- <div class="main-content">

			<div class="products-grid">
				<header>
					<h3 class="head text-center">Latest Products</h3>
				</header>

				<c:forEach var="item" items="${listSanPhams}">
					<div class=" col-md-4 product simpleCart_shelfItem text-center"
						id="${item.maSanPham}">
						<a href="#"><img class="img-responsive"
							src="<c:url value='/resources/img/${item.hinhAnh}' />" alt="" /></a>
						<div class="mask">
							<a href="single.html">Quick View</a>
						</div>
						<a class="product_name" href="single.html">${item.tenSanPham}</a>
						<p>
							<a class="item_add" href="#"><i></i> <span class="item_price">${item.donGia}</span></a>
						</p>
					</div>
				</c:forEach>
				<div class="clearfix"></div>
			</div>
		</div> -->

		<header>
			<h3 class="head text-center" style="margin: 50px 0 30px 0">Danh
				sách sản phẩm</h3>
		</header>

		<div class="row">
			<c:forEach var="item" items="${listSanPhams}">
				<div class="col-md-3 col-sm-12 text-center thongtinsanpham" id="${item.maSanPham}">
					<a href="<c:url value='/sanpham/${item.maSanPham}' />"><img class="img-responsive"
						src="<c:url value='/resources/img/${item.hinhAnh}' />" alt="" /></a>
					<div class="mask">
						<a href="<c:url value='/sanpham/${item.maSanPham}' />">Quick View</a>
					</div>
					<a class="product_name" href="<c:url value='/sanpham/${item.maSanPham}' />">${item.tenSanPham}</a>
					<p>
						<a class="item_add" href="#"><i></i> <span class="item_price">${item.donGia}</span></a>
					</p>
				</div>
			</c:forEach>
		</div>

	</div>

	<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo3").flexisel({
				visibleItems : 4,
				animationSpeed : 1000,
				autoPlay : true,
				autoPlaySpeed : 3000,
				pauseOnHover : true,
				enableResponsiveBreakpoints : true,
				responsiveBreakpoints : {
					portrait : {
						changePoint : 480,
						visibleItems : 1
					},
					landscape : {
						changePoint : 640,
						visibleItems : 2
					},
					tablet : {
						changePoint : 768,
						visibleItems : 3
					}
				}
			});

		});
	</script>
	<script type="text/javascript"
		src="<c:url value='/resources/home/js/jquery.flexisel.js' />"></script>
	</div>
	</div>
	<!-- content-section-ends-here -->

	<div class="footer">
		<div class="container">
			<div class="footer_top">
				<div class="span_of_4">
					<div class="col-md-3 span1_of_4">
						<h4>Shop</h4>
						<ul class="f_nav">
							<li><a href="#">new arrivals</a></li>
							<li><a href="#">men</a></li>
							<li><a href="#">women</a></li>
							<li><a href="#">accessories</a></li>
							<li><a href="#">kids</a></li>
							<li><a href="#">brands</a></li>
							<li><a href="#">trends</a></li>
							<li><a href="#">sale</a></li>
							<li><a href="#">style videos</a></li>
						</ul>
					</div>
					<div class="col-md-3 span1_of_4">
						<h4>help</h4>
						<ul class="f_nav">
							<li><a href="#">frequently asked questions</a></li>
							<li><a href="#">men</a></li>
							<li><a href="#">women</a></li>
							<li><a href="#">accessories</a></li>
							<li><a href="#">kids</a></li>
							<li><a href="#">brands</a></li>
						</ul>
					</div>
					<div class="col-md-3 span1_of_4">
						<h4>account</h4>
						<ul class="f_nav">
							<li><a href="account.html">login</a></li>
							<li><a href="register.html">create an account</a></li>
							<li><a href="#">create wishlist</a></li>
							<li><a href="checkout.html">my shopping bag</a></li>
							<li><a href="#">brands</a></li>
							<li><a href="#">create wishlist</a></li>
						</ul>
					</div>
					<div class="col-md-3 span1_of_4">
						<h4>popular</h4>
						<ul class="f_nav">
							<li><a href="<c:url value='/tatcasanpham' />">Tất cả sản phẩm</a></li>
							<li><a href="#">men</a></li>
							<li><a href="#">women</a></li>
							<li><a href="#">accessories</a></li>
							<li><a href="#">kids</a></li>
							<li><a href="#">brands</a></li>
							<li><a href="#">trends</a></li>
							<li><a href="#">sale</a></li>
							<li><a href="#">style videos</a></li>
							<li><a href="#">login</a></li>
							<li><a href="#">brands</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="cards text-center">
				<img src="images/cards.jpg" alt="" />
			</div>
			<div class="copyright text-center">
				<p>
					© Myclass.vn 2015 Eshop. All Rights Reserved | Design by <a
						href="http://myclass.vn "> Myclass.vn </a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>