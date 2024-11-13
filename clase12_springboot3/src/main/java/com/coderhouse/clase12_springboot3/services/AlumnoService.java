package com.coderhouse.clase12_springboot3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.clase12_springboot3.dtos.InscripcionDto;
import com.coderhouse.clase12_springboot3.models.Alumno;
import com.coderhouse.clase12_springboot3.models.Curso;
import com.coderhouse.clase12_springboot3.repositories.AlumnoRepository;
import com.coderhouse.clase12_springboot3.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private CursoRepository cursoRepository;



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


    @Transactional
    public Alumno incribirAlumnoACursos(InscripcionDto inscripcionDto) {

        Alumno alumno = alumnoRepository.findById(inscripcionDto.getAlumnoId()).orElseThrow(() -> new IllegalArgumentException("Alumno no encontrado"));

        for (Long cursoId : inscripcionDto.getCursoId()) {
            Curso curso = cursoRepository.findById(cursoId).orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));

            alumno.getCursos().add(curso);
            curso.getAlumnos().add(alumno);
            cursoRepository.save(curso);
        }

        return alumnoRepository.save(alumno);
    }
}
