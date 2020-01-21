package com.springmvc.demo.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserVO {
	private String userID;
	private String userPWD;
	private String name;
}
