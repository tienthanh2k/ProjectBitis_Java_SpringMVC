package com.bitis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitis.entity.Size;
import com.bitis.repository.impl.ISizeRepository;
import com.bitis.service.impl.ISizeService;

@Service
public class SizeService implements ISizeService{
	
	@Autowired
	private ISizeRepository sizeRepository;

	public List<Size> getAllSizes() {
		return sizeRepository.getAllSizes();
	}
	
}
