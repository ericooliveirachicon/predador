package com.predador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.predador.service.ProdutoServico;

import jakarta.annotation.Resource;

@RestController
@RequestMapping(path = "/produto")
public class ProdutoController {
	@Resource
	private ProdutoServico servico;
	
	@GetMapping(path = "/hello")
	public String hello() {
		
		return "teste";
	}
	
	@GetMapping(path = "/todos")
	public String motrarTodos() throws JsonProcessingException{
		return servico.consultarTodos().toString();
	}
	
}
