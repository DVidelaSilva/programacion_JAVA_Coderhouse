package com.coderhouse.Clase11_springboot2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.Clase11_springboot2.models.Alumno;
import com.coderhouse.Clase11_springboot2.repositories.AlumnoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;



    public List<Alumno> getAllAlumnos() {
        return alumnoRepository.findAll();
    }

    public Alumno findById(Long id) {
        return alumnoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));
    }

    @Transactional
    public Alumno saveAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Transactional //avisa a springboot que si uno de los datos que se ingresa es incorrecto no ejecute el metodo
    public Alumno updateAlumno(Long id, Alumno alumnoDetails) {
        Alumno alumno = alumnoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));

        alumno.setNombre(alumnoDetails.getNombre());
        alumno.setApellido(alumnoDetails.getApellido());

        if(alumnoDetails.getDni() != 0) {
            alumno.setDni(alumnoDetails.getDni());
        }

        if(alumnoDetails.getLegajo() != null && !alumnoDetails.getLegajo().isEmpty()) {
            alumno.setLegajo(alumnoDetails.getLegajo());
        }
        
        return alumnoRepository.save(alumno);
    }


    public void deleteAlumno(Long id) {
        if(!alumnoRepository.existsById(id)){
            throw new IllegalArgumentException("Alumno no encontrado");
        } else {
            alumnoRepository.deleteById(id);
        }
    }
}
