package com.ligf.springboot.dao;

import java.util.List;

import com.ligf.springboot.domain.User;

public interface UserDao {
	
	List<User> selectAllUser();

}
