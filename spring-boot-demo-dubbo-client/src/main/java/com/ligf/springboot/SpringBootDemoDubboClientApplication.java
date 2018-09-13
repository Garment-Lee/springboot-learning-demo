package com.ligf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ligf.springboot.service.UserDubboConsumerService;

@SpringBootApplication
public class SpringBootDemoDubboClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SpringBootDemoDubboClientApplication.class, args);
		UserDubboConsumerService userService = configurableApplicationContext.getBean(UserDubboConsumerService.class);
		userService.getLoginUser();
	}
}
