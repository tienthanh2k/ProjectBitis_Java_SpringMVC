package com.bitis.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.bitis.enumerate.LoaiKHEnum;
import com.bitis.enumerate.convert.LoaiKHConvert;

@Entity
@Table(name = "LoaiKH")
public class LoaiKhachHang implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MaLoaiKH")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maLoaiKH;
	
	@Column(name = "Loai", unique = true)
	@Convert(converter = LoaiKHConvert.class)
	private LoaiKHEnum loai;
	
	@OneToMany(mappedBy = "loaiKhachHang", fetch = FetchType.EAGER)
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
