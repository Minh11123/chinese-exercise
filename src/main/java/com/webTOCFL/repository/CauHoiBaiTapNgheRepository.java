package com.webTOCFL.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.webTOCFL.entities.CauHoiBaiTapNghe;
import org.springframework.stereotype.Repository;

@Repository
public interface CauHoiBaiTapNgheRepository extends JpaRepository<CauHoiBaiTapNghe, Long> {

	Page<CauHoiBaiTapNghe> findByBaiTapNgheId(long baiTapNgheId, Pageable pageable);
	List<CauHoiBaiTapNghe> findByBaiTapNgheId(long baiTapNgheId);
}
