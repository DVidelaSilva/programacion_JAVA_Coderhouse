package com.coderhouse.abstractas;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected String color;
    protected int ruedas;


    protected abstract void enciender();
    protected abstract void apagar();
    protected abstract void mover();

    public void mostrarCantidadDeRuedas(){
        System.out.println("Mi auto tiene " + getRuedas() + " Ruedas");

    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    
}
