package com.ligf.springboot.service;

import java.util.List;

import com.ligf.springboot.domain.User;

public interface IUserService {

	List<User> selectAllUser();
	
	long addUser(User user);
	
	long deleteUser(int id);
	
	long updateUser(User user);
}
