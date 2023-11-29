package co.com.ps.b5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre="";
        String apellido="guzman";

        int edad = 10;
        if (nombre == null || apellido == null) {
            System.out.println("El nombre esta vacio");
        }

        if(edad==0){

        }


        if (nombre.equals("") && apellido.equals("")) {
            System.out.println("El nombre esta vacio y el apellido estan vacios");
        }else{
            System.out.println("Nombre ingresado correctamente");
        }



        for (int i = 0; i <= 5; i++){

            System.out.println("numero " + i);

        }


    }

}
