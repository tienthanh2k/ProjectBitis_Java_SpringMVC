package com.bitis.dto;

import java.io.Serializable;
import java.util.Date;

public class HoaDon implements Serializable{
	private static final long serialVersionUID = 1L;

	private int maHoaDon;
	
	private Date ngayLap;
	
	private boolean tinhTrang;
	
	private String ghiChu;
	
	private double phiVanChuyen;
	
	GioHangDTO gioHang;
	
	private KhachHang khachHang;

	public HoaDon() {
		super();
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public double getPhiVanChuyen() {
		return phiVanChuyen;
	}

	public void setPhiVanChuyen(double phiVanChuyen) {
		this.phiVanChuyen = phiVanChuyen;
	}

	public int getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public GioHangDTO getGioHang() {
		return gioHang;
	}

	public void setGioHang(GioHangDTO gioHang) {
		this.gioHang = gioHang;
	}

	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", ngayLap=" + ngayLap + ", tinhTrang=" + tinhTrang + ", ghiChu="
				+ ghiChu + ", phiVanChuyen=" + phiVanChuyen + "]";
	}
}
