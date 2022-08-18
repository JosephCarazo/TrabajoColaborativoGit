/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author josep
 */
public class Bannio extends Actividades {
    protected int bajarNecesidades;

    public Bannio(int bajarNecesidades, int cantidadAburrimiento, int cantidadEnergia, int tiempo) {
        super(cantidadAburrimiento, cantidadEnergia, tiempo);
        this.bajarNecesidades = bajarNecesidades;
    }
    
    public Bannio(){
        this(100, 0, 0, 0);
    }
}
