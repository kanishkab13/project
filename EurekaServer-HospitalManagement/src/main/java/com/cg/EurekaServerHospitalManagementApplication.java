package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerHospitalManagementApplication {
//http:localhost:8803/
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerHospitalManagementApplication.class, args);
	}
}
