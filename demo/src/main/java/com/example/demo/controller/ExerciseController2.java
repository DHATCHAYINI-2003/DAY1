package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ExerciseController2{
	@GetMapping("/name")
    public String getName() {
        String studentName = "Panda"; // You can replace this with actual student name retrieval logic
        return "Welcome " + studentName + "!";
    }
}

