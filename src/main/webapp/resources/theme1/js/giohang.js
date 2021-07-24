$(document).ready(function() {

    $(".btn-giohang").click(function() {
    	var masanpham = $(this).closest(".product-infor").find(".dress-name").attr("data-masp");
    	var tensanpham = $(this).closest(".product-infor").find(".tensapham").text();
    	var dongia = $(this).closest(".product-infor").find(".dongiasp").text();
    	var mamau = $(this).closest(".product-infor").find(".tenmau").attr("data-maMau");
    	var tenmau = $(this).closest(".product-infor").find(".tenmau").text();
    	var masize = $(this).closest(".product-infor").find(":selected").attr("value");
    	var tensize = $(this).closest(".product-infor").find(":selected").text();
    	var machitietsanpham = $(this).closest(".product-infor").find(":selected").attr("data-chitietsanpham");
    	var soluongcon = $(this).closest(".product-infor").find(".soluongco").text();
    	
    	//alert(machitietsanpham);
    	//alert(masanpham+tensanpham + "-" + dongia + "-" + mamau + "-" + tenmau + masize + tensize);
    	
    	$.ajax({
			url:"http://localhost:8080/ProjectBitis/api/themGioHang",
		    type:"GET",
		    data:{
		    	machitietsanpham:machitietsanpham,
		    	masanpham:masanpham,
		    	masize:masize,
		    	mamau:mamau,
		    	tensanpham:tensanpham,
		    	tenmau:tenmau,
		    	tensize:tensize,
		    	dongia:dongia,
		    	soluongcon:soluongcon,
		    },
			success: function(value){
				$("#giohang").html("<span>" + value + "</span>");
				//alert(value);
				
			}
		}) 
		
    });
    
    $(".btn-xoagiohang").click(function() {
    	var self = $(this);
    	var masanpham = $(this).closest("tr").find(".tensanpham").attr("data-masanpham");
    	var mamau = $(this).closest("tr").find(".soluongmua").attr("data-mamau")
    	var masize = $(this).closest("tr").find(".size").attr("data-masize")
    	var machitietsanpham = $(this).attr("data-machitietsanpham")
    	
    	//alert(machitietsanpham);
    	//alert(masanpham + "-" + "-" + mamau + "-" + masize + "-" + machitietsanpham);
    	
    	$.ajax({
			url:"http://localhost:8080/ProjectBitis/api/xoaGioHang",
		    type:"GET",
		    data:{
		    	machitietsanpham:machitietsanpham,
		    	masanpham: masanpham,
		    	masize:masize,
		    	mamau:mamau
		    },
			success: function(value){
				self.closest("tr").remove();
				if(value != 0) {
					$("#giohang").html("<span>" + value + "</span>");
				} else {
					$("#giohang").html("<span>" + "Empty cart" + "</span>");
				}
				//alert(value);
				GanTongTienGioHang(true);
			}
		}) 
		
    });
    
    GanTongTienGioHang();
	
	function GanTongTienGioHang(isEventChange){
		var tongtiensp = 0;	
		$(".dongia").each(function(){
			var dongia = $(this).text();
			var soluong = $(this).closest("tr").find(".input_soluongmua").val();
			//alert(dongia);
			var tongtien = parseInt(dongia)*soluong;
			
			//if(!isEventChange){
			//	$(this).html(tongtien);
			//}
			
			tongtiensp = tongtiensp+tongtien
			$("#tongtien").html(tongtiensp+"")
			
		})
	}
	
	$(".input_soluongmua").change(function(){
		var soluong = $(this).val();
		var giatien = $(this).closest("tr").find(".dongia").text();
		//alert(soluong);
		
		var tongtien = soluong * parseInt(giatien);
		//var format = tongtien.toFixed(3).replace(/(\d)(?=(\d{3})+\.)/g, "$1.").toString()
		$(this).closest("tr").find(".tinhtien").html(tongtien);
		GanTongTienGioHang(true);
		
		var mamau = $(this).closest("tr").find(".soluongmua").attr("data-mamau");
		var masize = $(this).closest("tr").find(".size").attr("data-masize");
		var masanpham = $(this).closest("tr").find(".sanpham").attr("data-masanpham");
		var machitietsanpham = $(this).closest("tr").find(".btn-xoagiohang").attr("data-machitietsanpham");
		
		$.ajax({
			url:"http://localhost:8080/ProjectBitis/api/capNhatGioHang",
		    type:"GET",
		    data:{
		    	machitietsanpham:machitietsanpham,
		    	masanpham:masanpham,
		    	masize:masize,
		    	mamau:mamau,
		    	soluong:soluong
		    	
		    },
			success: function(value){
				
			}
		})    
	})
});
