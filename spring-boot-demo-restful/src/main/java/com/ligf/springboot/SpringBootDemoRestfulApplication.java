package com.ligf.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapper 接口类扫描包配置
@MapperScan("com.ligf.springboot.dao")
public class SpringBootDemoRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoRestfulApplication.class, args);
	}
}
