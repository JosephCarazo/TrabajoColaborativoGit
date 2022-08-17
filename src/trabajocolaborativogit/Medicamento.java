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
    protected int tiempo;

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

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Medicamento(String nombre, int cantidadSalud, int tiempo) {
        this.nombre = nombre;
        this.cantidadSalud = cantidadSalud;
        this.tiempo = tiempo;
    }

}
