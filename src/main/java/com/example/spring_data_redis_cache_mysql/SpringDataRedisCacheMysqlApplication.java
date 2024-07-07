package com.example.spring_data_redis_cache_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringDataRedisCacheMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisCacheMysqlApplication.class, args);
	}

}
