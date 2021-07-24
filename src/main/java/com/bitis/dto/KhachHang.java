package com.bitis.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

public class KhachHang {
	private int maCuaHang;
	
	private String tenCuaHang;
	
	private String email;
	
	private String soDT;

	private String matKhau;
	
	LoaiKhachHang loaiKhachHang;
	
	List<HoaDon> listHoaDon;

	public KhachHang() {
		super();
	}

	public int getMaCuaHang() {
		return maCuaHang;
	}

	public void setMaCuaHang(int maCuaHang) {
		this.maCuaHang = maCuaHang;
	}

	public String getTenCuaHang() {
		return tenCuaHang;
	}

	public void setTenCuaHang(String tenCuaHang) {
		this.tenCuaHang = tenCuaHang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public LoaiKhachHang getLoaiKhachHang() {
		return loaiKhachHang;
	}

	public void setLoaiKhachHang(LoaiKhachHang loaiKhachHang) {
		this.loaiKhachHang = loaiKhachHang;
	}

	public List<HoaDon> getListHoaDon() {
		return listHoaDon;
	}

	public void setListHoaDon(List<HoaDon> listHoaDon) {
		this.listHoaDon = listHoaDon;
	}

	@Override
	public String toString() {
		return "KhachHang [maCuaHang=" + maCuaHang + ", tenCuaHang=" + tenCuaHang + ", email=" + email + ", soDT="
				+ soDT + ", matKhau=" + matKhau + ", loaiKhachHang=" + loaiKhachHang + "]";
	}
}
