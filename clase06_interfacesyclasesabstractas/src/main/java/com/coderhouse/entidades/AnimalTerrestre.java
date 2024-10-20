package com.coderhouse.entidades;

import com.coderhouse.interfaces.AccionesInterfaces;
import com.coderhouse.interfaces.SerVivoInterface;

public class AnimalTerrestre implements SerVivoInterface, AccionesInterfaces {

    private boolean vivo;
    private String nombre;
    private String raza;
    private int edad;
    
    public void emitirSonido() {
        System.out.println("Emitio sonido");
    }

    public void moverse() {
        System.out.println("El animal camino");
    }

    public void comer() {
        System.out.println("El animal comio");
    }




    public boolean isVivo() {
        return this.vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal [vivo=" + vivo + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
    }

    @Override
    public void dormir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dormir'");
    }

    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'respirar'");
    }

    @Override
    public void jugar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jugar'");
    }


    



}
