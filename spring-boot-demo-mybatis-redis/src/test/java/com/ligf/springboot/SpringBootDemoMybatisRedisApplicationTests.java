package com.ligf.springboot;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.ligf.springboot.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoMybatisRedisApplicationTests {

	@Autowired
	StringRedisTemplate stringRedisTemplate;
	
	//使用@Resource而不用@Autowired
	//	@Resource
	@Autowired
	RedisTemplate<String, User> redisTemplate;
	
	@Test
	public void test() {
//		stringRedisTemplate.opsForValue().set("name", "Garment");
//		Assert.assertEquals("Garment1", stringRedisTemplate.opsForValue().get("name"));
		
		User user = new User();
		user.setId(1);
		user.setAge(10);
		user.setName("Garment2");
		
		redisTemplate.opsForValue().set(user.getName(), user);
		System.out.println("#### userName:" + redisTemplate.opsForValue().get(user.getName()).getName());
		Assert.assertEquals(user.getName(), redisTemplate.opsForValue().get(user.getName()).getName());
		
	}

}
