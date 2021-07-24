$(document).ready(function() {
	$("#searchsp").click(function(){
        var sizeArr = [];
        var mauArr = [];
        $.each($("input[name='size']:checked"), function(){            
            sizeArr.push($(this).val());
        });
        $.each($("input[name='mau']:checked"), function(){            
            mauArr.push($(this).val());
        });
        
        var price = $("input[type='radio'][name='giatien']:checked");
        //alert(price.val());
        var minPrice, maxPrice;
        if(price.val() == undefined) {
        	minPrice = 0;
        	maxPrice = 9999999;
        } else {
	        minPrice = price.attr("data-min");
	        maxPrice = price.attr("data-max");
        }
        
        //alert(price.attr("data-min") + "-" + price.attr("data-max"));
        //alert("My sizeArr are: " + sizeArr.join(", "));
        //alert("My mauArr are: " + mauArr.join(", "));
        
        $.ajax({
			url:"http://localhost:8080/ProjectBitis/api/timkiemsanpham",
		    type:"GET",
		    data:{
		    	sizeArr:sizeArr,
		    	mauArr:mauArr,
		    	minPrice:minPrice,
		    	maxPrice:maxPrice
		    },
			success: function(value){
				$("#danhsachsp").empty();
				$("#danhsachsp").append(value);
			}
		})
    });
})