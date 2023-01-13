package com.webTOCFL.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webTOCFL.entities.SlideBanner;
import com.webTOCFL.repository.SlideBannerRespository;
import com.webTOCFL.service.SlideBannerService;
@Service
public class SlideBannerServiceImpl implements SlideBannerService{

	@Autowired SlideBannerRespository slideBannerRespository;
	
	@Override
	public List<SlideBanner> findAll(){
		return slideBannerRespository.findAllByOrderBySlidebanneridAsc();
	}
}
