package com.predador.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.predador.entidade.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer>{


}
