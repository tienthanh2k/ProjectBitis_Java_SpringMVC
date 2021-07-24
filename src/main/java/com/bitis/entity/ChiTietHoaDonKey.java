package com.bitis.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ChiTietHoaDonKey implements Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name = "MaHoaDon")
	private int maHoaDon;
	
	@Column(name = "MaChiTietSanPham")
	private int maChiTietSanPham;

	public ChiTietHoaDonKey() {
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public int getMaChiTietSanPham() {
		return maChiTietSanPham;
	}

	public void setMaChiTietSanPham(int maChiTietSanPham) {
		this.maChiTietSanPham = maChiTietSanPham;
	}
}
