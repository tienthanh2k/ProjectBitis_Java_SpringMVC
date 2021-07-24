package com.bitis.dto;

public class ChiTietGioHangDTO {
	private int maChiTietSanPham;
	
	private int maSanPham;
	
	private String tenSanPham;
	
	private int maSize;
	
	private String tenSize;
	
	private double donGia;
	
	private int maMau;
	
	private String tenMau;
	
	private int soLuongMua;
	
	private int soLuongCon;

	public ChiTietGioHangDTO() {
	}

	public int getMaChiTietSanPham() {
		return maChiTietSanPham;
	}

	public void setMaChiTietSanPham(int maChiTietSanPham) {
		this.maChiTietSanPham = maChiTietSanPham;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
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

	public int getSoLuongMua() {
		return soLuongMua;
	}

	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}

	public int getSoLuongCon() {
		return soLuongCon;
	}

	public void setSoLuongCon(int soLuongCon) {
		this.soLuongCon = soLuongCon;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "ChiTietGioHangDTO [maChiTietSanPham=" + maChiTietSanPham + ", maSanPham=" + maSanPham + ", tenSanPham="
				+ tenSanPham + ", maSize=" + maSize + ", tenSize=" + tenSize + ", donGia=" + donGia + ", maMau=" + maMau
				+ ", tenMau=" + tenMau + ", soLuongMua=" + soLuongMua + ", soLuongCon=" + soLuongCon + "]";
	}
	
	
}
