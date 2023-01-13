package com.webTOCFL.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webTOCFL.entities.KetQuaBaiTest;

@Repository
public interface KetQuaBaiTestRepository extends JpaRepository<KetQuaBaiTest,Integer> {
	
}
