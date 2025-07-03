package com.test.mark.test_mark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.test.mark.test_mark.integration")
public class TestMarkApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMarkApplication.class, args);
	}

}
