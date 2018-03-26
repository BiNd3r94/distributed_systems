package com.First_Spring_App.First_Spring_App;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
	}
	
	ArrayList<String> list = new ArrayList<String>();

	@GetMapping("/todos")
	String todos(){

		return list.toString();

	}

	@PostMapping("/add/{todo}")
	String add(@PathVariable String todo){

		list.add(todo);
		return todo;
	}

	@DeleteMapping("/delete/{todo}")
	String delete(@PathVariable String todo){

		list.remove(todo);
		return todo;
}
	
	
}
