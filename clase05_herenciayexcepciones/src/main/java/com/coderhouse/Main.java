package com.coderhouse;


// import com.coderhouse.herencia.Gato;
// import com.coderhouse.herencia.Perro;

// import com.coderhouse.banco.Persona;
// import com.coderhouse.banco.Cuenta;
// import com.coderhouse.banco.CuentaCorriente;
// import com.coderhouse.banco.CajaDeAhorro;

public class Main {
    public static void main(String[] args) {
        
        // Perro unPerro = new Perro();
        // Gato unGato = new Gato();

        // Perro otroPerro = new Perro();

        // unPerro.setNombre("Firulay");
        // unPerro.setEdad(4);
        // unPerro.setMamifero(true);
        // unPerro.setRaza("Caniche");
        // unPerro.setAlimentacion("Alimento balanceado");

        // otroPerro.setNombre("Pluto");
        // otroPerro.setMamifero(true);
        // otroPerro.setEdad(6);
        // otroPerro.setRaza("Yorky");
        // otroPerro.setAlimentacion("Alimento balanceado para perro");

        // System.out.println(otroPerro);
        // otroPerro.caminar();
        // otroPerro.comer();
        // otroPerro.hacerSonido();
        // otroPerro.saltar();




        // System.out.println(unPerro);

        // unPerro.comer();
        // unPerro.caminar();
        // unPerro.hacerSonido();
        // unPerro.saltar();

        // unGato.setNombre("Michi");
        // unGato.setEdad(4);
        // unGato.setMamifero(true);
        // unGato.setRaza("Naranja");
        // unGato.setAlimentacion("Alimento balanceado para Gatos");

        // System.out.println(unGato);

        // unGato.comer();
        // unGato.caminar();
        // unGato.hacerSonido();
        // unGato.dormir();


        // Persona unaPersona = new Persona();
        // unaPersona.setTitular("Diego");
        // unaPersona.setDni(123456789);

        // System.out.println(unaPersona);

        // Cuenta cuentaCorriente = new CuentaCorriente();
        // cuentaCorriente.setTitular(unaPersona);
        // cuentaCorriente.setNumero(123456);
        // cuentaCorriente.setSaldo(1200.50d);
        // cuentaCorriente.abrirCuenta();

        // System.out.println(cuentaCorriente);

        // Cuenta cajaDeAhorros = new CajaDeAhorro();
        // cajaDeAhorros.setTitular(unaPersona);
        // cajaDeAhorros.setNumero(321654);
        // cajaDeAhorros.setSaldo(563.45d);
        // cajaDeAhorros.abrirCuenta();

        // System.out.println(cajaDeAhorros);



        /// EXCEPCIONES

        // try {
        //     int numeroA = 10;
        //     int numeroB = 0;
        //     int resultado = numeroA / numeroB;
        //     System.out.println("El resultado es: " + resultado);
            
        // } catch (ArithmeticException e) {
        //     System.err.println("Error, no se puede dividir por Cero");
        // }


        try {
            Class.forName("com.coderhouse.ClaseInexistente");
        } catch (ClassNotFoundException e) {
            System.err.println("La clase inexistente no existe");
        }



        


        
    }
}