package br.com.gft.forum.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class HelloWorldController {

	@GetMapping
	private ResponseEntity<String> hello (){
		String hello = "Hello World";
		return ResponseEntity.ok(hello);
	}
}
