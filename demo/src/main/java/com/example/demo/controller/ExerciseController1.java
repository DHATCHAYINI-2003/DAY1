package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ExerciseController1 {
@GetMapping("/welcome")
public String  Welcome() {
	return "Welcome String Boot!";
}
}

