package com.coderhouse;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clase03_Arrays {

    public static void main(String[] args){

        //ARRAY
        
        // Declaracion
        //int[] arrayInt;

        //Inicializar

        // opcion1
        int[] arrayInt = new int[6];

        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        arrayInt[3] = 4;
        arrayInt[4] = 5;
        arrayInt[5] = 6;

        //System.out.println("La cantidad de elementos del Array es: " + arrayInt.length);

        //System.out.println(Arrays.toString(arrayInt));


        // opcion2
        String[] palabras = {
            "Hola",
            "Mundo",
            "Coder"
        };

       //System.out.println("La cantidad de elementos del Array es: " + palabras.length);
        //System.out.println(Arrays.toString(palabras));

        //System.out.println("El Elemento del Array con indice 0 es: " + palabras[0]);


        //LISTAS

        List<String> listaDeNombres = new ArrayList<>();

        listaDeNombres.add("Diego");
        listaDeNombres.add("Lucky");
        listaDeNombres.add("Nicole");


        // System.out.println(listaDeNombres);

        List<String> listaDeNombres2 = new ArrayList<>();

        listaDeNombres2.add("ana");
        listaDeNombres2.add("Valentin");
        listaDeNombres2.add("Gabriel");

        // System.out.println(listaDeNombres2);

        // listaDeNombres.addAll((listaDeNombres2));

        // System.out.println("unir ambas listas" + listaDeNombres);

        // System.out.println(listaDeNombres.containsAll(listaDeNombres2));



        //CICLO FOR -> Ciclo por conteo

        List<String> listaDeNombres3 = new ArrayList<>();



        // for (String nombre : listaDeNombres){
        //     System.out.println(nombre);
        // }

        // for (String nombre : listaDeNombres2){
        //     System.out.println(nombre);
        // }

        // if (listaDeNombres.isEmpty()){ // false
        //     System.out.println("El Array lista de nombres, esta vacio?");
        // }
        // if (listaDeNombres2.isEmpty()){ // false
        //     System.out.println("El Array lista de nombres2, esta vacio?");
        // }
        // if (listaDeNombres3.isEmpty()){ //true
        //     System.out.println("El Array lista de nombres3, esta vacio?");
        // }

        // System.out.println(listaDeNombres.isEmpty());
        // System.out.println(listaDeNombres2.isEmpty());
        // System.out.println(listaDeNombres3.isEmpty());


        //metodo acceder a valores mediante posicion (get)

        // System.out.println("El nombre en la posicion " + listaDeNombres.get(1));

        //metodo acceder a valores mediante otra variable (get)

        // int indice = 2;
        
        // System.out.println("El nombre en la posicion " + indice + " es el " + listaDeNombres.get(indice));


        // metodo reemplaza un valor del array (set)

        // int indice = 2;

        // listaDeNombres.set(indice, "Jonathan");

        // System.out.println(listaDeNombres);


        // metodo eliminar (remove & removeAll)

        // int indice = 0;

        // listaDeNombres.remove(indice);  // .removeAll para borrar todos

        // System.out.println(listaDeNombres);

        //metodo para conocer el indice de un elemento

        // String fede = "Lucky";

        // System.out.println(listaDeNombres.indexOf(fede));




    }

}
