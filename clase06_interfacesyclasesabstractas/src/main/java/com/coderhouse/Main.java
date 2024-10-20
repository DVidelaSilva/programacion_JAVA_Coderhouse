package com.coderhouse;

import com.coderhouse.entidades.Auto;
import com.coderhouse.sobrecarga.Impresora;

// import com.coderhouse.entidades.Perro;
// import com.coderhouse.interfaces.SerVivoInterface;

public class Main {
    public static void main(String[] args) {
        
        // Perro miPerro = new Perro();

        // miPerro.setNombre("Firulay");
        // miPerro.setEdad(5);

        // miPerro.emitirSonido();
        // miPerro.comer();
        // miPerro.amigable();
        // miPerro.moverse();

        // System.out.println("La ubicacion de " + miPerro.getNombre() + " esta en el " + SerVivoInterface.UBICACION);

        // Auto miAuto = new Auto();

        // miAuto.apagar();
        // miAuto.enciender();
        // miAuto.mover();


        // miAuto.setRuedas(4);
        // miAuto.mostrarCantidadDeRuedas();

        Impresora miImpresora = new Impresora();

        miImpresora.imprimir(10);
        miImpresora.imprimir(10, 20);
        miImpresora.imprimir("Hola");

        int[] enteros = {1, 2, 3, 4};

        miImpresora.imprimir(enteros);
    }
}