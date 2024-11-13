package com.coderhouse.clase12_springboot3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.clase12_springboot3.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
