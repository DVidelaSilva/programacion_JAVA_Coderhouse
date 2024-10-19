package com.coderhouse;

public class Clase02 {

    public static void main(String[] args) {

        // int numeroA = 1;
        // int numeroB = 2;

        // System.out.println(numeroA);
        // System.out.println(numeroB);
        // String operacion = "+";
        // float resultado = numeroA + numeroB;

        // if(numeroA > numeroB){
        //     System.out.println("El numeroA es mayor que el numeroB");
        // } else {
        //     System.out.println("El numeroB es mayor que el numeroA");
        // }


        // float numeroA = 1f;
        // float numeroB = 0f;

        // float resultado = numeroA / numeroB;

        // if(numeroB != 0 ){
        //     System.out.println("El resultado es: " + resultado);
        // } else {
        //     System.out.println("No se puede dividor por cero");
        // }


        // int ingreseSuNumero = 2;

        // if(ingreseSuNumero > 0) {
        //     System.out.println("El numero ingresado es positivo");
        // } else if (ingreseSuNumero < 0) {
        //     System.out.println("El numero ingresado es Negativo");
        // } else if ( ingreseSuNumero == 0) {
        //     System.out.println("El numero ingresado en cero");
        // } else {
        //     System.out.println("El dato ingresado no es un numero");
        // }

        //Validar dia de la semana usando if / else

        // int numeroDia = 5;

        // if(numeroDia == 1){
        //     System.out.println("El dia es LUNES");
        // } else if (numeroDia == 2) {
        //     System.out.println("El dia es MARTES");
        // } else if (numeroDia == 3) {
        //     System.out.println("El dia es MIERCOLES");
        // }else if (numeroDia == 4) {
        //     System.out.println("El dia es JUEVES");
        // } else if (numeroDia == 5) {
        //     System.out.println("El dia es VIERNES");
        // } else if (numeroDia == 6) {
        //     System.out.println("El dia es SABADO");
        // } else if (numeroDia == 7) {
        //     System.out.println("El dia es DOMINGO");
        // }  else {
        //     System.out.println("El dia ingresado no es valido");
        // }


 
       //Switch

        // int numeroDeDia = 15;
        // String nombreDelDia;

        // switch (numeroDeDia) {
        //     case 1:
        //         nombreDelDia = "Lunes";
        //         break;
        //     case 2:
        //         nombreDelDia = "Martes";
        //         break;
        //     case 3:
        //         nombreDelDia = "Miercoles";
        //         break;
        //     case 4:
        //         nombreDelDia = "Jueves";
        //         break;
        //     case 5:
        //         nombreDelDia = "Viernes";
        //         break;
        //     case 6:
        //         nombreDelDia = "Sabado";
        //         break;
        //     case 7:
        //         nombreDelDia = "Domingo";
        //         break;
        //     default:
        //         nombreDelDia = "Dia Invalido";
        //         break;
        // }

        // System.out.println("El dia de la semana correspondiente al numero " + numeroDeDia + " es el " + nombreDelDia);


        // Operador Ternario

        // int numeroA = 1;
        // int numeroB = 2;

        // boolean condicion = numeroA < numeroB;
        // Strz resultado;

        // System.out.println(condicion);

        // resultado = condicion ? System.out.println("El numeroA es Menor al numeroB") : System.out.println("El numeroA es mayor al numeroB");


        //numeros Aleatorios

        // double random = 0.0d;
        // random = Math.random();
        // System.out.println("El numero generado es: " + random);



        int minimo = 1;
        int maximo = 100;

        int rango = maximo - minimo + 1;

        int random = 0;

        random = (int) (Math.random() * rango) + minimo;
        System.out.println("El numero generado es: " + random);




    }
}
