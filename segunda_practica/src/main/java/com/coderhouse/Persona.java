package com.coderhouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persona {

    public String first_name;
    public String last_name;
   //public String[] listdoPersonas;


    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    
    public String fullNamePorNombre(){
        return first_name + " " + last_name;

    }

    public String fullNamePorApellido(){
        return last_name + " " + first_name;

    }

    public void ordenarPorNombre(ArrayList<String> list){
        Collections.sort(list);
        System.out.println("Listado Personas por Nombre: ");
        for (String persona : list) {
            System.out.println("-" + persona);
        }

    }

    public void ordenarPorApellido(ArrayList<String> list){
        Collections.sort(list);
        System.out.println("Listado Personas por Apellido: ");
        for (String persona : list) {
            System.out.println("-" + persona);
        }

    }

    public void ordenarPorApellidoInversa(ArrayList<String> list){
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Listado Personas por Apellido Inversa: ");
        for (String persona : list) {
            System.out.println("-" + persona);
        }

    }


    





    


}
