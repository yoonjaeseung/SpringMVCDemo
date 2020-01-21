package com.springmvc.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.demo.model.UserVO;
import com.springmvc.demo.service.LoginService;

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
		System.out.println(userVO);
		UserVO loginuser = service.getUser(userVO.getUserID());
		System.out.println(loginuser);
		session.setAttribute("userid", loginuser.getUserID());
		return "home";


	}
}
