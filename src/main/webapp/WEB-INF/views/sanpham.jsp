<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Thông tin sản phẩm</title>
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
<script src="<c:url value='/resources/js/giohang.js' />">
	
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
									<li><a href="#">Thông tin tài khoản</a></li>
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
										<a href="<c:url value='/trang-chu' />"><span>Bitis</span></a>
									</h1>
								</div>
							</div>
							<!--/.navbar-header-->

							<div class="collapse navbar-collapse col-md-9"
								id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<li><a href="<c:url value='/trang-chu' />">Home</a></li>
									<c:forEach var="item" items="${listDanhMucs}">
										<li><a
											href="<c:url value='/danhmuc/${item.maDanhMuc}' />">${item.tenDanhMuc}</a></li>
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
	<!-- header-section-ends -->

	<!-- content-section-starts -->
	<div class="container">
		<div class="products-page">
			<div class="products">
				<div class="product-listy">
					<h2>our Products</h2>
					<ul class="product-list">
						<li><a href="">New Products</a></li>
						<li><a href="">Old Products</a></li>
						<li><a href="">T-shirts</a></li>
						<li><a href="">pants</a></li>
						<li><a href="">Dress</a></li>
						<li><a href="">Shorts</a></li>
						<li><a href="#">Shirts</a></li>
						<li><a href="register.html">Register</a></li>
					</ul>
				</div>
				<div class="latest-bis">
					<img src="images/l4.jpg" class="img-responsive" alt="" />
					<div class="offer">
						<p>40%</p>
						<small>Top Offer</small>
					</div>
				</div>
				<div class="tags">
					<h4 class="tag_head">Tags Widget</h4>
					<ul class="tags_links">
						<li><a href="#">Kitesurf</a></li>
						<li><a href="#">Super</a></li>
						<li><a href="#">Duper</a></li>
						<li><a href="#">Theme</a></li>
						<li><a href="#">Men</a></li>
						<li><a href="#">Women</a></li>
						<li><a href="#">Equipment</a></li>
						<li><a href="#">Best</a></li>
						<li><a href="#">Accessories</a></li>
						<li><a href="#">Men</a></li>
						<li><a href="#">Apparel</a></li>
						<li><a href="#">Super</a></li>
						<li><a href="#">Duper</a></li>
						<li><a href="#">Theme</a></li>
						<li><a href="#">Responsive</a></li>
						<li><a href="#">Women</a></li>
						<li><a href="#">Equipment</a></li>
					</ul>

				</div>

			</div>
			<div class="new-product">
				<div class="col-md-5 zoom-grid">
					<div class="flexslider">
						<ul class="slides">
							<li
								data-thumb="<c:url value='/resources/img/${sanPham.hinhAnh}' />">
								<div class="thumb-image">
									<img src="<c:url value='/resources/img/${sanPham.hinhAnh}' />"
										data-imagezoom="true" class="img-responsive" alt="" />
								</div>
							</li>
							<li
								data-thumb="<c:url value='/resources/img/${sanPham.hinhAnh}' />">
								<div class="thumb-image">
									<img src="<c:url value='/resources/img/${sanPham.hinhAnh}' />"
										data-imagezoom="true" class="img-responsive" alt="" />
								</div>
							</li>
							<li
								data-thumb="<c:url value='/resources/img/${sanPham.hinhAnh}' />">
								<div class="thumb-image">
									<img src="<c:url value='/resources/img/${sanPham.hinhAnh}' />"
										data-imagezoom="true" class="img-responsive" alt="" />
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="col-md-7 dress-info product-infor">
					<div class="dress-name" data-masp="${sanPham.maSanPham }">
						<h3 class="tensapham">${sanPham.tenSanPham}</h3>
						<span class="dongiasp">${sanPham.donGia}</span>
						<div class="clearfix"></div>
					</div>
					<div class="span span1">
						<p class="left">Số lượng có:</p>
						<p class="right soluongco">${sanPham.soLuongCo }</p>
						<div class="clearfix"></div>
					</div>
					<div class="span span2">
						<p class="left">Màu sắc</p>
						<p class="right tenmau" data-maMau="${sanPham.mauSac.maMau}">${sanPham.mauSac.tenMau}</p>
						<div class="clearfix"></div>
					</div>
					<div class="span span3">
						<p class="left">Size</p>
						<p class="right">
							<span class="selection-box"> <select class="domains valid"
								name="size">
									<c:forEach var="item" items="${sanPham.listChiTietSanPham}">
										<option data-chitietsanpham="${item.maChiTietSanPham}" value="${item.size.maSize}">${item.size.tenSize }</option>
									</c:forEach>
							</select>
							</span>
						</p>
						<div class="clearfix"></div>
					</div>
					<button class="btn-giohang">Thêm giỏ hàng</button>
					<div class="social-icons">
						<ul>
							<li><a class="facebook1" href="#"></a></li>
							<li><a class="twitter1" href="#"></a></li>
							<li><a class="googleplus1" href="#"></a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
				<script src="<c:url value='/resources/home/js/imagezoom.js' />"></script>
				<!-- FlexSlider -->
				<script defer
					src="<c:url value='/resources/home/js/jquery.flexslider.js' />"></script>
				<script>
					// Can also be used with $(document).ready()
					$(window).load(function() {
						$('.flexslider').flexslider({
							animation : "slide",
							controlNav : "thumbnails"
						});
					});
				</script>
			</div>
			<div class="clearfix"></div>
			<!-- Main component for a primary marketing message or call to action -->




		</div>
	</div>

	<div class="clearfix"></div>

	<!-- content-section-ends -->
	<div class="news-letter">
		<div class="container">
			<div class="join">
				<h6>JOIN OUR MAILING LIST</h6>
				<div class="sub-left-right">
					<form>
						<input type="text" value="Enter Your Email Here"
							onfocus="this.value = '';"
							onblur="if (this.value == '') {this.value = 'Enter Your Email Here';}" />
						<input type="submit" value="SUBSCRIBE" />
					</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<div class="footer">
		<div class="container">
			<div class="footer_top">
				<div class="span_of_4">
					<div class="col-md-3 span1_of_4">
						<h4>Shop</h4>
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
							<li><a href="#">new arrivals</a></li>
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
					© 2015 Eshop. All Rights Reserved | Design by <a
						href="http://w3layouts.com"> W3layouts</a>
				</p>
			</div>
		</div>
	</div>
	<script src="<c:url value='/resources/home/js/responsive-tabs.js' />"></script>
	<script type="text/javascript">
		$('#myTab a').click(function(e) {
			e.preventDefault();
			$(this).tab('show');
		});

		$('#moreTabs a').click(function(e) {
			e.preventDefault();
			$(this).tab('show');
		});

		(function($) {
			// Test for making sure event are maintained
			$('.js-alert-test').click(function() {
				alert('Button Clicked: Event was maintained');
			});
			fakewaffle.responsiveTabs([ 'xs', 'sm' ]);
		})(jQuery);
	</script>
</body>
</html>