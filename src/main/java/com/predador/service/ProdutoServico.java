package com.predador.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.predador.dao.ProdutoDAO;
import com.predador.entidade.Produto;

import jakarta.annotation.Resource;

@Service
public class ProdutoServico {
	@Resource
	private ProdutoDAO produtoDAO;
	
	public List<Produto> consultarTodos(){
		
		return produtoDAO.findAll();
	}
}
