package com.bitis.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "KhachHang")
public class KhachHang {
	@Id
	@Column(name = "MaKH")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maKH;
	
	@Column(name = "TenKH")
	private String tenKH;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "SoDT")
	private String soDT;
	
	@Column(name = "MatKhau")
	private String matKhau;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MaLoaiKH", referencedColumnName = "MaLoaiKH")
	LoaiKhachHang loaiKhachHang;
	
	@OneToMany(mappedBy = "khachHang")
	@Fetch(FetchMode.JOIN)
	List<HoaDon> listHoaDon;

	public KhachHang() {
		super();
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maCuaHang) {
		this.maKH = maCuaHang;
	}
	
	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
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
	
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "KhachHang [maCuaHang=" + maKH + ", tenCuaHang=" + tenKH + ", email=" + email + ", soDT="
				+ soDT + ", matKhau=" + matKhau + ", loaiKhachHang=" + loaiKhachHang + "]";
	}
}
