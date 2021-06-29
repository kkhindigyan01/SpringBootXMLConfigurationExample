package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:Beans.xml"} )
public class SpringBootXmlConfigurationExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootXmlConfigurationExampleApplication.class, args);
	}
}
