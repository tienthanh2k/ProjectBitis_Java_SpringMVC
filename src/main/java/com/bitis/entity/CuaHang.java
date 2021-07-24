package com.bitis.entity;

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

@Entity
@Table(name = "CuaHang")
public class CuaHang {
	@Id
	@Column(name = "MaCuaHang")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maCuaHang;
	
	@Column(name = "TenCuaHang")
	private String tenCuaHang;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	@Column(name = "SoDT")
	private String soDT;
	
	@Column(name = "GioMoCua")
	private String gioMoCua;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "CuaHang_SanPham", 
			joinColumns = @JoinColumn(name = "MaCuaHang"),
			inverseJoinColumns = @JoinColumn(name = "MaSanPham"))
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
