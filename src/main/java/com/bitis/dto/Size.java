package com.bitis.dto;

import java.util.List;

public class Size {

	private int maSize;
	
	private String tenSize;
	
	List<SanPham> listSanpham;

	public Size() {
	}

	public int getMaSize() {
		return maSize;
	}

	public void setMaSize(int maSize) {
		this.maSize = maSize;
	}

	public String getTenSize() {
		return tenSize;
	}

	public void setTenSize(String tenSize) {
		this.tenSize = tenSize;
	}

	public List<SanPham> getListSanpham() {
		return listSanpham;
	}

	public void setListSanpham(List<SanPham> listSanpham) {
		this.listSanpham = listSanpham;
	}

	@Override
	public String toString() {
		return "Size [maSize=" + maSize + ", tenSize=" + tenSize + "]";
	}
	
}
