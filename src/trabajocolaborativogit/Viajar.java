/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author josep
 */
public class Viajar extends Actividades {

    public Viajar(int cantidadAburrimiento, int cantidadEnergia, int tiempo) {
        super(cantidadAburrimiento, cantidadEnergia, tiempo);
    }
    
    public Viajar(){
        this(50, 20, 0);
    }
}
