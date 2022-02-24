package com.playground.codehub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeHubRestController {
    @GetMapping("/")
	public String Welcome() {
		return "Welcome to home";
	}
}
