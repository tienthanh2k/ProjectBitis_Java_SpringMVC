package com.bitis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitis.entity.DanhMuc;
import com.bitis.repository.impl.IDanhMucRepository;
import com.bitis.service.impl.IDanhMucService;

@Service
public class DanhMucService implements IDanhMucService{
	
	@Autowired
	private IDanhMucRepository danhMucRepository;

	public List<DanhMuc> getAllDanhMuc() {
		return danhMucRepository.getAllDanhMuc();
	}
	
}
