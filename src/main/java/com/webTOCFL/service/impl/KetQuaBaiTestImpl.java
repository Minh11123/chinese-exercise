package com.webTOCFL.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webTOCFL.entities.BaiThiThu;
import com.webTOCFL.entities.KetQuaBaiTest;
import com.webTOCFL.entities.NguoiDung;
import com.webTOCFL.repository.KetQuaBaiTestRepository;
import com.webTOCFL.service.KetQuaBaiTestService;

@Service
public class KetQuaBaiTestImpl implements KetQuaBaiTestService{
	@Autowired
	KetQuaBaiTestRepository ketquabaitestRepo;
	
	@Override
	public void save(KetQuaBaiTest ketquabaitest) {
		ketquabaitestRepo.save(ketquabaitest);
	}
}
