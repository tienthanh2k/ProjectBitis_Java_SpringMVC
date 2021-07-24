package com.bitis.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bitis.dto.GioHangDTO;
import com.bitis.entity.DanhMuc;
import com.bitis.entity.SanPham;
import com.bitis.service.impl.IDanhMucService;
import com.bitis.service.impl.ISanPhamService;

@Controller
@RequestMapping(value = "/danhmuc")
public class DanhMucController {
	@Autowired
	private ISanPhamService sanPhamService;
	
	@Autowired
	private IDanhMucService danhMucService;
	
	@GetMapping("/{maDanhMuc}")
	public ModelAndView getSanPham(@PathVariable(name = "maDanhMuc") int maDanhMuc, HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("danhmuc");
		
		List<SanPham> listSanPhams = sanPhamService.getSanPhamsByDanhMuc(maDanhMuc);
		List<DanhMuc> listDanhMucs = danhMucService.getAllDanhMuc();
		
		if(null != httpSession.getAttribute("giohang")){
			List<GioHangDTO> gioHangs = (List<GioHangDTO>) httpSession.getAttribute("giohang");
			httpSession.setAttribute("soluongsanphamgiohang", gioHangs.size());
			System.out.println(gioHangs.size() + " hello");
		}
		
		mav.addObject("listSanPhams", listSanPhams);
		mav.addObject("listDanhMucs", listDanhMucs);
		
		return mav;
	}
}
