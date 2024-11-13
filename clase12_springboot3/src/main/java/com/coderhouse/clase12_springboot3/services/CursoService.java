package com.coderhouse.clase12_springboot3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.clase12_springboot3.models.Categoria;
import com.coderhouse.clase12_springboot3.models.Curso;
import com.coderhouse.clase12_springboot3.repositories.CategoriaRepository;
import com.coderhouse.clase12_springboot3.repositories.CursoRepository;

import jakarta.transaction.Transactional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;


    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso findById(Long id) {
        return cursoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));
    }

    @Transactional
    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Transactional //avisa a springboot que si uno de los datos que se ingresa es incorrecto no ejecute el metodo
    public Curso updateCurso(Long id, Curso cursoDetails) {
        Curso curso = cursoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));

        curso.setNombre(cursoDetails.getNombre());
        return cursoRepository.save(curso);
    }


    public void deleteCurso(Long id) {
        if(!cursoRepository.existsById(id)){
            throw new IllegalArgumentException("Curso no encontrado");
        } else {
            cursoRepository.deleteById(id);
        }
    }

    @Transactional
    public Curso asignarCategoriaACurso(Long cursoId, Long categoriaId) {

        Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(() -> new IllegalArgumentException("Categoria no encontrado"));

        Curso curso = cursoRepository.findById(cursoId).orElseThrow(() -> new IllegalArgumentException("Curso no encontrado"));

        curso.setCategoria(categoria);
        return cursoRepository.save(curso);

    }

    
}