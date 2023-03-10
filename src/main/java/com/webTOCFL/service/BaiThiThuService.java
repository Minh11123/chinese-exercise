package com.webTOCFL.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.webTOCFL.entities.BaiThiThu;

public interface BaiThiThuService {
	void save(BaiThiThu baithithu);
	List<BaiThiThu> getBaiThiThu(int id);
	
	Page<BaiThiThu> getBaiThiThu(int page, int limit);
	
	List<BaiThiThu> getAllBaiThiThu();
	void delete(int id);
	
}
