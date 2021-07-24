package com.bitis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitis.entity.SanPham;
import com.bitis.repository.impl.ISanPhamRepository;
import com.bitis.service.impl.ISanPhamService;

@Service
public class SanPhamService implements ISanPhamService{
	@Autowired
	private ISanPhamRepository sanPhamRepository;

	public List<SanPham> getAllSanPhams() {
		// TODO Auto-generated method stub
		return sanPhamRepository.getAllSanPhams();
	}

	public SanPham getSanPhamById(int id) {
		// TODO Auto-generated method stub
		return sanPhamRepository.getSanPhamById(id);
	}

	public List<SanPham> getSanPhamsByDanhMuc(int maDanhMuc) {
		// TODO Auto-generated method stub
		return sanPhamRepository.getSanPhamsByDanhMuc(maDanhMuc);
	}
	public List<SanPham> getSanPhamsByManyField(String[] arrSize, String[] mauArr, int minPrice, int maxPrice) {
		return sanPhamRepository.getSanPhamsByManyField(arrSize, mauArr, minPrice, maxPrice);
	}
}
