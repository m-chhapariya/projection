package com.myblog.poetry.mrhamsafarpostservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MrhamsafarPostServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrhamsafarPostServiceApplication.class, args);
	}

}
