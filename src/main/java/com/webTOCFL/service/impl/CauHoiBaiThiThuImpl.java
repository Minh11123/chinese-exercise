package com.webTOCFL.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webTOCFL.entities.BaiThiThu;
import com.webTOCFL.entities.CauHoiBaiThiThu;
import com.webTOCFL.repository.CauHoiBaiThiThuRespository;
import com.webTOCFL.service.CauHoiBaiThiThuService;
@Service
public class CauHoiBaiThiThuImpl implements CauHoiBaiThiThuService{
	
	@Autowired
	CauHoiBaiThiThuRespository cauhoibaithithuRepo;
	
	@Override
	public void  save(CauHoiBaiThiThu cauhoibaithithu) {
		 cauhoibaithithuRepo.save(cauhoibaithithu);
	}
	
	@Override 
	public List<CauHoiBaiThiThu> getListCauHoi(BaiThiThu baithithu){
		return cauhoibaithithuRepo.findByBaithithu(baithithu);
	}
}
