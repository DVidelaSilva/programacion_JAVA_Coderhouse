package com.coderhouse.herencia;

public class Perro extends Animal{

    @Override //polimorfismo, soobre escribir un metodo
    public void hacerSonido(){
        System.out.println(getNombre() + " Esta Ladrando!!");
    }

    public void saltar(){
        System.out.println(getNombre() + " Esta Saltando!!");
    }

    
}
