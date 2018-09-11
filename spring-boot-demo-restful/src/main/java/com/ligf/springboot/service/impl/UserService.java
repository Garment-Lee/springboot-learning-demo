package com.ligf.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ligf.springboot.dao.UserDao;
import com.ligf.springboot.domain.User;
import com.ligf.springboot.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.selectAllUser();
	}

}
