package com.playground.codehub.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeHubRestController {
	@Value("${server.port}")
	private String portNumber;

    @GetMapping("/")
	public String Welcome() {
		return "Welcome to home - Harisha \n You are on the Port : " + portNumber;
	}

	@GetMapping("/list")
	public List getList() {
		List getAll = new ArrayList<>();
		getAll.add("one");
		getAll.add("two");
		getAll.add("one");
		return getAll;
	}

	@GetMapping("/{name}")
	public String dynamicWelcome(@PathVariable String name) {
		return name+", "+"Welcome to home";
	}
}
