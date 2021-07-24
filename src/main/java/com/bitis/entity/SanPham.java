package com.bitis.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "SanPham")
public class SanPham {
	@Id
	@Column(name = "MaSanPham")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSanPham;
	
	@Column(name = "TenSanPham")
	private String tenSanPham;
	
	@Column(name = "DonGia")
	private double donGia;
	
	@Column(name = "SoLuongCo")
	private int soLuongCo;
	
	@Column(name = "HinhAnh")
	private String hinhAnh;
	
	@OneToMany(mappedBy = "sanPham", fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.JOIN)
	List<ChiTietSanPham> listChiTietSanPham;
	
//	@ManyToMany(fetch=FetchType.EAGER)
//	@JoinTable(
//			  name = "Size_SanPham", 
//			  joinColumns = @JoinColumn(name = "MaSanPham"), 
//			  inverseJoinColumns = @JoinColumn(name = "MaSize"))
//	private List<Size> sizes;
	
	@ManyToMany(mappedBy = "listSanPham", fetch=FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT) // giup thuc hien 2 chieu ket noi voi cua hang
	private List<CuaHang> cuaHangs;
	
	@ManyToOne()
	@JoinColumn(name = "MaDanhMuc", referencedColumnName = "MaDanhMuc")
	private DanhMuc danhMuc;
	
	@OneToOne()
	@JoinColumn(name = "MaMau", referencedColumnName = "MaMau")
	private MauSac mauSac;

	public SanPham() {
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

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuongCo() {
		return soLuongCo;
	}

	public void setSoLuongCo(int soLuongCo) {
		this.soLuongCo = soLuongCo;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public List<CuaHang> getCuaHangs() {
		return cuaHangs;
	}

	public void setCuaHangs(List<CuaHang> cuaHangs) {
		this.cuaHangs = cuaHangs;
	}

	public DanhMuc getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMuc danhMuc) {
		this.danhMuc = danhMuc;
	}
	
	public MauSac getMauSac() {
		return mauSac;
	}

	public void setMauSac(MauSac mauSac) {
		this.mauSac = mauSac;
	}

	public List<ChiTietSanPham> getListChiTietSanPham() {
		return listChiTietSanPham;
	}

	public void setListChiTietSanPham(List<ChiTietSanPham> listChiTietSanPham) {
		this.listChiTietSanPham = listChiTietSanPham;
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", soLuongCo="
				+ soLuongCo + ", hinhAnh=" + hinhAnh + "]";
	}
	
}
