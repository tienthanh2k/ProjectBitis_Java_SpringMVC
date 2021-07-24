package com.bitis.service.impl;

import java.util.List;

import com.bitis.entity.SanPham;

public interface ISanPhamService {
	public List<SanPham> getAllSanPhams();
	
	public SanPham getSanPhamById(int id);
	
	public List<SanPham> getSanPhamsByDanhMuc(int maDanhMuc);
	
	public List<SanPham> getSanPhamsByManyField(String[] arrSize, String[] mauArr, int minPrice, int maxPrice);
}
