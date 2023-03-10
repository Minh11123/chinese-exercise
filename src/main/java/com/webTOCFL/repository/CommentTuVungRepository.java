package com.webTOCFL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webTOCFL.entities.BaiTapTuVung;
import com.webTOCFL.entities.CommentTuVung;


@Repository
public interface CommentTuVungRepository  extends JpaRepository<CommentTuVung,Integer> {
	
	List<CommentTuVung> findByBaitaptuvung(BaiTapTuVung baitaptuvung);

}
