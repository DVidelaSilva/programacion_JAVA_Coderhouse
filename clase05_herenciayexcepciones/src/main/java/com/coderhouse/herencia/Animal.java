package com.coderhouse.herencia;

public class Animal {

    private String nombre;
    private String raza;
    private int edad;
    private boolean mamifero;
    private String alimentacion;


    public void caminar() {
        System.out.println(getNombre() + " esta caminando!");
    }

    public void comer() {
        System.out.println(getNombre() + " esta comiendo!");
    }

    public void hacerSonido() {
        System.out.println(getNombre() + " esta haciendo un Sonido!");
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

    public boolean isMamifero() {
        return this.mamifero;
    }

    public void setMamifero(boolean mamifero) {
        this.mamifero = mamifero;
    }

    public String getAlimentacion() {
        return this.alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", mamifero=" + mamifero
                + ", alimentacion=" + alimentacion + "]";
    }




    


    

    

}
