package com.webTOCFL.service;

import java.util.List;

import com.webTOCFL.entities.BaiGrammar;
import com.webTOCFL.entities.CommentGrammar;


public interface CommentGrammarService {
	List<CommentGrammar> findByBaiGrammar(BaiGrammar baigrammar);
	 void save(CommentGrammar commentGrammar);
}
