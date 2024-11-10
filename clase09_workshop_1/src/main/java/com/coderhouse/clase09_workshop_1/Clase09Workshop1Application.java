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

	@Autowired
	private DaoFactory dao;

	public static void main(String[] args) {
		SpringApplication.run(Clase09Workshop1Application.class, args);
	}

	//
	@Override
	public void run(String... arg) throws Exception{
		try {

			Categoria categoria1 = new Categoria("Programacion FrontEnd");
			Categoria categoria2 = new Categoria("Programacion BackEnd");
			Categoria categoria3 = new Categoria("Data Science");

			Curso curso1 = new Curso("HTML", categoria1);
			Curso curso2 = new Curso("CSS", categoria1);
			Curso curso3 = new Curso("Java", categoria2);
			Curso curso4 = new Curso("JavaScript", categoria2);
			Curso curso5 = new Curso("SQL", categoria3);
			Curso curso6 = new Curso("MongoDB", categoria3);
			

			Alumno alumno1 = new Alumno("Alejando", "Di Stefano", 22555666, "L22555666");
			Alumno alumno2 = new Alumno("Agustin", "Barraza", 333555666, "L333555666L");
			Alumno alumno3 = new Alumno("Bruno", "Lezama", 444555666, "L444555666L");

			dao.createCategoria(categoria1);
			dao.createCategoria(categoria2);
			dao.createCategoria(categoria3);

			dao.createAlumno(alumno1);
			dao.createAlumno(alumno2);
			dao.createAlumno(alumno3);

			dao.createCurso(curso1);
			dao.createCurso(curso2);
			dao.createCurso(curso3);
			dao.createCurso(curso4);
			dao.createCurso(curso5);
			dao.createCurso(curso6);

			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno1.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno3.getId());

			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno2.getId());
			dao.inscribirAlumnoEnCurso(curso2.getId(), alumno3.getId());

			dao.inscribirAlumnoEnCurso(curso3.getId(), alumno2.getId());

			dao.inscribirAlumnoEnCurso(curso4.getId(), alumno1.getId());
			dao.inscribirAlumnoEnCurso(curso5.getId(), alumno3.getId());
			dao.inscribirAlumnoEnCurso(curso6.getId(), alumno1.getId());
			dao.inscribirAlumnoEnCurso(curso1.getId(), alumno3.getId());
			dao.inscribirAlumnoEnCurso(curso6.getId(), alumno1.getId());

			System.out.println("Mostrar lista de Categorias");
			List<Categoria> categorias = dao.getAllCategorias();
			categorias.forEach(categoria -> System.out.println(categoria.toString()));
			System.out.println("-----------------------------");

			System.out.println("Mostrar lista de Cursos");
			List<Curso> cursos = dao.getAllCursos();
			cursos.forEach(curso -> System.out.println(curso.toString()));
			System.out.println("-----------------------------");

			System.out.println("Mostrar lista de los Alumnos");
			List<Alumno> alumnos = dao.getAllAlumnos();
			alumnos.forEach(alumno -> System.out.println(alumno.toString()));
			System.out.println("-----------------------------");

			System.out.println("Lista de Cursos con alumnos inscritos:");
			cursos = dao.getAllCursos();
			cursos.forEach(curso -> {
				System.out.println("Curso: " + curso.getNombre());
				curso.getAlumnos().forEach(alumno -> System.out
						.println("  Alumno inscrito: " + alumno.getNombre() + " " + alumno.getApellido()));
			});
			System.out.println("---------------");

			System.out.println("Lista de Alumnos con sus cursos:");
			alumnos.forEach(alumno -> {
				System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " está inscrito en los cursos:");
				for (Curso curso : alumno.getCursos()) {
					System.out.println("  - " + curso.getNombre());
				}
			});
			System.out.println("---------------");


		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}
}


