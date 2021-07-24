package com.bitis.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "HoaDon")
public class HoaDon implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MaHoaDon")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHoaDon;
	
	@Column(name = "NgayLap")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date ngayLap;
	
	@Column(name = "TinhTrang")
	private boolean tinhTrang;
	
	@Column(name = "GhiChu")
	private String ghiChu;
	
	@Column(name = "HinhThuc")
	private String hinhThuc;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	@Column(name = "PhiVanChuyen")
	private double phiVanChuyen;
	
//	@OneToOne
//	@JoinColumn(name = "MaGioHang", referencedColumnName = "MaGioHang")
//	GioHang gioHang;
	
	
	@OneToMany(mappedBy = "hoaDon")
	@Fetch(FetchMode.JOIN)
	private List<ChiTietHoaDon> chiTietHoaDon;
	
	@OneToOne
	@JoinColumn(name = "MaKH", referencedColumnName = "MaKH")
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
	
	public String getHinhThuc() {
		return hinhThuc;
	}

	public void setHinhThuc(String hinhThuc) {
		this.hinhThuc = hinhThuc;
	}

	public List<ChiTietHoaDon> getChiTietHoaDon() {
		return chiTietHoaDon;
	}

	public void setChiTietHoaDon(List<ChiTietHoaDon> chiTietHoaDon) {
		this.chiTietHoaDon = chiTietHoaDon;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", ngayLap=" + ngayLap + ", tinhTrang=" + tinhTrang + ", ghiChu="
				+ ghiChu + ", phiVanChuyen=" + phiVanChuyen + "]";
	}
}
