/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author Fabricio
 */
public class Carne extends Alimentos {

    public Carne(String nombre, int calorias, int energia, int tiempo) {
        super(nombre, calorias, energia, tiempo);
    }

    public Carne() {
        this("Carne", 50, 15, 0);
    }

}
