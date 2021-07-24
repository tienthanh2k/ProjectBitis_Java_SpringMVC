package com.bitis.dto;

import java.io.Serializable;
import java.util.List;

import com.bitis.enumerate.LoaiKHEnum;

public class LoaiKhachHang implements Serializable{

	private static final long serialVersionUID = 1L;

	private int maLoaiKH;
	
	private LoaiKHEnum loai;
	
	List<KhachHang> list;

	public LoaiKhachHang() {
		super();
	}

	public int getMaLoaiKH() {
		return maLoaiKH;
	}

	public void setMaLoaiKH(int maLoaiKH) {
		this.maLoaiKH = maLoaiKH;
	}

	public LoaiKHEnum getLoai() {
		return loai;
	}

	public void setLoai(LoaiKHEnum loai) {
		this.loai = loai;
	}

	public List<KhachHang> getList() {
		return list;
	}

	public void setList(List<KhachHang> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "LoaiKhachHang [maLoaiKH=" + maLoaiKH + ", loai=" + loai + "]";
	}
}
