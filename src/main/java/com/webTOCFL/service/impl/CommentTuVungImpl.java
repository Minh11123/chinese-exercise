package com.webTOCFL.service.impl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webTOCFL.entities.BaiTapTuVung;
import com.webTOCFL.entities.CommentTuVung;
import com.webTOCFL.entities.NguoiDung;
import com.webTOCFL.repository.CommentTuVungRepository;
import com.webTOCFL.service.CommentTuVungService;

@Service
public class CommentTuVungImpl implements CommentTuVungService {
	
	@Autowired
	CommentTuVungRepository commenttuvungRepo;
	
	@Override
	public List<CommentTuVung> findByBaiTapTuVung(BaiTapTuVung baitaptuvung){
		return commenttuvungRepo.findByBaitaptuvung(baitaptuvung);
	}
	
	 @Override
	 public void save(CommentTuVung commentTuVung) {
		  commenttuvungRepo.save(commentTuVung);
	 }
	

}
