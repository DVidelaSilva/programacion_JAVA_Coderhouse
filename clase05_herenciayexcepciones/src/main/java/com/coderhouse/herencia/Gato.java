package com.coderhouse.herencia;

public class Gato extends Animal{

    public void hacerSonido(){
        System.out.println(getNombre() + " Esta Mauyando!!");
    }

    public void dormir(){
        System.out.println(getNombre() + " Esta Durmiendo!!");
    }
}
