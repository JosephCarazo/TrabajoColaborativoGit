/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author Fabricio
 */
public class Manzana extends Alimentos {

    public Manzana(String nombre, int calorias, int energia, int tiempo) {
        super(nombre, calorias, energia, tiempo);
    }

    public Manzana() {
        this("Manzana", 5, 1, 0);
    }

}
