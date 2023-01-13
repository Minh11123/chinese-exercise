package com.webTOCFL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webTOCFL.entities.BaiTapTuVung;
import com.webTOCFL.entities.NoiDungBaiTapTuVung;

@Repository
public interface NoiDungBaiTapTuVungRepository extends JpaRepository<NoiDungBaiTapTuVung,Integer>{

	List<NoiDungBaiTapTuVung> findByBaitaptuvung(BaiTapTuVung baitaptuvung);
	
}
