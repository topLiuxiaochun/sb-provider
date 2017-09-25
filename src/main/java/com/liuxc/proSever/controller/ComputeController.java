package com.liuxc.proSever.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {

	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping("/add")
	public String add(Integer a, Integer b) {
		//获取当前服务实例
		ServiceInstance instance = client.getLocalServiceInstance();
		int sum = a + b;
		return "host:" + instance.getHost() + ", port:" + instance.getPort() + ", serverId:" + instance.getServiceId() + ",sum:" + sum;
	}
}
