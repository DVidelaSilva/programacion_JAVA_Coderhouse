package com.coderhouse.clase08_jpa.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.clase08_jpa.modelos.Alumno;
import com.coderhouse.clase08_jpa.modelos.Curso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Service
public class DaoFactory {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void createAlumno(Alumno alumno){
        em.persist(alumno);
    }

    @Transactional
    public void createAlumno(Curso curso){
        em.persist(curso);
    }



}
