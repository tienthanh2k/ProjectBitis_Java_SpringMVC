package com.bitis.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Size")
public class Size {
	@Id
	@Column(name = "MaSize")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maSize;
	
	@Column(name = "TenSize")
	private String tenSize;
	
//	@ManyToMany(mappedBy = "sizes")
//	List<SanPham> listSanpham;

	@OneToMany(mappedBy = "size")
	private List<ChiTietSanPham> listChiTietSanPham;
	
	public Size() {
	}

	public int getMaSize() {
		return maSize;
	}

	public void setMaSize(int maSize) {
		this.maSize = maSize;
	}

	public String getTenSize() {
		return tenSize;
	}

	public void setTenSize(String tenSize) {
		this.tenSize = tenSize;
	}

	@Override
	public String toString() {
		return "Size [maSize=" + maSize + ", tenSize=" + tenSize + "]";
	}
	
}
