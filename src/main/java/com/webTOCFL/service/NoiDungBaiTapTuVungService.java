package com.webTOCFL.service;

import java.util.List;

import com.webTOCFL.entities.BaiTapTuVung;
import com.webTOCFL.entities.NoiDungBaiTapTuVung;

public interface NoiDungBaiTapTuVungService {
	
	void save(NoiDungBaiTapTuVung noidungbaitaptuvung);
	void delete(Integer id);
	
	List<NoiDungBaiTapTuVung> getListBaiTapTuVung(BaiTapTuVung baitaptuvung);
	
}
