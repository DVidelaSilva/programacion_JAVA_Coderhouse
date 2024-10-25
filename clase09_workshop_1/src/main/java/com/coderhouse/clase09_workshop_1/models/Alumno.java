package com.coderhouse.clase09_workshop_1.models;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    private String apellido;

    @Column(unique = true, nullable = false)
    private Long dni;

    @Column(unique = true, nullable = false)
    private String legajo;

    @ManyToMany(mappedBy = "alumnos", fetch = FetchType.EAGER)
    private List<Curso> cursos = new ArrayList<>();

    private LocalDateTime createdAt = LocalDateTime.now();



    public Alumno() {
        super();
    }


    public Alumno(String nombre, String apellido, Long dni, String legajo) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public Long getDni() {
        return dni;
    }


    public void setDni(Long dni) {
        this.dni = dni;
    }


    public String getLegajo() {
        return legajo;
    }


    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }


    public List<Curso> getCursos() {
        return cursos;
    }


    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", legajo="
                + legajo + ", cursos=" + cursos + ", createdAt=" + createdAt + "]";
    }

    
    




}