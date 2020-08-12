package com.ziumks.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CconfigApplication.class, args);
	}

}
