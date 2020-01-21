package com.springmvc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.demo.mapper.UserMapper;
import com.springmvc.demo.model.UserVO;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<UserVO> getUserlist() {
		// TODO Auto-generated method stub
		return userMapper.getUserlist();
	}

	@Override
	public UserVO getUser(String userID) {
		// TODO Auto-generated method stub
		return userMapper.getUser(userID);
	}

	@Override
	public void joinUser(UserVO user) {
		// TODO Auto-generated method stub
		userMapper.joinUser(user);
		
	}
	
}
