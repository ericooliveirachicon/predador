package com.predador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {
	
	@GetMapping(path = "/hello")
	public String hello() {
		
		return "teste";
	}
	
}
