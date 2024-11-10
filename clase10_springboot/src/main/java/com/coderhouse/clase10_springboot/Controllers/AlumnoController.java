package com.coderhouse.clase10_springboot.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.clase10_springboot.models.Alumno;
import com.coderhouse.clase10_springboot.repositories.AlumnoRepository;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;  // Inyeccion de la dependencia alumnoRepository

    @GetMapping
    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id){
        if(alumnoRepository.existsById(id)){ // pregunta al repositorio si existe o no el alumno
            Alumno alumno = alumnoRepository.findById(id).get(); // busca mediante el repositorio al alumno y crea el alumno que encuentra en DB y lo asigna a la variable aumno
            return ResponseEntity.ok(alumno); // si el servidor me respondio un OK a la solicitud le envio el alumno
        } else {
            return ResponseEntity.notFound().build(); // si el servidor me responde un notFound que utiliza el metodo build
        }
    }

    @PostMapping
    public Alumno createAlumno(@RequestBody Alumno alumno) {  // va a recibir un Alumno y crear un alumno, lo recibe en el body y lo llamo alumno
        return alumnoRepository.save(alumno);
    }

}
