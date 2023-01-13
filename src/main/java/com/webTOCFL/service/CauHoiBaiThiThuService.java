package com.webTOCFL.service;

import java.util.List;

import com.webTOCFL.entities.BaiThiThu;
import com.webTOCFL.entities.CauHoiBaiThiThu;

public interface CauHoiBaiThiThuService {
	 void  save(CauHoiBaiThiThu cauhoibaithithu);
	 
	 List<CauHoiBaiThiThu> getListCauHoi(BaiThiThu baithithu);
}
