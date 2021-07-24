<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Chi tiết giỏ hàng</title>
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
	href="<c:url value='/resources/css/login.css' />" />



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
	<div class="container">
		<div >
			<h2 class="text-center">Thông tin giỏ hàng</h2>
			<table class="table">
				<thead>
					<tr>
						<th>Tên hàng</th>
						<th>Size</th>
						<th>Số lượng mua</th>
						<th>Đơn giá</th>
						<th>Thành tiền</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${giohang}" var="item">
						<tr>
							<td class="sanpham" data-masanpham="${item.maSanPham}">${item.tenSanPham}</td>
							<td class="size" data-masize="${item.maSize}">${item.tenSize}</td>
							<td class="soluongmua" data-mamau="${item.maMau}"><input type="number" class="input_soluongmua" name="soluongmua" min="1" max="${item.soLuongCon}" value="${item.soLuongMua}"></td>
							<td class="dongia">${item.donGia}</td>
							<td class="tinhtien">${item.donGia*item.soLuongMua}</td>
							<td><button type="button" class="btn btn-danger btn-xoagiohang" data-machitietsanpham="${item.maChiTietSanPham}">Xoá</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<h1>Tổng tiền: <span id="tongtien"></span></h1>
		</div>
		
		<div class="col-sm-12" style="margin-top: 20px;">
				<h2 class="text-center">Thông tin đơn hàng</h2>
			
				<div class="form-group">
					<form action="chitietgiohang" method="post">
				
						<label for="tenkhachhang">Tên người mua/nhận</label>
						<input class="form-control" id="tenKH"  name="tenKH" value="<c:if test="${user.tenKH != null}">${user.tenKH}</c:if>"/><br/>
						
						<label for="sodt">Điện thoại liên lạc </label>
						<input class="form-control" id="soDT" name="soDT" value="<c:if test="${user.soDT != null}">${user.soDT}</c:if>" /><br/>
						
						<div class="radio">
						  <label><input checked="" type="radio" name="hinhThuc"  value="Giao hàng tận nơi">Giao hàng tận nơi </label><br/>
						</div>
						<div class="radio">
						  <label><input type="radio" name="hinhThuc" value="Nhận hàng tại cửa hàng">Nhận hàng tại cửa hàng</label><br/>
						</div>
						
						<label for="diaChi">Địa chỉ nhận hàng</label>
						<input class="form-control" id="diaChi" name="diaChi"/><br/>
						
						<label for="ghiChu">Ghi chú</label>
	  					<textarea class="form-control" rows="5" id="ghiChu" name="ghiChu"></textarea><br/>
	  					
	  					<input type="hidden" id="maKH" name="maKH" value="<c:if test="${user.maKH != null}">${user.maKH}</c:if>" />
  						
  						<input type="submit" class="btn btn-primary" value="Đặt hàng" />
  					</form>
				</div>
			</div>
		</div>
	
	
</body>
<script src="<c:url value='/resources/js/login.js' />"></script>
<script src="<c:url value='/resources/js/giohang.js' />">
</script>
</html>