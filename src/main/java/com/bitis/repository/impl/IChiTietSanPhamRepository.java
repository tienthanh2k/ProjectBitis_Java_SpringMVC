package com.bitis.repository.impl;

import java.util.List;

import com.bitis.entity.ChiTietSanPham;
import com.bitis.entity.SanPham;

public interface IChiTietSanPhamRepository {
	public List<ChiTietSanPham> getAllChiTietSanPhams();

	public SanPham getChiTietSanPhamId(int id);
	
	public List<SanPham> getChiTietSanPhamsByDanhMuc(int maDanhMuc);
}
