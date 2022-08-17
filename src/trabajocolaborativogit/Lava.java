/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author Fabricio
 */
public class Lava extends Alimentos {

    public Lava(String nombre, int calorias, int energia, int tiempo) {
        super(nombre, calorias, energia, tiempo);
    }

    public Lava() {
        this("Lava", 100, 60, 0);
    }

}
