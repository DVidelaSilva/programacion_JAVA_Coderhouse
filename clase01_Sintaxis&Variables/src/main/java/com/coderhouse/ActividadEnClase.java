package com.coderhouse;

public class ActividadEnClase {

    public static void main(String[] args) {
        

        //Prestamo
        //Generar un programa que retorne por consola el monto total que se pagará al banco. 

        double capitalSolicitado;
        double interes;
        double periodo; // el periodo debe ser en meses
        double interesPorPagar;

        //Valores

        capitalSolicitado = 500;
        interes = 3.5;
        periodo = 12;

        interesPorPagar = capitalSolicitado * interes * periodo;

        System.out.println("SIMULADOR DE PRESTAMOS");
        System.out.println("");
        System.out.println("Para un Capital Solicitado de: $" + capitalSolicitado);
        System.out.println("Con un interes actual de: " + interes);
        System.out.println("en un periodo de: " + periodo + " meses");
        System.out.println("");
        System.out.println("El interes a Pagar por el prestamos es de: $" + interesPorPagar);






    }

}
