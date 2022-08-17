/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author pc
 */
public class Pastilla extends Medicamento {

    public Pastilla(String nombre, int cantidadSalud, int tiempo) {
        super(nombre, cantidadSalud, tiempo);
    }

    public Pastilla() {
        this("Pastilla", 20, 0);
    }

}
