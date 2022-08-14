/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author pc
 */
public class Inyeccion extends Medicamento {

    public Inyeccion(int cantidadSalud) {
        super(cantidadSalud);
    }
    
    public Inyeccion(){
        this(50);
    }
    
}
