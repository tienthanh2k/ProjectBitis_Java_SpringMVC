package com.bitis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.soap.SoapFaultException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitis.dto.ChiTietGioHangDTO;
import com.bitis.entity.SanPham;
import com.bitis.repository.impl.ISanPhamRepository;
import com.bitis.service.impl.ISanPhamService;

@Controller
@RequestMapping("/api")
@SessionAttributes(value = {"giohang", "user"})
public class APIController {
	
	@GetMapping("/themGioHang")
	@ResponseBody
	public String themGioHang(@RequestParam int machitietsanpham, @RequestParam int masanpham, @RequestParam int masize ,@RequestParam int mamau, 
			@RequestParam String tensanpham, @RequestParam String tensize, @RequestParam String tenmau,
			@RequestParam double dongia, @RequestParam int soluongcon, HttpSession httpSession) {
		// khoi tao gio hang session
		System.out.println(masanpham + " - " + tensanpham);
		if(null == httpSession.getAttribute("giohang") ){
			List<ChiTietGioHangDTO> gioHangDTOs = new ArrayList<ChiTietGioHangDTO>();
			
			ChiTietGioHangDTO gioHang = new ChiTietGioHangDTO();
			
			gioHang.setMaChiTietSanPham(machitietsanpham);
			gioHang.setMaSanPham(masanpham);
			gioHang.setMaSize(masize);
			gioHang.setMaMau(mamau);
			gioHang.setTenSanPham(tensanpham);
			gioHang.setDonGia(dongia);
			gioHang.setTenMau(tenmau);
			gioHang.setTenSize(tensize);
			gioHang.setSoLuongCon(soluongcon);
			gioHang.setSoLuongMua(1);
			
			gioHangDTOs.add(gioHang);
			httpSession.setAttribute("giohang", gioHangDTOs);
			
			return gioHangDTOs.size() + "";
			
		} else {
			List<ChiTietGioHangDTO> gioHangDTOs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			int vitri = KiemTraSanPhamDaTonTaiGioHang(gioHangDTOs,httpSession, masanpham, masize, mamau, machitietsanpham);
			if(vitri == -1){
				ChiTietGioHangDTO gioHang = new ChiTietGioHangDTO();
				gioHang.setMaChiTietSanPham(machitietsanpham);
				gioHang.setMaSanPham(masanpham);
				gioHang.setMaSize(masize);
				gioHang.setMaMau(mamau);
				gioHang.setTenSanPham(tensanpham);
				gioHang.setDonGia(dongia);
				gioHang.setTenMau(tenmau);
				gioHang.setTenSize(tensize);
				gioHang.setSoLuongCon(soluongcon);
				gioHang.setSoLuongMua(1);
				
				gioHangDTOs.add(gioHang);
				
				
			}else{
				int soluongmoi = gioHangDTOs.get(vitri).getSoLuongMua() + 1;
				gioHangDTOs.get(vitri).setSoLuongMua(soluongmoi);
			}
			return gioHangDTOs.size() + "";
		}
	}
	
	private int KiemTraSanPhamDaTonTaiGioHang(List<ChiTietGioHangDTO> listGioHangs,HttpSession httpSession,int masp,int masize,int mamau, int machitietsanpham){
		for (int i = 0; i < listGioHangs.size(); i++) {
			if(listGioHangs.get(i).getMaSanPham() == masp && listGioHangs.get(i).getMaSize() == masize && listGioHangs.get(i).getMaMau() == mamau && listGioHangs.get(i).getMaChiTietSanPham() == machitietsanpham){
				return i;
			}
		}
		return -1;
	}
	
	@GetMapping("/xoaGioHang")
	@ResponseBody
	public String XoaGioHang(HttpSession httpSession, @RequestParam int machitietsanpham, 
			@RequestParam int masanpham, @RequestParam int masize ,@RequestParam int mamau){
		if(null != httpSession.getAttribute("giohang") ){
			List<ChiTietGioHangDTO> listGioHangs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			int vitri = KiemTraSanPhamDaTonTaiGioHang(listGioHangs, httpSession, masanpham, masize, mamau, machitietsanpham);
			listGioHangs.remove(vitri);
			return listGioHangs.size()+"";
		}
		return null;
	}
	
	@GetMapping("capNhatGioHang")
	@ResponseBody
	public void CatNhatGioHang(HttpSession httpSession,@RequestParam int soluong ,@RequestParam int masanpham, @RequestParam int mamau,@RequestParam int masize, @RequestParam int machitietsanpham){
		if(null != httpSession.getAttribute("giohang") ){
			List<ChiTietGioHangDTO> listGioHangs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			int vitri = KiemTraSanPhamDaTonTaiGioHang(listGioHangs, httpSession, masanpham, masize, mamau,machitietsanpham);
			listGioHangs.get(vitri).setSoLuongMua(soluong);
		}
	}
	
	@Autowired
	ISanPhamService sanPhamService;
	
	@GetMapping("timkiemsanpham")
	@ResponseBody
	public String timKiemSanPham(
			@RequestParam int minPrice, @RequestParam int maxPrice, HttpServletRequest request) {
		String [] sizeArr;
		if(request.getParameterValues("sizeArr[]") == null) {
			sizeArr = new String[0];
		} else {
			sizeArr = request.getParameterValues("sizeArr[]");
		}
		System.out.println("Size");
		for (String string : sizeArr) {
			System.out.print(string + " - ");
		}
		
		String [] mauArr;
		if(request.getParameterValues("mauArr[]") == null) {
			mauArr = new String[0];
		} else {
			mauArr = request.getParameterValues("mauArr[]");
		}
		System.out.println("\nMau");
		for (String string : mauArr) {
			System.out.println(string);
		}
		System.out.println(minPrice + " - " + maxPrice);
		
		List<SanPham> list = sanPhamService.getSanPhamsByManyField(sizeArr, mauArr, minPrice, maxPrice);
		
		for(SanPham sp: list) {
			System.out.println(sp.toString());
		}
		
		StringBuilder danhsachsp = new StringBuilder("");
		for(SanPham sp: list) {
			danhsachsp.append("<div class=\"col-md-4 col-sm-12 text-center thongtinsanpham\" id=\""+sp.getMaSanPham()+"\">");
			danhsachsp.append("<a href=\"<c:url value='/sanpham/" + sp.getMaSanPham() + "' />\">");
			danhsachsp.append("<img class=\"img-responsive\" src=\"resources/img/" + sp.getHinhAnh() + "\" alt=\"\" />");
			danhsachsp.append("</a>");
			danhsachsp.append("<div class=\"mask\"><a href=\"sanpham/" + sp.getMaSanPham() + "\">Quick View</a></div>");
			danhsachsp.append("<a class=\"product_name\" href=\"sanpham/"+ sp.getMaSanPham() +"\">"+sp.getTenSanPham()+"</a>");
			danhsachsp.append("<p><a class=\"item_add\" href=\"#\"><i></i> <span class=\"item_price\">"+sp.getDonGia()+"</span></a></p>");
			danhsachsp.append("</div>");
		}
		
		return danhsachsp.toString();
	}
}
