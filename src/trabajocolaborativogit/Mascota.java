/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio
 */
public class Mascota {

    private String nombre;
    private int edad;
    private int aburrimiento;
    private int hambre;
    private int energia;
    private int necesidades;
    private boolean morir;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public int getHambre() {
        return hambre;
    }

    public int getEnergia() {
        return energia;
    }

    public int getNecesidades() {
        return necesidades;
    }

    public boolean isMorir() {
        return morir;
    }

    public Mascota(String nombre, int edad, int aburrimiento, int hambre, int energia, int necesidades, boolean morir) {
        this.nombre = nombre;
        this.edad = edad;
        this.aburrimiento = aburrimiento;
        this.hambre = hambre;
        this.energia = energia;
        this.necesidades = necesidades;
        this.morir = morir;
    }

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.aburrimiento = 0;
        this.hambre = 0;
        this.energia = 0;
        this.necesidades = 0;
        this.morir = false;
    }

    public Mascota() {
        this("Default", 0, 0, 0, 0, 0, false);
    }

    public void alimentar(Alimentos alimento) {
        int opciones = 0;

        switch (opciones) {
            case 1:
                Lava lava = new Lava();
                this.hambre = this.hambre + lava.calorias;
            case 2:
                Carne carne = new Carne();
                this.hambre = this.hambre + carne.calorias;
            case 3:
                Huevo huevo = new Huevo();
                this.hambre = this.hambre + huevo.calorias;
            case 4:
                Galleta galleta = new Galleta();
                this.hambre = this.hambre + galleta.calorias;
            case 5:
                Manzana manzana = new Manzana();
                this.hambre = this.hambre + manzana.calorias;
            default:
                JOptionPane.showMessageDialog(null, "Debe elegir una opción válida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
