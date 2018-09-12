package com.ligf.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ligf.springboot.dao")
public class SpringBootDemoMybatisRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoMybatisRedisApplication.class, args);
	}
}
