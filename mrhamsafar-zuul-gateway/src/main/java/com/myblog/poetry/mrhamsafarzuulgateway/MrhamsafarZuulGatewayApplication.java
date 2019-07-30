package com.myblog.poetry.mrhamsafarzuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class MrhamsafarZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrhamsafarZuulGatewayApplication.class, args);
	}

}
