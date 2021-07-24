package com.bitis.dto;

import java.util.List;

public class MauSac {

	private int maMau;
	
	private String tenMau;
	
	private List<SanPham> listSanPham;

	public MauSac() {
	}

	public int getMaMau() {
		return maMau;
	}

	public void setMaMau(int maMau) {
		this.maMau = maMau;
	}

	public String getTenMau() {
		return tenMau;
	}

	public void setTenMau(String tenMau) {
		this.tenMau = tenMau;
	}
	
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	@Override
	public String toString() {
		return "MauSac [maMau=" + maMau + ", tenMau=" + tenMau + "]";
	}
	
}
