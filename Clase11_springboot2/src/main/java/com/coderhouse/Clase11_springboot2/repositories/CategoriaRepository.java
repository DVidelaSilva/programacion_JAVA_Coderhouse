package com.coderhouse.Clase11_springboot2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.Clase11_springboot2.models.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
