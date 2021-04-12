package com.example.gsschedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GsSchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsSchedulingTasksApplication.class, args);
	}

}
