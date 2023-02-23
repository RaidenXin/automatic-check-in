package com.example.automaticcheckin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 自动签到服务启动类
 * @author 疆戟
 * @date 2023/2/23 18:00
 */
@SpringBootApplication
@EnableScheduling
public class AutomaticCheckInApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomaticCheckInApplication.class, args);
	}
}
