package com.bitis.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bitis.dto.ChiTietGioHangDTO;
import com.bitis.entity.DanhMuc;
import com.bitis.entity.MauSac;
import com.bitis.entity.SanPham;
import com.bitis.entity.Size;
import com.bitis.repository.impl.IMauSacRepository;
import com.bitis.repository.impl.ISizeRepository;
import com.bitis.service.impl.IDanhMucService;
import com.bitis.service.impl.IMauSacService;
import com.bitis.service.impl.ISanPhamService;
import com.bitis.service.impl.ISizeService;

@Controller
@RequestMapping(value = "/tatcasanpham")
public class SearchSanPhamController {
	@Autowired
	private IDanhMucService danhMucService;
	
	@Autowired
	private ISanPhamService sanPhamService;
	
	@Autowired
	private ISizeService sizeService;
	
	@Autowired
	private IMauSacService mauSacService;
	
	@GetMapping
	public ModelAndView getSanPham(HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("timkiemsanpham");
		
		List<SanPham> listSanPhams = sanPhamService.getAllSanPhams();
		List<DanhMuc> listDanhMucs = danhMucService.getAllDanhMuc();
		List<Size> listSizes = sizeService.getAllSizes();
		List<MauSac> listMauSacs = mauSacService.getAllMauSacs();
		
		if(null != httpSession.getAttribute("giohang")){
			List<ChiTietGioHangDTO> gioHangs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			mav.addObject("soluongsanphamgiohang", gioHangs.size());
		} else {
			List<ChiTietGioHangDTO> gioHangs = (List<ChiTietGioHangDTO>) httpSession.getAttribute("giohang");
			gioHangs = null;
		}

		mav.addObject("listSanPhams", listSanPhams);
		mav.addObject("listDanhMucs", listDanhMucs);
		mav.addObject("listSizes", listSizes);
		mav.addObject("listMauSacs", listMauSacs);
		
		return mav;
	}
}
