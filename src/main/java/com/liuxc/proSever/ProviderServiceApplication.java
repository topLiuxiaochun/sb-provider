package com.liuxc.proSever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient     // 注册服务到注册中心
@SpringBootApplication
public class ProviderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceApplication.class, args);

	}

}
