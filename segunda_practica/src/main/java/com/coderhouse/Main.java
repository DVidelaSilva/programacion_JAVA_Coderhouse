package com.coderhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();
        Persona lista = new Persona();


        persona1.setFirst_name("Diego");
        persona1.setLast_name("Videla");

        persona2.setFirst_name("Nicole");
        persona2.setLast_name("Espinoza");

        persona3.setFirst_name("Arturo");
        persona3.setLast_name("Silva");

        persona4.setFirst_name("Alexandra");
        persona4.setLast_name("Carrillo");

        persona5.setFirst_name("Lucky");
        persona5.setLast_name("Gato");


        String fullNamePorNombrePersona1 = persona1.fullNamePorNombre();
        String fullNamePorNombrePersona2 = persona2.fullNamePorNombre();
        String fullNamePorNombrePersona3 = persona3.fullNamePorNombre();
        String fullNamePorNombrePersona4 = persona4.fullNamePorNombre();
        String fullNamePorNombrePersona5 = persona5.fullNamePorNombre();

        String fullNamePorApellidoPersona1 = persona1.fullNamePorApellido();
        String fullNamePorApellidoPersona2 = persona2.fullNamePorApellido();
        String fullNamePorApellidoPersona3 = persona3.fullNamePorApellido();
        String fullNamePorApellidoPersona4 = persona4.fullNamePorApellido();
        String fullNamePorApellidoPersona5 = persona5.fullNamePorApellido();



        List<String> listadoPersonasPorNombre = new ArrayList<>();

        listadoPersonasPorNombre.add(fullNamePorNombrePersona1);
        listadoPersonasPorNombre.add(fullNamePorNombrePersona2);
        listadoPersonasPorNombre.add(fullNamePorNombrePersona3);
        listadoPersonasPorNombre.add(fullNamePorNombrePersona4);
        listadoPersonasPorNombre.add(fullNamePorNombrePersona5);


        List<String> listadoPersonasPorApellido = new ArrayList<>();

        listadoPersonasPorApellido.add(fullNamePorApellidoPersona1);
        listadoPersonasPorApellido.add(fullNamePorApellidoPersona2);
        listadoPersonasPorApellido.add(fullNamePorApellidoPersona3);
        listadoPersonasPorApellido.add(fullNamePorApellidoPersona4);
        listadoPersonasPorApellido.add(fullNamePorApellidoPersona5);


        
        ArrayList<String> listaPersonasNombres = new ArrayList<>(listadoPersonasPorNombre);
        lista.ordenarPorNombre(listaPersonasNombres);

        ArrayList<String> listaPersonasApellido = new ArrayList<>(listadoPersonasPorApellido);
        lista.ordenarPorApellido(listaPersonasApellido);

        ArrayList<String> listaPersonasApellidoInversa = new ArrayList<>(listadoPersonasPorApellido);
        lista.ordenarPorApellidoInversa(listaPersonasApellidoInversa);
        

        
        
        



    }
}