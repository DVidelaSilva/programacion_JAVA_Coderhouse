package com.coderhouse.clase12_springboot3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderhouse.clase12_springboot3.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

    

}