package com.ent.qbthon.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class QbthonConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(QbthonConfigServerApplication.class, args);
	}

}
