package com.bitis.enumerate;

public enum LoaiKHEnum {
	ADMIN("ADMIN"), USER("USER");
	
	private String value;
	
	LoaiKHEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public static LoaiKHEnum of(String v) {
		for(LoaiKHEnum loai: LoaiKHEnum.values()) {
			if(loai.getValue().equals(v)) {
				return loai;
			}
		}
		return null;
	}
}
