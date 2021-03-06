package com.spb.art;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ArtApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArtApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(ArtApplication.class, args);
		
		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
}
