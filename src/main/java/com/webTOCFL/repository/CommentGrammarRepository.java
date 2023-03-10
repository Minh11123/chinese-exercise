package com.webTOCFL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webTOCFL.entities.BaiGrammar;
import com.webTOCFL.entities.CommentGrammar;

@Repository
public interface CommentGrammarRepository  extends JpaRepository<CommentGrammar,Integer>{

	List<CommentGrammar> findByBaigrammar(BaiGrammar baigrammar);

}
