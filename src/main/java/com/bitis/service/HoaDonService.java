package com.bitis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitis.entity.HoaDon;
import com.bitis.repository.impl.IHoaDonRepository;
import com.bitis.service.impl.IHoaDonService;

@Service
public class HoaDonService implements IHoaDonService{
	@Autowired
	IHoaDonRepository hoaDonRepository;

	public int addHoaDon(HoaDon hoaDon) {
		return hoaDonRepository.addHoaDon(hoaDon);
	}

}
