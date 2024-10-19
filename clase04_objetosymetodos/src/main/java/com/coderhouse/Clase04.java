package com.coderhouse;

import com.coderhouse.objetos.Perro;

//import com.coderhouse.objetos.Perro;

public class Clase04 {
    public static void main(String[] args) throws Exception {
        
        // Perro primerPerro = new Perro();

        // // primerPerro.nombre = "Firulay";
        // // primerPerro.color = "Marrin";
        // // primerPerro.edad = 3;
        // // primerPerro.raza = "Caniche";
        // // primerPerro.tamanio = "Chico";

        // primerPerro.setNombre("Firulay");
        // primerPerro.setColor("Marron");

        // primerPerro.ladrar();
        // primerPerro.caminar();

        // String[] nombres = new String[]{
        //     "Lorena",
        //     "Alejandro",
        //     "Tristan",
        //     "Luis",
        //     "Valentin",
        //     "Angel"
        // };

        // imprimirListaDeNombres(nombres);

        // sumarNumeros(5, 66);

        // try {

        //     Perro primerPerro = new Perro();
        //     primerPerro.setNombre("Firulay");
        //     primerPerro.setColor("Marron");
        //     primerPerro.setRaza("Caniche");
        //     primerPerro.setTamanio("Chico");
        //     primerPerro.setEdad(10);
    
        //     System.out.println("Perro: " + primerPerro);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


        double radio = 4d;
        System.out.println("El Area del Circulo con radio " + radio + " es igual a: " + calcularAreaDeUnCirculo(radio));
        
        
    }



    // private static void imprimirListaDeNombres(String[] nombresDePersonas) {
    //     for (String nombre : nombresDePersonas ){
    //         System.out.println("Nombre: " + nombre);
    //     }
    // }


    // private static void sumarNumeros(int numeroA, int numeroB) {
    //     System.out.println("La suma entre " + numeroA + " y " + numeroB + " es de: " + (numeroA + numeroB));
    // };



    static final double PI;
    static final double PO;
    static {
        PI = 3.1416592653589793237;
        PO = 4.32;
    }

    private static double calcularAreaDeUnCirculo(double radio) {
        return PI * Math.pow(radio, 2);
    }



    
}
