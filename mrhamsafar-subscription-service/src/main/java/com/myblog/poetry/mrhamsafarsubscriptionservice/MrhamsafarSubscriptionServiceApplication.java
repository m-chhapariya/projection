package com.myblog.poetry.mrhamsafarsubscriptionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MrhamsafarSubscriptionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrhamsafarSubscriptionServiceApplication.class, args);
	}

}
