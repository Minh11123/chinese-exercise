package com.webTOCFL.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webTOCFL.entities.BaiTapTuVung;
import com.webTOCFL.entities.NoiDungBaiTapTuVung;
import com.webTOCFL.repository.NoiDungBaiTapTuVungRepository;
import com.webTOCFL.service.NoiDungBaiTapTuVungService;

@Service
public class NoiDungBaiTapTuVungImpl implements NoiDungBaiTapTuVungService {
	
	@Autowired
	NoiDungBaiTapTuVungRepository ndbaitaptuvungrepository;
	@Override
	public void save(NoiDungBaiTapTuVung noidungbaitaptuvung) {
		ndbaitaptuvungrepository.save(noidungbaitaptuvung);
	}
	
	
	@Override
	public void delete(Integer id) {
		ndbaitaptuvungrepository.deleteById(id);
	}
	
	
	@Override
	public List<NoiDungBaiTapTuVung> getListBaiTapTuVung(BaiTapTuVung baitaptuvung){
		
		return ndbaitaptuvungrepository.findByBaitaptuvung(baitaptuvung);
	}

}
