package com.coderhouse.clase12_springboot3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.clase12_springboot3.models.Categoria;
import com.coderhouse.clase12_springboot3.repositories.CategoriaRepository;


import jakarta.transaction.Transactional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;



    public List<Categoria> getAllCategoria() {
        return categoriaRepository.findAll();
    }

    public Categoria findById(Long id) {
        return categoriaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Categoria no encontrado"));
    }

    @Transactional
    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Transactional //avisa a springboot que si uno de los datos que se ingresa es incorrecto no ejecute el metodo
    public Categoria updateCategoria(Long id, Categoria categoriaDetails) {
        Categoria categoria = categoriaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Categoria no encontrado"));

        categoria.setNombre(categoriaDetails.getNombre());
        return categoriaRepository.save(categoria);
    }


    public void deleteCategoria(Long id) {
        if(!categoriaRepository.existsById(id)){
            throw new IllegalArgumentException("Categoria no encontrado");
        } else {
            categoriaRepository.deleteById(id);
        }
    }
}