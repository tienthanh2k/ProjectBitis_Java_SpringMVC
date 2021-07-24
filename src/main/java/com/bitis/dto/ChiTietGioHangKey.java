package com.bitis.dto;

import java.io.Serializable;

public class ChiTietGioHangKey implements Serializable{
	private int maGioHang;
	
	private int maSanPham;

	public ChiTietGioHangKey() {
	}

	public int getMaGioHang() {
		return maGioHang;
	}

	public void setMaGioHang(int maGioHang) {
		this.maGioHang = maGioHang;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	@Override
	public String toString() {
		return "ChiTietGioHangKey [maGioHang=" + maGioHang + ", maSanPham=" + maSanPham + "]";
	}
	
}
