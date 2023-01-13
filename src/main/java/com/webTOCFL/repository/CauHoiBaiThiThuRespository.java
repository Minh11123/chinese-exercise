package com.webTOCFL.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webTOCFL.entities.BaiThiThu;
import com.webTOCFL.entities.CauHoiBaiThiThu;
@Repository
public interface CauHoiBaiThiThuRespository extends JpaRepository<CauHoiBaiThiThu,Integer>{
	
	List<CauHoiBaiThiThu> findByBaithithu(BaiThiThu baithithu);

}
