package com.coderhouse.clase08_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.clase08_jpa.dao.DaoFactory;
import com.coderhouse.clase08_jpa.modelos.Alumno;
import com.coderhouse.clase08_jpa.modelos.Curso;

@SpringBootApplication
public class Clase08JpaApplication implements CommandLineRunner{

	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase08JpaApplication.class, args);
	}

	//
	@Override
	public void run(String... arg) throws Exception{
		try {

			Curso curso1 = new Curso("HTML");
			Curso curso2 = new Curso("CSS");
			Curso curso3 = new Curso("Java");

			Alumno alumno1 = new Alumno("Alejando", "Di Stefano", 22555666L, "L22555666");
			Alumno alumno2 = new Alumno("Agustin", "Barraza", 333555666L, "L333555666L");
			Alumno alumno3 = new Alumno("Bruno", "Lezama", 444555666L, "L444555666L");

			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);
			dao.createAlumno(curso1);
			dao.createAlumno(curso2);
			dao.createAlumno(curso3);

		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}
}
