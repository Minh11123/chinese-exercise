package com.webTOCFL.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.webTOCFL.entities.CauHoiBaiTapDoc;
import org.springframework.stereotype.Repository;

@Repository
public interface CauHoiBaiTapDocRepository extends JpaRepository<CauHoiBaiTapDoc, Long> {

	Page<CauHoiBaiTapDoc> findByBaiTapDocId(long baiTapDocId, Pageable pageable);
	List<CauHoiBaiTapDoc> findByBaiTapDocId(long baiTapDocId);
}
