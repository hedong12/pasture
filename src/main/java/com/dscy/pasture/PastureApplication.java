package com.dscy.pasture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dscy.pasture.mapper")
@SpringBootApplication
public class PastureApplication {

	public static void main(String[] args) {
		SpringApplication.run(PastureApplication.class, args);
	}

}
