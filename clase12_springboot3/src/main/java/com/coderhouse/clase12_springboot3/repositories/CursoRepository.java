package com.coderhouse.clase12_springboot3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.clase12_springboot3.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

}
