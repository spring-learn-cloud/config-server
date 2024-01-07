package com.spcloud.learnspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LearnSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringCloudApplication.class, args);
	}

}
