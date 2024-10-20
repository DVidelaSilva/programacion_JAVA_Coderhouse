package com.coderhouse.sobrecarga;

public class Impresora {

    public void imprimir(int numero){
        System.out.println("Imprimiendo el numero " + numero);
    }

    public void imprimir(int numeroA, int numeroB){
        System.out.println("Imprimiendo los numero " + numeroA + " y el " + numeroB);
    }

    public void imprimir(String texto) {
        System.out.println("Imprimiendo el texto " + texto);
    }

    public void imprimir(int[] numeros) {
        System.out.println("Imprimiendo el array de " + numeros);

        for (int i : numeros) {
            System.out.println(i + " ");
        }
    }

}
