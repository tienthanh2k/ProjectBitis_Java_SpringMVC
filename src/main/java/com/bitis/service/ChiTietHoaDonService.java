package com.bitis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitis.entity.ChiTietHoaDon;
import com.bitis.repository.impl.IChiTietHoaDonRepository;
import com.bitis.service.impl.IChiTietHoaDonService;

@Service
public class ChiTietHoaDonService implements IChiTietHoaDonService{
	@Autowired
	private IChiTietHoaDonRepository chiTietHoaDonRepository;

	public boolean addChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) {
		return chiTietHoaDonRepository.addChiTietHoaDon(chiTietHoaDon);
	}

}
