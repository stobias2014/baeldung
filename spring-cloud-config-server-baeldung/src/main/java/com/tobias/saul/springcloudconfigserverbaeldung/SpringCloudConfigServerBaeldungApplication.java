package com.tobias.saul.springcloudconfigserverbaeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerBaeldungApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerBaeldungApplication.class, args);
	}

}
