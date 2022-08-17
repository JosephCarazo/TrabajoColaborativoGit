/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author pc
 */
public class Jarabe extends Medicamento {

    public Jarabe(String nombre, int cantidadSalud, int tiempo) {
        super(nombre, cantidadSalud, tiempo);
    }

    public Jarabe() {
        this("Jarabe", 30, 0);
    }
}
