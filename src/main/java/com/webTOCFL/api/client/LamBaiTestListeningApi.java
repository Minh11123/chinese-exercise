package com.webTOCFL.api.client;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webTOCFL.entities.CauHoiBaiThiThu;
import com.webTOCFL.entities.KetQuaBaiTest;
import com.webTOCFL.entities.NguoiDung;
import com.webTOCFL.service.BaiThiThuService;
import com.webTOCFL.service.CauHoiBaiThiThuService;
import com.webTOCFL.service.KetQuaBaiTestService;
import com.webTOCFL.service.NguoiDungService;

@RestController
@RequestMapping("api/client/exam")
public class LamBaiTestListeningApi {
	
	@Autowired
	KetQuaBaiTestService ketquabaitestService;
	
	@Autowired
	CauHoiBaiThiThuService cauhoibaithithuService;
	@Autowired
	BaiThiThuService baithithuService;

	private NguoiDungService nguoiDungService;
	public  void setNguoiDungService(NguoiDungService nguoiDungService){
		this.nguoiDungService =  nguoiDungService;
	}
	@ModelAttribute("loggedInUser")
	public NguoiDung getSessionUser(HttpServletRequest request) {
		return (NguoiDung) request.getSession().getAttribute("loggedInUser");
	}
	
	
	@RequestMapping(value="/ajaxTestListening/{baithithuId}/{socaudung}", method = RequestMethod.POST)
	public @ResponseBody
	List<String>  AjaxListening(@RequestBody String[] jsonAnswerUser,
								@PathVariable("baithithuId") int id,
								@PathVariable("socaudung") String socaudung) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		NguoiDung currentUser = nguoiDungService.findByEmail(auth.getName());
		
		List<CauHoiBaiThiThu> list = cauhoibaithithuService.getListCauHoi(baithithuService.getBaiThiThu(id).get(0));
		
		// save ketqua bai test
//		Date time = new Date();
//		KetQuaBaiTest ketquabaitest = new KetQuaBaiTest();
//		ketquabaitest.setNgaythi(time);
//		ketquabaitest.setBaithithu(baithithuService.getBaiThiThu(id).get(0));
//		ketquabaitest.setCorrectlisten(socaudung);
//		ketquabaitest.setNguoidung(currentUser);
//		
//		ketquabaitestService.save(ketquabaitest);
		
		
	
		 
		 List<String> response = new ArrayList<String>();
		 
		 return response;
	}
	
	
}
