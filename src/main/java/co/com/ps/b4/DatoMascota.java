package co.com.ps.b4;

public class DatoMascota {
    String especie;
    String nombre;
    String raza;
    String tamano;
    boolean vacuna;
    int edad;


    public DatoMascota(String especie, String nombre, int edad, String raza, String tamano, boolean vacuna) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tamano = tamano;
        this.vacuna = vacuna;

    }
    public void Info() {
        System.out.println("que tipo de especie es la mascota: " + especie);
        System.out.println("nombre de la mascota: " + nombre);
        System.out.println("edad de la mascota: " + edad);
        System.out.println("raza de la mascota: " + raza);
        System.out.println("que tamaño tiene la mascota: " + tamano);
        if (vacuna == true){
            System.out.println("la mascota esta vacunada");
        }else{
            System.out.println("la mascota no esta vacunada");
        }

        System.out.println(" ");

    }

}
