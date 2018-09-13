package com.ligf.springboot.service;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ligf.springboot.domain.User;

@Component
public class UserDubboConsumerService {
	
	@Reference(version="1.0.0")
	IUserService userService;
	
	public void getLoginUser() {
		User loginUser = userService.getLoginUser();
		System.out.println("#### UserDubboConsumerService getLoginUser loginUser:" + loginUser);
	}

}
