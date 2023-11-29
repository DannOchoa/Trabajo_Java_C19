package co.com.ps.b5;

import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {
        //detectar si el numero es positivo, negativo o cero
        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor ingresar un numero");
        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("el numero es negativo");

        }else if(numero == 0){
            System.out.println("el numero es cero");
        } else if (numero > 0) {
            System.out.println("el numero es positivo");
        }

        //pares del 1 al 10
        for (int a = 1; a <= 10; a++){
            if (a % 2 == 0){
                System.out.println(a);
            }

        }

        //hallar numeros primos dentro de un rango de numeros
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ingresar el primer rango de numeros para encontrar numeros primos");
        int num1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("ingresar el segundo rango de numeros para encontrar numeros primos");
        int num2 = scanner2.nextInt();

        for (int e = num1; e <= num2; e++ ){
            if (e == 1){
                System.out.println(e + " es un numero indeterminado");
            }else {
                if (e == 2 || e == 3 || e == 5 || e == 7){
                    System.out.println(e + " es un numero primo");

                }else if (e % 2 == 0 || e % 3 == 0 || e % 5 == 0 || e % 7 == 0){
                    System.out.println(e + " es un numero compuesto");
                }else {
                    System.out.println(e + " es un numero primo");
                }

            }


        }
    }


}
