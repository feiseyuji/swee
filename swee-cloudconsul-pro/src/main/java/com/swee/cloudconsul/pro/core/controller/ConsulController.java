package com.swee.cloudconsul.pro.core.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulController {
	
	@GetMapping("/ping")
	public String ping() {
		return " Service ping";
	}

	@GetMapping("/my-health-check")
	public ResponseEntity<String> myCustomCheck() {
		String message = "Testing my healh check function";
		return new ResponseEntity<String>(message, HttpStatus.FORBIDDEN);
	}
}
