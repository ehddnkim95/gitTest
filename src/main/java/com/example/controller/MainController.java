package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(value = "/")
	public String main() {
		
		System.out.println("Hello");
		
		return "{\"msg\":\"OK\"}";
	}
}
