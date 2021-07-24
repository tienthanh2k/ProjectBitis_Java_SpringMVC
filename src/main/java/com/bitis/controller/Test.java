package com.bitis.controller;

import java.util.List;

import com.bitis.entity.HoaDon;
import com.bitis.repository.HoaDonRepository;

public class Test {
	public static void main(String[] args) {
//		ChiTietSanPhamRepository repository = new ChiTietSanPhamRepository();
//		List<ChiTietSanPham> list = repository.getAllChiTietSanPhams();
//		
//		for(ChiTietSanPham a: list) {
//			System.out.println(a);
//			System.out.println(a.getSize());
//		}
		
//		SanPhamRepository repository = new SanPhamRepository();
//		List<SanPham> list = repository.getAllSanPhams();
//		
//		for(SanPham a: list) {
//			System.out.println(a);
//			for(ChiTietSanPham b: a.getListChiTietSanPham()) {
//				System.out.println(b);
//			}
//			for(CuaHang c: a.getCuaHangs()) {
//				System.out.println(c);
//			}
//		}
//		ChiTietHoaDonRepository repository = new ChiTietHoaDonRepository();
//		List<ChiTietHoaDon> list = repository.getAllChiTietHoaDon();
//		for(ChiTietHoaDon a: list) {
//			System.out.println(a);
//			System.out.println(a.getChiTietSanPham());
//			System.out.println(a.getHoaDon());
//		}
		
		HoaDonRepository repository = new HoaDonRepository();
		List<HoaDon> list = repository.getAllHoaDon();
		for(HoaDon a: list) {
			System.out.println(a);
			System.out.println(a.getKhachHang());
			System.out.println(a.getChiTietHoaDon());
		}
	}
}
