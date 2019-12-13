package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestcontroller {

	@GetMapping("/hello")
	public String hello() {
		return "helloWorld"; 
	}
}
