<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Đăng nhập/Đăng ký</title>
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


<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/bootstrap/css/login.css' />" />

</head>
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

	<!-- Login in start -->
	<div class="container text-center">
		<div id="divlogin">
			<h1>Đăng nhập</h1>
			<form name="login" id="login" action="login" method="post">
				<input type="hidden" name="action" value="login" /> <label
					for="email"><b>Email</b></label> <input type="text"
					placeholder="Enter email" name="email"> <br /> <label
					for="password"><b>Mật khẩu</b></label> <input type="password"
					placeholder="Enter Password" name="matKhau"> <br />
				
				<c:if test="${messageError != null }">
					${messageError}
				</c:if>
				<br/>
				<button type="submit">Đăng nhập</button>

				<br /> <label> <input type="checkbox" checked="checked"
					name="remember"> Lưu mật khẩu
				</label>

				<p>
					Nếu bạn chưa có tài khoản. Vui lòng <a href="#" id="btn_signin">
						đăng ký</a> tại đây
				</p>
			</form>
		</div>

		<div id="divsign">
			<h1>Đăng kí</h1>
			<form name="signin" id="sign" action="login" method="post">
				<input type="hidden" name="action" value="signin" /> <label
					for="email"><b>Email</b></label> <input type="text"
					placeholder="Nhập email" name="email"> <br /> <label
					for="matKhau"><b>Mật khẩu</b></label> <input type="password"
					placeholder="Nhập Password" name="matKhau"> <br /> <label
					for="tenKH"><b>Tên Khách Hàng</b></label> <input type="text"
					placeholder="Nhập tên khách hàng" name="tenKH"> <br /> <label
					for="diaChi"><b>Địa Chỉ</b></label> <input type="text"
					placeholder="Nhập địa chỉ" name="diaChi"> <br /> <label
					for="soDT"><b>Số điện thoại</b></label> <input type="text"
					placeholder="Nhập số điện thoại" name="soDT"> <br />

				<button type="submit">Đăng ký</button>

				<p>
					Quay lại trang <a href="#" id="btn_login"> đăng nhập</a> tại đây
				</p>
			</form>
		</div>
	</div>
</body>
<script src="<c:url value='/resources/js/login.js' />"></script>
</html>