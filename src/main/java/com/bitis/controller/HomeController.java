package com.bitis.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bitis.dto.GioHangDTO;
import com.bitis.entity.DanhMuc;
import com.bitis.entity.SanPham;
import com.bitis.service.impl.IDanhMucService;
import com.bitis.service.impl.ISanPhamService;

@Controller
@RequestMapping(value = "/trang-chu")
public class HomeController {
	@Autowired
	private ISanPhamService sanPhamService;
	
	@Autowired
	private IDanhMucService danhMucService;

	
	@GetMapping
	public ModelAndView homePage(HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("trangchu");
		
		List<SanPham> listSanPhams = sanPhamService.getAllSanPhams();
		
		List<DanhMuc> listDanhMucs = danhMucService.getAllDanhMuc();
		
		if(null != httpSession.getAttribute("giohang")){
			List<GioHangDTO> gioHangs = (List<GioHangDTO>) httpSession.getAttribute("giohang");
			mav.addObject("soluongsanphamgiohang", gioHangs.size());
		}
		
		mav.addObject("listSanPhams", listSanPhams);
		mav.addObject("listDanhMucs", listDanhMucs);
		
		return mav;
	}
}