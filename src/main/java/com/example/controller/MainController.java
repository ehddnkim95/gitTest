package com.example.controller;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@GetMapping(value = "/")
	public String main() {
		
		logger.info("Hello ehddnkim");
		return "{\"msg\":\"OK\"}";
	}
=======
public class MainController {

>>>>>>> parent of 01aba89 (이름 추가)
}
