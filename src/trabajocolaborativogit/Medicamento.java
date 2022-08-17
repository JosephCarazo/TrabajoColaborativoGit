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
    protected int bajarAburrimiento;
    protected int bajarHambre;
    protected int subirEnergia;
    protected int bajarNecesidades;
    protected int tiempo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBajarAburrimiento() {
        return bajarAburrimiento;
    }

    public void setBajarAburrimiento(int bajarAburrimiento) {
        this.bajarAburrimiento = bajarAburrimiento;
    }

    public int getBajarHambre() {
        return bajarHambre;
    }

    public void setBajarHambre(int bajarHambre) {
        this.bajarHambre = bajarHambre;
    }

    public int getSubirEnergia() {
        return subirEnergia;
    }

    public void setSubirEnergia(int subirEnergia) {
        this.subirEnergia = subirEnergia;
    }

    public int getBajarNecesidades() {
        return bajarNecesidades;
    }

    public void setBajarNecesidades(int bajarNecesidades) {
        this.bajarNecesidades = bajarNecesidades;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Medicamento(String nombre, int bajarAburrimiento, int bajarHambre, int subirEnergia, int bajarNecesidades, int tiempo) {
        this.nombre = nombre;
        this.bajarAburrimiento = bajarAburrimiento;
        this.bajarHambre = bajarHambre;
        this.subirEnergia = subirEnergia;
        this.bajarNecesidades = bajarNecesidades;
        this.tiempo = tiempo;
    }

    
}
