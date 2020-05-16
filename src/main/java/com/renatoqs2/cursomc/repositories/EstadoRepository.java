package com.renatoqs2.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renatoqs2.cursomc.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
