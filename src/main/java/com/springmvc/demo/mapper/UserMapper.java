package com.springmvc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springmvc.demo.model.UserVO;

@Mapper
public interface UserMapper {
	List<UserVO> getUserlist();

	void joinUser(UserVO user);

	UserVO getUser(String userID);
}
