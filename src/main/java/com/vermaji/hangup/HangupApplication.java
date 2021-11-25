package com.vermaji.hangup;

import com.vermaji.hangup.Service.FileStorageService;
import com.vermaji.hangup.Service.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class HangupApplication implements CommandLineRunner{
	@Resource
	FileStorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(HangupApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		storageService.init();
	}
}
