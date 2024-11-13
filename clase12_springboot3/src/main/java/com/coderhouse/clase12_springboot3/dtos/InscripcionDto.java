package com.coderhouse.clase12_springboot3.dtos;

import java.util.List;

public class InscripcionDto {

    private Long alumnoId;
    private List<Long> cursoId;
    public Long getAlumnoId() {
        return alumnoId;
    }
    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }
    public List<Long> getCursoId() {
        return cursoId;
    }
    public void setCursoId(List<Long> cursoId) {
        this.cursoId = cursoId;
    }

    

}
