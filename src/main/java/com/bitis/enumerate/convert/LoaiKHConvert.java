package com.bitis.enumerate.convert;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.bitis.enumerate.LoaiKHEnum;

@Converter
public class LoaiKHConvert implements AttributeConverter<LoaiKHEnum, String>{
	// convert Enum to DATABASE
	public String convertToDatabaseColumn(LoaiKHEnum loaiKH) {
		if(loaiKH == null) {
			return null;
		}
		return loaiKH.getValue();
	}

	// convert DATABASE to entity
	public LoaiKHEnum convertToEntityAttribute(String v) {
		return LoaiKHEnum.of(v);
	}

}
