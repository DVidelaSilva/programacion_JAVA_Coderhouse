package com.coderhouse.clase10_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.clase10_springboot.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
