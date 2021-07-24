<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Thông tin khách hàng</title>
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
		<h1>Thông tin khách hàng</h1>
		<form class="form-horizontal" action="khachhang" method="post">
			<input type="hidden" class="form-control" name="maKH" value="${user.maKH}"/>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="tenKH">Tên khách hàng:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="tenKH" value="${user.tenKH}"/>
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="diaChi">Địa chỉ:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="diaChi" value="${user.diaChi}"/>
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="soDT">Số điện thoại:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="soDT" value="${user.soDT}"/>
				</div>
			</div>
			

			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Email:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="email" value="${user.email}"/>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="matKhau">Mật khẩu:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="matKhau"/>
				</div>
			</div>
			
			<div class="form-group">
				<label class="control-label col-sm-2" for="xacNhanMatKhau">Xác nhận mật khẩu:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="xacNhanMatKhau"/>
				</div>
			</div>
			
			<div id="messageError">
				<c:if test="${error != null}">
					<p style="color: red;">${error}</p>
				</c:if>
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-default">Lưu những thay đổi</button>
				</div>
			</div>
		</form>
	</div>
</body>
<script src="<c:url value='/resources/js/login.js' />"></script>
</html>