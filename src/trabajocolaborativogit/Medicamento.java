/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author josep
 */
public class Medicamento {
    private String nombre;
    protected int cantidadSalud;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadSalud() {
        return cantidadSalud;
    }

    public void setCantidadSalud(int cantidadSalud) {
        this.cantidadSalud = cantidadSalud;
    }

    public Medicamento(String nombre, int cantidadSalud) {
        this.nombre = nombre;
        this.cantidadSalud = cantidadSalud;
    }

   
    
}
