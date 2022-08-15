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
        
        
        System.out.println(dragon);
        dragon.alimentar(manzana);
        System.out.println(dragon);
        
        dragon.curar(inyeccion);
        System.out.println(dragon);
        
        dragon.curar(inyeccion);
        System.out.println(dragon);
        
        dragon.realizarActividad(futbol);
        System.out.println(dragon);
        
        dragon.realizarActividad(dormir);
        System.out.println(dragon);
    }
    
}
