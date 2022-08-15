/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajocolaborativogit;

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
    private int salud;
    private boolean morir;
    private boolean cansado;
    private boolean enfermo;

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

    public int getSalud() {
        return salud;

    }

    public void setSalud(int salud) {
        this.salud = salud;
        if (this.salud > 100) {
            this.salud = 100;
        }
        if (this.salud < 20) {
            this.enfermo = true;
        }
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = aburrimiento;
        if (this.aburrimiento < 0) {
            this.aburrimiento = 0;
        }
    }

    public int getHambre() {
        return hambre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
        if (this.energia > 100) {
            this.energia = 100;
        }
        if (this.energia < 20) {
            this.cansado = true;
        }
    }

    public int getNecesidades() {
        return necesidades;
    }

    public boolean isMorir() {
        return morir;
    }

    public boolean isCansado() {
        return cansado;
    }

    public Mascota(String nombre, int edad, int aburrimiento, int hambre, int energia, int necesidades, int salud, boolean morir, boolean cansado, boolean enfermo) {
        this.nombre = nombre;
        this.edad = edad;
        this.aburrimiento = aburrimiento;
        this.hambre = hambre;
        this.energia = energia;
        this.necesidades = necesidades;
        this.salud = salud;
        this.morir = morir;
        this.cansado = cansado;
        this.enfermo = enfermo;
    }

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.aburrimiento = 0;
        this.hambre = 0;
        this.energia = 100;
        this.necesidades = 0;
        this.salud = 100;
        this.morir = false;
        this.cansado = false;
        this.enfermo = false;
    }

    public Mascota() {
        this("Default", 0, 100, 100, 100, 0, 100, false, false, false);
    }

    public void alimentar(Alimentos alimento) {
        this.hambre -= alimento.calorias;
        this.energia += alimento.energia;
    }

    public void curar(Medicamento medicamento) {
        this.salud = this.salud + medicamento.cantidadSalud;
    }

    public void realizarActividad(Actividades actividad) {
        this.aburrimiento -= actividad.cantidadAburrimiento;
        this.energia -= actividad.cantidadEnergia;
    }

    @Override
    public String toString() {
        return "\n***********" + "\nNombre: " + nombre + "\nEdad: " + edad + "\nAburrimiento: " + aburrimiento + '%' + "\nHambre: " + hambre + '%' + "\nEnergia: " + energia + '%' + "\nNecesidades: " + necesidades + '%' + "\nSalud: " + salud + '%' + "\nMorir: " + morir + "\nCansado: " + cansado;
    }

}
