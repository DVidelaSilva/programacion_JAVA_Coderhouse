package com.coderhouse.clase12_springboot3.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.clase12_springboot3.dtos.InscripcionDto;
import com.coderhouse.clase12_springboot3.models.Alumno;
import com.coderhouse.clase12_springboot3.services.AlumnoService;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;  // Inyeccion de la dependencia alumnoRepository

    @GetMapping
    public ResponseEntity<List<Alumno>> getAllAlumnos(){
        try{
            List<Alumno> alumnos = alumnoService.getAllAlumnos();
            return ResponseEntity.ok(alumnos); 
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id){
        try {
            Alumno alumno = alumnoService.findById(id);

            return ResponseEntity.ok(alumno);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }


    @PostMapping
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno){
        try {

            Alumno createdAlumno = alumnoService.saveAlumno(alumno);
            return ResponseEntity.ok(createdAlumno);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<Alumno> updateAlumno(@PathVariable Long id, @RequestBody Alumno alumnoDetails){
        try {

            Alumno updateAlumno =  alumnoService.updateAlumno(id, alumnoDetails);
            return ResponseEntity.ok(updateAlumno);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();    
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlumno(@PathVariable Long id){
        try {
            
            alumnoService.deleteAlumno(id);
            return ResponseEntity.noContent().build();

        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();    
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @PostMapping("/inscribir")
    public ResponseEntity<Alumno> incribirAlumnoACursos(@RequestBody InscripcionDto inscripcionDto) {

        try {
            
            Alumno alumno = alumnoService.incribirAlumnoACursos(inscripcionDto);
            return ResponseEntity.ok(alumno);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();    
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}