package com.bitis.dto;

import java.util.List;

public class GioHangDTO {
	private int maGioHang;
	
	private List<ChiTietGioHangDTO> chiTietGioHangs;
	
	private HoaDon hoaDon;

	public GioHangDTO() {
		super();
	}

	public int getMaGioHang() {
		return maGioHang;
	}

	public void setMaGioHang(int maGioHang) {
		this.maGioHang = maGioHang;
	}
	
	public List<ChiTietGioHangDTO> getChiTietGioHangs() {
		return chiTietGioHangs;
	}

	public void setChiTietGioHangs(List<ChiTietGioHangDTO> chiTietGioHangs) {
		this.chiTietGioHangs = chiTietGioHangs;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	@Override
	public String toString() {
		return "GioHang [maGioHang=" + maGioHang;
	}
}
