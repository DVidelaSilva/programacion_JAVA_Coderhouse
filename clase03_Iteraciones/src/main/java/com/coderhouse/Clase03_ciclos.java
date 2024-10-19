package main.java.com.coderhouse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clase03_ciclos {

    public static void main(String[] args){

                List<String> listaDeNombres = new ArrayList<>();

        listaDeNombres.add("Diego");
        listaDeNombres.add("Lucky");
        listaDeNombres.add("Nicole");
        listaDeNombres.add("Jazmin");

        //System.out.println("La cantidad de elemntos de listaDeNombres es: " + listaDeNombres.size());


        // Ciclo por condicion

        // ITERATOR



        // System.out.println("La cantidad de elementos de listaDeNombres antes de iterar es: " + listaDeNombres.size());

        // Iterator<String> iterator = listaDeNombres.iterator();

        // while (iterator.hasNext()) {
        //     String nombre = iterator.next(); //Arranca de cero
        //     System.out.println("nombre : " + nombre);
        //     iterator.remove();
        // }

        // System.out.println("La cantidad de elementos de listaDeNombres luego de iterar es: " + listaDeNombres.size());

        
        // ITERABLE

        // for (String nombre: listaDeNombres){
        //     System.out.println("Nombre: " + nombre);
        // }

        // CICLOS

        int contador = 1;
        
        // while (contador < 5) {
        //     System.out.println("El contador actual vale: " + contador);
        //     contador++;
        // }


        // do{

        //    System.out.println("El contador actual vale: " + contador);
        //     contador++;
            
        // } while(contador < 5);


        listaDeNombres.forEach(nombre -> {
            System.out.println("nombre: " + nombre);
        });




    }
}
