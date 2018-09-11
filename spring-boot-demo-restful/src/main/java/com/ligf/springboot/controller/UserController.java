package com.ligf.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ligf.springboot.domain.User;
import com.ligf.springboot.service.IUserService;

@RestController
public class UserController {

	@Autowired
	IUserService userService;
	
	@RequestMapping(value="/api/user/getAllUser",method=RequestMethod.GET)
	public List<User> getAllUser(){
		return userService.getAllUsers();
	}
	
	
}
