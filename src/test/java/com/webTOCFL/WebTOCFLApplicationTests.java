package com.webTOCFL;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.webTOCFL.entities.BaiTapNghe;
import com.webTOCFL.entities.CauHoiBaiTapNghe;
import com.webTOCFL.repository.BaiTapNgheRepository;
import com.webTOCFL.repository.NguoiDungRepository;
import com.webTOCFL.util.ExcelUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebTOCFLApplicationTests {

	@Autowired
	NguoiDungRepository nguoIDungRepo;
	
	@Autowired
	BaiTapNgheRepository repo;

	@Autowired
	ExcelUtil excelUtil;

	@Test
	public void contextLoads() {
	}

	@Test
	public void tesReadExcel() throws FileNotFoundException {
		Page<BaiTapNghe> page = repo.findByPartAndDoKho(1, 1, PageRequest.of(0,2));
		System.out.println(page.getNumberOfElements());
	}

}
