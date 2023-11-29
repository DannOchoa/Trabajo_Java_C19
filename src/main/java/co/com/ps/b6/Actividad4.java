package co.com.ps.b6;


//adivina el numero

import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {

        int numeroAleatorio = (int) (Math.random()*100)+1;
        int numerosIntentos = 10;
        int numeroSolicitado = 2;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero: ");

        do {
            numeroSolicitado = scanner.nextInt();
            contador++;
            int intentos = numerosIntentos - contador;
            if (numeroAleatorio < numeroSolicitado){
                System.out.println("estas por encima");
                System.out.println("tienes " + intentos + " intentos");
                System.out.println("Adivina el numero otra vez: ");
            } else if (numeroAleatorio > numeroSolicitado) {
                System.out.println("estas por debajo");
                System.out.println("tienes " + intentos + " intentos");
                System.out.println("Adivina el numero otra vez: ");
            } else if (numeroAleatorio == numeroSolicitado) {

                System.out.println("has dado con el numero otra vez: ");
                contador = 11;
            }


        }while (contador <= numerosIntentos);


    }
}
