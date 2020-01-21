package com.springmvc.demo.service;

import java.util.List;

import com.springmvc.demo.model.UserVO;

public interface LoginService {
	List<UserVO> getUserlist();
	UserVO getUser(String userID);
	void joinUser(UserVO user);
}
