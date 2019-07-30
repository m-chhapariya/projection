package com.myblog.poetry.mrhamsafarcommentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MrhamsafarCommentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrhamsafarCommentServiceApplication.class, args);
	}

}
