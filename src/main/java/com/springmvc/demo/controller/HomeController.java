package com.springmvc.demo.controller;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.demo.model.HomeVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// 실행 시 404 에러. url 뒤에 home 경로 써줘야 됨
	/*
	 * @RequestMapping("/home") public String handler(Model model) {
	 * logger.info("controller");
	 * 
	 * HomeVO home = new HomeVO();
	 * home.setMessage("Hello World Example Using Spring MVC 5!!!");
	 * home.setDateTime(LocalDateTime.now().toString()); model.addAttribute("home",
	 * home); return "home"; }
	 */

	@RequestMapping("/")
	public String handler2(Model model) {
		logger.info("controller");

		HomeVO homeVO = new HomeVO();
		homeVO.setMessage("Hello World Example Using Spring MVC 5!!!");
		homeVO.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("home", homeVO);
		return "home";
	}
	
}
