package com.example.demo;

import org.springframework.scheduling.config.Task;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Task tarea1 = new Task( description: "Aprender Java", done: false, LocalDate.of( year: 2022, month: 12, dayOfMonth: 31 ) );

		System.out.println(tarea1.getDescription());
	}

}
