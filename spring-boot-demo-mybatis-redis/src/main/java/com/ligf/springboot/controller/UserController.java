package com.ligf.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ligf.springboot.domain.User;
import com.ligf.springboot.service.IUserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	IUserService userService;

	@RequestMapping(value="/selectAllUser", method=RequestMethod.GET)
	public List<User> selectAllUser(){
		return userService.selectAllUser();
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public void addUser(User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.GET)
	public void deleteUser(int id) {
		userService.deleteUser(id);
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public void updateUser(User user) {
		userService.updateUser(user);
	}
}
