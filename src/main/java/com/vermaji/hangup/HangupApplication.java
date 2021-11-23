package com.vermaji.hangup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class HangupApplication {

	public static void main(String[] args) {
		SpringApplication.run(HangupApplication.class, args);
	}
	@RequestMapping("/")
	public String home()
	{
		return "Welcome to hangup app";
	}
}
