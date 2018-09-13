package com.ligf.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ligf.springboot.domain.User;
import com.ligf.springboot.service.IUserService;

@Service(version="1.0.0")
public class UserService implements IUserService{

	@Override
	public User getLoginUser() {
		// TODO Auto-generated method stub
		User loginUser = new User();
		loginUser.setName("Garment");
		loginUser.setAge(28);
		loginUser.setSex(1);
		loginUser.setPhoneNum("12563256325");
		return loginUser;
	}

}
