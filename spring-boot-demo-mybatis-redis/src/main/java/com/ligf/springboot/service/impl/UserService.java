package com.ligf.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.ligf.springboot.dao.UserDao;
import com.ligf.springboot.domain.User;
import com.ligf.springboot.service.IUserService;

/**
 * User服务层，使用Redis缓存数据
 * @author garment
 *
 */
@Service
public class UserService implements IUserService{
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	RedisTemplate<String, User> redisTemplate;

	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		//直接从数据库中查找
		return userDao.selectAllUser();
	}

	@Override
	public long addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	public long deleteUser(int id) {
		// TODO Auto-generated method stub
		//先删除数据库
		long delId = userDao.deleteUser(id);
		
		//再删除Redis缓存
		String key = "user_" + id;
		if (redisTemplate.hasKey(key)) {
			redisTemplate.delete(key);
		}
		return delId;
	}

	@Override
	public long updateUser(User user) {
		// TODO Auto-generated method stub
		
		//先更新数据库中的数据
		long updateId = userDao.updateUser(user);
		
		//再删除Redis缓存的数据
		String key = "user_" + user.getId();
		if (redisTemplate.hasKey(key)) {
			redisTemplate.delete(key);
		}
		return updateId;
	}

}
