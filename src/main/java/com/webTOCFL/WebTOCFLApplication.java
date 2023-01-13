package com.webTOCFL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.webTOCFL.entities.NguoiDung;
import com.webTOCFL.service.NguoiDungService;

@SpringBootApplication
@ControllerAdvice
@EnableJpaRepositories()
public class WebTOCFLApplication  extends SpringBootServletInitializer {

//	@Autowired
//	private NguoiDungService nguoiDungService;

	public static void main(String[] args) {
		SpringApplication.run(WebTOCFLApplication.class, args);
	}

//	@ModelAttribute("loggedInUser")
//	public NguoiDung loggedInUser() {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		return nguoiDungService.findByEmail(auth.getName());
//	}

}
