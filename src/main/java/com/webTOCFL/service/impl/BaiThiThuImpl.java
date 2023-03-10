package com.webTOCFL.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.webTOCFL.entities.BaiThiThu;
import com.webTOCFL.repository.BaiThiThuRespository;
import com.webTOCFL.service.BaiThiThuService;

@Service
public class BaiThiThuImpl implements BaiThiThuService{
	
	@Autowired
	BaiThiThuRespository baithithuRepo;
	
	@Override
	public void save(BaiThiThu baithithu) {
		baithithuRepo.save(baithithu);
	}
	
	@Override
	public List<BaiThiThu> getBaiThiThu(int id){
		return baithithuRepo.findByBaithithuid(id);
	}
	
	@Override
	public Page<BaiThiThu> getBaiThiThu(int page, int size){
		return baithithuRepo.findAll(PageRequest.of(page, size));
		
	}
	
	@Override
	public List<BaiThiThu>getAllBaiThiThu(){
		return baithithuRepo.findAll();
	}
	
	@Override
	public void delete(int id) {
		baithithuRepo.deleteById(id);
	}
}
