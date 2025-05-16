package com.example.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@GetMapping(value = "/")
	public String main() {
		
		logger.info("Hello ehddnkim");
		return "{\"msg\":\"OK\"}";
	}
	@GetMapping(value = "/list")
	public String list() {
		return "";
	}
	
	@PostMapping(value = "/write")
	public Map<String, Object> write() {
		return null;
	}
	
	@PostMapping(value = "/update")
	public ResponseEntity<Resource> update(){
		return null;
	}
	
	@DeleteMapping(value = "/del")
	public ResponseEntity<?> del(){
		return null;
	}
	
	
}
