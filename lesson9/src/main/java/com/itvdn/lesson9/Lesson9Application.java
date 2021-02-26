package com.itvdn.lesson9;

import com.itvdn.lesson9.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson9Application implements CommandLineRunner {
	@Autowired
	private AsyncService asyncService;

	public static void main(String[] args) {
		SpringApplication.run(Lesson9Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		asyncService.doAsync();
		asyncService.doAsync();
		asyncService.doAsync();
	}
}
