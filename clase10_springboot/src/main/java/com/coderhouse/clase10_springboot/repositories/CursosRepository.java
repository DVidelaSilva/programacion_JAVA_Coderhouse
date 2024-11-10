package com.coderhouse.clase10_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.clase10_springboot.models.Curso;

public interface CursosRepository extends JpaRepository<Curso, Long>{

}
