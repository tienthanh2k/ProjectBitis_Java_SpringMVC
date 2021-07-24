package com.bitis.repository.impl;

import java.util.List;

import com.bitis.entity.KhachHang;

public interface IKhachHangRepository {
	public List<KhachHang> getAllKhachHang();

	public boolean checkAccount(String email, String password);
	
	public KhachHang getAccount(String email, String password);
	
	public boolean addAccount(KhachHang khachHang);
	
	public KhachHang getAccountById(int maKhachHang);
	
	public boolean updateAccount(KhachHang khachHang);
}
