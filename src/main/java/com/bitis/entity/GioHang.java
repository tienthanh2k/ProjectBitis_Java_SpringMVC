package com.bitis.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

public class GioHang {
	@Id
	@Column(name = "MaGioHang")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maGioHang;
	
	@OneToMany(mappedBy = "gioHang")
	@Fetch(FetchMode.JOIN)
	private List<ChiTietHoaDon> chiTietGioHangs;
	
	@OneToOne(mappedBy = "gioHang")
	private HoaDon hoaDon;

	public GioHang() {
		super();
	}

	public int getMaGioHang() {
		return maGioHang;
	}

	public void setMaGioHang(int maGioHang) {
		this.maGioHang = maGioHang;
	}
	
	public List<ChiTietHoaDon> getChiTietGioHangs() {
		return chiTietGioHangs;
	}

	public void setChiTietGioHangs(List<ChiTietHoaDon> chiTietGioHangs) {
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
