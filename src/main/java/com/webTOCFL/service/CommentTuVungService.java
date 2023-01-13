package com.webTOCFL.service;

import java.util.List;

import com.webTOCFL.entities.BaiTapTuVung;
import com.webTOCFL.entities.CommentTuVung;


public interface CommentTuVungService {
	
 List<CommentTuVung> findByBaiTapTuVung(BaiTapTuVung baitaptuvung);
 void save(CommentTuVung commentTuVung);
 
}
