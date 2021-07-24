package com.bitis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bitis.dto.GioHangDTO;
import com.bitis.entity.DanhMuc;
import com.bitis.entity.KhachHang;
import com.bitis.entity.LoaiKhachHang;
import com.bitis.enumerate.LoaiKHEnum;
import com.bitis.service.impl.IDanhMucService;
import com.bitis.service.impl.IKhachHangService;

@Controller
@RequestMapping(value = "/khachhang")
public class KhachHangController {
	
	@Autowired
	private IDanhMucService danhMucService;
	
	@Autowired
	private IKhachHangService khachHangService;
	
	
	@GetMapping
	public ModelAndView getSanPham(HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("khachhang");
		
		if(null != httpSession.getAttribute("giohang")){
			List<GioHangDTO> gioHangs = (List<GioHangDTO>) httpSession.getAttribute("giohang");
			mav.addObject("soluongsanphamgiohang", gioHangs.size());
		}
		
		List<DanhMuc> listDanhMucs = danhMucService.getAllDanhMuc();

		mav.addObject("listDanhMucs", listDanhMucs);
		
		return mav;
	}
	
	@PostMapping
	public ModelAndView updateKhachHang(@ModelAttribute KhachHang khachHang, @RequestParam(name = "xacNhanMatKhau") String xacNhanMatKhau, HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("khachhang");
		
		
		if(khachHang.getMatKhau().equals(xacNhanMatKhau)) {
			if(khachHangService.checkAccount(khachHang.getEmail(), khachHang.getMatKhau())) {
				LoaiKhachHang loai2 = new LoaiKhachHang();
				System.out.println("Updating");
				loai2.setMaLoaiKH(2);
				loai2.setLoai(LoaiKHEnum.USER);
				
				khachHang.setLoaiKhachHang(loai2);
				khachHangService.updateAccount(khachHang);
				
				request.getSession().setAttribute("user", khachHang);
			} else {
				mav.addObject("error", "Mật khẩu không hợp lệ");
			}
			
		} else {
			mav.addObject("error", "Không mật khẩu và xác nhập mật khẩu không khớp");
		}
		
		return mav;
	}
}
