/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author Fabricio
 */
public class Galleta extends Alimentos {

    public Galleta(String nombre, int calorias, int energia, int tiempo) {
        super(nombre, calorias, energia, tiempo);
    }

    public Galleta() {
        this("Galleta", 10, 3, 0);
    }

}
