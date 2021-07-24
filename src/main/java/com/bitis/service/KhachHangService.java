package com.bitis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitis.entity.KhachHang;
import com.bitis.repository.impl.IKhachHangRepository;
import com.bitis.service.impl.IKhachHangService;

@Service
public class KhachHangService implements IKhachHangService{
	
	@Autowired
	private IKhachHangRepository khachHangRepository;

	public List<KhachHang> getAllKhachHang() {
		return khachHangRepository.getAllKhachHang();
	}

	public boolean checkAccount(String email, String password) {
		return khachHangRepository.checkAccount(email, password);
	}

	public KhachHang getAccount(String email, String password) {
		return khachHangRepository.getAccount(email, password);
	}

	public boolean addAccount(KhachHang khachHang) {
		return khachHangRepository.addAccount(khachHang);
	}

	public KhachHang getAccountById(int maKhachHang) {
		return khachHangRepository.getAccountById(maKhachHang);
	}

	public boolean updateAccount(KhachHang khachHang) {
		return khachHangRepository.updateAccount(khachHang);
	}

}
