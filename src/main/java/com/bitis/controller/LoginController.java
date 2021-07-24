package com.bitis.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bitis.dto.GioHangDTO;
import com.bitis.entity.DanhMuc;
import com.bitis.entity.KhachHang;
import com.bitis.entity.LoaiKhachHang;
import com.bitis.enumerate.LoaiKHEnum;
import com.bitis.service.impl.IDanhMucService;
import com.bitis.service.impl.IKhachHangService;

@Controller
@RequestMapping(value = "/login")
@SessionAttributes(names = "user")
public class LoginController {
	
	@Autowired
	private IKhachHangService khachHangService;
	
	@Autowired
	private IDanhMucService danhMucService;

	@GetMapping
	public ModelAndView homePage(HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("login");
		
		if(null != httpSession.getAttribute("giohang")){
			List<GioHangDTO> gioHangs = (List<GioHangDTO>) httpSession.getAttribute("giohang");
			mav.addObject("soluongsanphamgiohang", gioHangs.size());
		}
		
		List<DanhMuc> listDanhMucs = danhMucService.getAllDanhMuc();
		
		mav.addObject("listDanhMucs", listDanhMucs);
		
		return mav;
	}
	
	
	public ModelAndView test(@RequestParam String tenKH, @RequestParam String matKhau, @RequestParam String email, @RequestParam String action) {
		ModelAndView mav = new ModelAndView("login");
		
		if(action.equals("signin")) {
			KhachHang khachHang = new KhachHang();
			khachHang.setTenKH(tenKH);
			khachHang.setEmail(email);
			khachHang.setMatKhau(matKhau);
			LoaiKhachHang loai2 = new LoaiKhachHang();
			loai2.setMaLoaiKH(2);
			loai2.setLoai(LoaiKHEnum.USER);
			khachHang.setLoaiKhachHang(loai2);
			
			khachHang.getLoaiKhachHang().setMaLoaiKH(2);
			
			khachHangService.addAccount(khachHang);
		}
		
		return mav;
	}
	
	@PostMapping
	public ModelAndView login(@ModelAttribute KhachHang khachHang, @RequestParam String action, HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("login");
		
		
		if(action.equals("login")) {
			String email = khachHang.getEmail();
			String password = khachHang.getMatKhau();
			if(khachHangService.getAccount(email, password) != null ) {
				mav = new ModelAndView("redirect:/trang-chu");
				KhachHang kh = khachHangService.getAccount(email, password);
				httpSession.setAttribute("user", kh);
				
				System.out.println(khachHang);
			} else {
				mav.addObject("messageError", "Mật khẩu hay email không hợp lệ. Vui lòng nhập lại");
			}
		} else if(action.equals("signin")) {
			LoaiKhachHang loai2 = new LoaiKhachHang();
			loai2.setMaLoaiKH(2);
			loai2.setLoai(LoaiKHEnum.USER);
			khachHang.setLoaiKhachHang(loai2);
			
			khachHang.getLoaiKhachHang().setMaLoaiKH(2);
			
			khachHangService.addAccount(khachHang);
		}
		
//		if(password != null) {
//			System.out.println(email);
//		}
//		if(password != null) {
//			System.out.println(password);
//		}
//		
		
	      
		return mav;
	}
}