package com.bitis.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

public class CuaHang {
	private int maCuaHang;
	
	private String tenCuaHang;

	private String diaChi;
	
	private String soDT;
	
	private String gioMoCua;
	
	List<SanPham> listSanPham;

	public CuaHang() {
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

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDT() {
		return soDT;
	}

	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}

	public String getGioMoCua() {
		return gioMoCua;
	}

	public void setGioMoCua(String gioMoCua) {
		this.gioMoCua = gioMoCua;
	}

	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	@Override
	public String toString() {
		return "CuaHang [maCuaHang=" + maCuaHang + ", tenCuaHang=" + tenCuaHang + ", diaChi=" + diaChi + ", soDT="
				+ soDT + ", gioMoCua=" + gioMoCua + "]";
	}
	
}
