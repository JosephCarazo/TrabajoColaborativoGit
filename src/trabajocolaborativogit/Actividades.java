/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author josep
 */
public class Actividades {

    protected int cantidadAburrimiento;
    protected int cantidadEnergia;

    public int getCantidadAburrimiento() {
        return cantidadAburrimiento;
    }

    public void setCantidadAburrimiento(int cantidadAburrimiento) {
        this.cantidadAburrimiento = cantidadAburrimiento;
    }

    public int getCantidadEnergia() {
        return cantidadEnergia;
    }

    public void setCantidadEnergia(int cantidadEnergia) {
        this.cantidadEnergia = cantidadEnergia;
    }

    public Actividades(int cantidadAburrimiento, int cantidadEnergia) {
        this.cantidadAburrimiento = cantidadAburrimiento;
        this.cantidadEnergia = cantidadEnergia;

    }

}
