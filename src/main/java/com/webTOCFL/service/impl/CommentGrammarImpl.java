package com.webTOCFL.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webTOCFL.entities.BaiGrammar;
import com.webTOCFL.entities.CommentGrammar;
import com.webTOCFL.repository.CommentGrammarRepository;
import com.webTOCFL.service.CommentGrammarService;

@Service
public class CommentGrammarImpl implements  CommentGrammarService {
	@Autowired
	CommentGrammarRepository commentgrammarRepo;
	
	@Override
	public List<CommentGrammar> findByBaiGrammar(BaiGrammar baigrammar){
		return commentgrammarRepo.findByBaigrammar(baigrammar);
	}
	
	 @Override
	 public void save(CommentGrammar commentGrammar) {
		 commentgrammarRepo.save(commentGrammar);
		 
	 }
}
