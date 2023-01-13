package com.webTOCFL.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;
import com.webTOCFL.entities.BaiTapNghe;
import com.webTOCFL.entities.CauHoiBaiTapNghe;
import com.webTOCFL.entities.QBaiTapNghe;
import com.webTOCFL.repository.BaiTapNgheRepository;
import com.webTOCFL.util.ExcelUtil;

@Service
public class BaiTapNgheService {

	@Autowired
	private BaiTapNgheRepository baiTapNgheRepo;

	@Autowired
	private CauHoiBaitapNgheService cauHoiService;

	@Autowired
	private ExcelUtil excelUtil;

	public List<BaiTapNghe> findAll(){
		return baiTapNgheRepo.findAll();
	}
	public Page<BaiTapNghe> findAllListBaiTapNgheByPartAndDoKho(int page, int size, int part, int doKho) {
		return baiTapNgheRepo.findByPartAndDoKho(part, doKho, PageRequest.of(page-1, size));
	}

	public Page<BaiTapNghe> findAllListBaiTapNgheByPartAndDoKhoAdmin(int page, int size, String part, String doKho) {
		BooleanBuilder builder = new BooleanBuilder();

		if (!part.equals("")) {
			builder.and(QBaiTapNghe.baiTapNghe.part.eq(Integer.parseInt(part)));
		}
		
		if (!doKho.equals("")) {
			builder.and(QBaiTapNghe.baiTapNghe.doKho.eq(Integer.parseInt(doKho)));
		}
		
		return baiTapNgheRepo.findAll(builder, PageRequest.of(page - 1, size));
	}
	
	public Optional<BaiTapNghe> findBaiTapNgheById(long id) {
		return baiTapNgheRepo.findById(id);
	}

	@Transactional
	public BaiTapNghe saveBaiTapNghe(BaiTapNghe baiTapNghe, HttpServletRequest request) {
		List<CauHoiBaiTapNghe> listCauHoi = new ArrayList<>();
		BaiTapNghe currentBaiNghe = baiTapNgheRepo.save(baiTapNghe);
		try {
			for (CauHoiBaiTapNghe cauHoi : excelUtil
					.getListCauHoiFromFileExcel(baiTapNghe.getFileExcelCauHoi().getInputStream())) {
				cauHoi.setBaiTapNghe(currentBaiNghe);
				listCauHoi.add(cauHoiService.saveCauHoiBaiTapNghe(cauHoi, request));
			}
//			currentBaiNghe.setDanhSachCauHoi(listCau);
			return currentBaiNghe;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void deleteBaiTapNghe(long id) {
		baiTapNgheRepo.deleteById(id);
	}
}
