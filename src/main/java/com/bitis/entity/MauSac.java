package com.bitis.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "MauSac")
public class MauSac {
	@Id
	@Column(name = "MaMau")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maMau;
	
	@Column(name = "TenMau")
	private String tenMau;
	
	@OneToMany(mappedBy = "mauSac")
	@Fetch(FetchMode.JOIN)
	private List<SanPham> listSanPham;

	public MauSac() {
	}

	public int getMaMau() {
		return maMau;
	}

	public void setMaMau(int maMau) {
		this.maMau = maMau;
	}

	public String getTenMau() {
		return tenMau;
	}

	public void setTenMau(String tenMau) {
		this.tenMau = tenMau;
	}
	
	public List<SanPham> getListSanPham() {
		return listSanPham;
	}

	public void setListSanPham(List<SanPham> listSanPham) {
		this.listSanPham = listSanPham;
	}

	@Override
	public String toString() {
		return "MauSac [maMau=" + maMau + ", tenMau=" + tenMau + "]";
	}
	
}
