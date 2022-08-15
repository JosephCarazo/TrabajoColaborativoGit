/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author josep
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alimentos manzana = new Manzana();

        Medicamento inyeccion = new Inyeccion();

        Mascota dragon = new Mascota();

        Actividades futbol = new Futbol();
        Actividades dormir = new Dormir();

        System.out.println("1 "+ dragon);//1
        dragon.alimentar(manzana);
        System.out.println("2 "+ dragon);//1

        dragon.curar(inyeccion);
        System.out.println("3 "+ dragon);//3

        dragon.curar(inyeccion);
        System.out.println("4 "+ dragon);//4

        dragon.realizarActividad(futbol);
        System.out.println("5 "+ dragon);//5

        dragon.realizarActividad(dormir);
        System.out.println("6 "+ dragon);//6
    }

}
