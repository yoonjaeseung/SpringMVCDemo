package com.springmvc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springmvc.demo.model.UserVO;

@Mapper
public interface UserMapper {
	List<UserVO> getUserlist();

	UserVO getUser(String userId);

	void joinUser(UserVO user);
}
