/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author pc
 */
public class Pocion extends Medicamento {

    public Pocion(String nombre, int cantidadSalud, int tiempo) {
        super(nombre, cantidadSalud, tiempo);
    }

    public Pocion() {
        this("Pocion", 100, 0);
    }

}
