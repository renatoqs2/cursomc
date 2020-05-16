package com.renatoqs2.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renatoqs2.cursomc.dominio.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
