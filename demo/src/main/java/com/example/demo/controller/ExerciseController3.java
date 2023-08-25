package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciseController3{
	@Value("${color}")
	private String color;

	@GetMapping("/color")
	public String getColor() {
		return "MY favorite color is  " + color ;
	}
}