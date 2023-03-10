package com.webTOCFL.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.webTOCFL.entities.BaiTapDoc;
import org.springframework.stereotype.Repository;

@Repository
public interface BaiTapDocRepository extends JpaRepository<BaiTapDoc, Long>, QuerydslPredicateExecutor<BaiTapDoc> {
	Page<BaiTapDoc> findByPartAndDoKho(int part, int doKho, Pageable pageable);

}
