package com.coderhouse.clase09_workshop_1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.clase09_workshop_1.dao.DaoFactory;
import com.coderhouse.clase09_workshop_1.models.Alumno;
import com.coderhouse.clase09_workshop_1.models.Categoria;
import com.coderhouse.clase09_workshop_1.models.Curso;

@SpringBootApplication
public class Clase09Workshop1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Clase09Workshop1Application.class, args);
	}
	@Autowired
	private DaoFactory dao;
	//
	@Override
	public void run(String... arg) throws Exception{
		try {

			Categoria categoria1 = new Categoria("Programacion FrontEnd");
			Categoria categoria2 = new Categoria("Programacion BackEnd");


			Curso curso1 = new Curso("HTML", categoria1);
			Curso curso2 = new Curso("CSS", categoria1);
			Curso curso3 = new Curso("Java", categoria2);

			Alumno alumno1 = new Alumno("Alejando", "Di Stefano", 22555666L, "L22555666");
			Alumno alumno2 = new Alumno("Agustin", "Barraza", 333555666L, "L333555666L");
			Alumno alumno3 = new Alumno("Bruno", "Lezama", 444555666L, "L444555666L");

			dao.createCategoria(categoria1);
			dao.createCategoria(categoria2);

			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);

			dao.createAlumno(curso1);
			dao.createAlumno(curso2);
			dao.createAlumno(curso3);


			System.out.println("Mostrar Lista de Categorias");
			List<Categoria> categorias = dao.getAllCategorias();
			categorias.forEach(categoria -> System.out.println(categoria.toString()));
			System.out.println("-------------------------------------------------");

			System.out.println("Mostrar Lista de Cursos");
			List<Curso> cursos = dao.getAllCurso();
			cursos.forEach(curso -> System.out.println(curso.toString()));
			System.out.println("-------------------------------------------------");

			System.out.println("Mostrar Lista de Alumnos");
			List<Alumno> alumno = dao.getAllAlumnos();
			alumno.forEach(alumnos -> System.out.println(alumno.toString()));
			System.out.println("-------------------------------------------------");


			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno1.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno3.getId());

			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno3.getId());

			dao.inscribirAlumnoEnCurso(curso3.getId(), alumno2.getId());


		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}
}


