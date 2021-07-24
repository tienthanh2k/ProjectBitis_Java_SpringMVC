package com.bitis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bitis.dto.ChiTietGioHangDTO;
import com.bitis.entity.ChiTietHoaDon;
import com.bitis.entity.ChiTietHoaDonKey;
import com.bitis.entity.DanhMuc;
import com.bitis.entity.HoaDon;
import com.bitis.entity.KhachHang;
import com.bitis.service.impl.IChiTietHoaDonService;
import com.bitis.service.impl.IDanhMucService;
import com.bitis.service.impl.IHoaDonService;

@Controller
@RequestMapping(value = "/chitietgiohang")
@SessionAttributes("giohang")
public class ChiTietGioHangController {
	@Autowired
	private IDanhMucService danhMucService;
	
	@Autowired
	private IHoaDonService hoaDonService;
	
	@Autowired
	private IChiTietHoaDonService chiTietHoaDonService;
	
	@GetMapping
	public ModelAndView getSanPham(HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("chitietgiohang");
		
		List<DanhMuc> listDanhMucs = danhMucService.getAllDanhMuc();
		
		if(null != httpSession.getAttribute("giohang")){
			List<ChiTietGioHangDTO> gioHangs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			mav.addObject("soluongsanphamgiohang", gioHangs.size());
		} else {
			List<ChiTietGioHangDTO> gioHangs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			gioHangs = null;
		}

		mav.addObject("listDanhMucs", listDanhMucs);
		
		return mav;
	}
	
	@PostMapping
	public ModelAndView themHoaDon(HttpSession httpSession, @RequestParam int maKH, @RequestParam String tenKH, @RequestParam String soDT,
			@RequestParam String hinhThuc, @RequestParam String diaChi, @RequestParam String ghiChu){
		ModelAndView mav = new ModelAndView("chitietgiohang");
		
		List<DanhMuc> listDanhMucs = danhMucService.getAllDanhMuc();
		
		mav.addObject("listDanhMucs", listDanhMucs);
		
		if(null != httpSession.getAttribute("giohang")){
			List<ChiTietGioHangDTO> gioHangs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			
			mav.addObject("listDanhMucs", listDanhMucs);
			
			System.out.println(gioHangs.size());
			for(ChiTietGioHangDTO a: gioHangs) {
				System.out.println(a);
			}
			
			System.out.println(maKH + " " + tenKH);
			System.out.println(soDT + " " + hinhThuc + " " + diaChi + " " + ghiChu);
			// lay thong tin khach hang
			KhachHang khachHang = (KhachHang) httpSession.getAttribute("user");
			khachHang.setMaKH(maKH);
			khachHang.setSoDT(soDT);
			
			// Lay thong tin hoa don
			HoaDon hoaDon = new HoaDon();
			hoaDon.setKhachHang(khachHang);
			hoaDon.setDiaChi(diaChi);
			hoaDon.setHinhThuc(hinhThuc);
			hoaDon.setGhiChu(ghiChu);
			hoaDon.setTinhTrang(true);
			
			int idHoaDon = hoaDonService.addHoaDon(hoaDon);
			System.out.println("ID hoa don" + idHoaDon);
			if(idHoaDon > 0){
				List<ChiTietHoaDon> listChiTietHoaDons = new ArrayList<ChiTietHoaDon>();
				for (ChiTietGioHangDTO chiTietGioHangDTO : gioHangs) {
					// Set chi tiet hoa don key
					ChiTietHoaDonKey chiTietHoaDonKey = new ChiTietHoaDonKey();
					chiTietHoaDonKey.setMaChiTietSanPham(chiTietGioHangDTO.getMaChiTietSanPham());
					chiTietHoaDonKey.setMaHoaDon(hoaDon.getMaHoaDon());
					
					// set chi tiet hoa don
					ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
					chiTietHoaDon.setId(chiTietHoaDonKey);
					chiTietHoaDon.setSoLuong(chiTietGioHangDTO.getSoLuongMua());
					
					chiTietHoaDonService.addChiTietHoaDon(chiTietHoaDon);
				}
			}else{
				System.out.println("Them that bai");
			};	
			
		}
		return mav;
	}
}
