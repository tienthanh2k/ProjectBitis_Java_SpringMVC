package com.bitis.dto;

import java.util.List;

public class SanPham {
	private int maSanPham;
	
	private String tenSanPham;
	
	private double donGia;
	
	private int soLuongCo;
	
	private String hinhAnh;
	
	private List<Size> sizes;
	
	private List<CuaHang> cuaHangs;
	
	private DanhMuc danhMuc;
	
	private MauSac mauSac;
	
	private List<ChiTietGioHangDTO> chiTietGioHangs;

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

	public List<Size> getSizes() {
		return sizes;
	}

	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
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

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", soLuongCo="
				+ soLuongCo + ", hinhAnh=" + hinhAnh + "]";
	}
	
}
