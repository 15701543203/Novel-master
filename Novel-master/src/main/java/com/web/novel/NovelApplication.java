package com.web.novel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.web.novel.dao")
public class NovelApplication {

	public static void main(String[] args) {
		SpringApplication.run(NovelApplication.class, args);
	}
}
