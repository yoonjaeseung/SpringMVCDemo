package com.springmvc.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.demo.model.UserVO;
import com.springmvc.demo.service.LoginService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	@Autowired //
	private LoginService service; //

	@GetMapping("/login")
	public String login(UserVO userVO) {
		return "login";
	}

	@PostMapping("/login")
	public String login(UserVO userVO, HttpSession session, Model model) throws Exception {
		log.info("=======LoginController=======");
		System.out.println(userVO);
		UserVO loginuser = service.getUser(userVO.getUserID());
		System.out.println(loginuser);
		log.info("=======Login=======");

		if (userVO.getUserPWD().equals(loginuser.getUserPWD())) {
			// userVO userPWD와 loginuser userPWD가 동일할 경우
			session.setAttribute("userID", loginuser.getUserID());
			return "home";
		}

		else {
			return "login";
		}

	}
}
