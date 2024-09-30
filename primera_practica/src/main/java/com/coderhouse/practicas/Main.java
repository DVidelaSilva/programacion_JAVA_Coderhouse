package com.coderhouse.practicas;

public class Main {
    public static void main(String[] args) {


        System.out.println("PRIMERA PRACTICA");
        
        //Crear un método main que permita mostrar la parte entera y separado la parte decimal de un tipo de dato float

        // Se declara la variable del tipo float
        float numeroFloat = 8.3f;
        // Se obtiene la parte decimal calculando el modulo del valor
        float parteDecimal = numeroFloat % 1;
        // Se obtiene la parte entera restando al numero total la parte decimal
        float parteEntera = numeroFloat - parteDecimal;

        // resultados
        System.out.println("Del numero float: " + numeroFloat);
        System.out.println("La parte entera es:" + parteEntera);
        System.out.println("La parte decimal es:" + parteDecimal);


    }
}