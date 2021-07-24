package com.bitis.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "ChiTietHoaDon")
public class ChiTietHoaDon {
	@EmbeddedId
	ChiTietHoaDonKey id;
	
	@Column(name = "SoLuong")
	private int soLuong;
	
	@ManyToOne
	@MapsId("MaHoaDon")
	@JoinColumn(name = "MaHoaDon")
	private HoaDon hoaDon;
	
	@ManyToOne
	@MapsId("MaChiTietSanPham")
	@JoinColumn(name = "MaChiTietSanPham")
	private ChiTietSanPham chiTietSanPham;

	public ChiTietHoaDon() {
	}

	public ChiTietHoaDonKey getId() {
		return id;
	}

	public void setId(ChiTietHoaDonKey id) {
		this.id = id;
	}

	public int getSoLuong() {
		return soLuong;
	}
	
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [soLuong=" + soLuong ;
	}

}
