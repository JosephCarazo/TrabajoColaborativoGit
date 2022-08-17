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

    public Pocion(String nombre, int bajarAburrimiento, int bajarHambre, int subirEnergia, int bajarNecesidades, int tiempo) {
        super(nombre, bajarAburrimiento, bajarHambre, subirEnergia, bajarNecesidades, tiempo);
    }

    public Pocion(){
        this("Pocion", 20, 20, 20, 20, 0);
    }
    

}
