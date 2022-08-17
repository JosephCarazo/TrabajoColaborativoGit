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
        if (salud > 100) {
            this.salud = 100;
        } else if (salud < 0) {
            this.salud = 0;
        }else if (this.salud <= 20) {
            this.setEnfermo(true);
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

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
        if (energia > 100) {
            this.energia = 100;
        } else if (energia < 0) {
            this.energia = 0;
        }
        if (this.getEnergia() <= 20) {
            this.setCansado(true);
        } else {
            this.setCansado(false);
        }

    }

    public int getNecesidades() {
        return necesidades;
    }

    public boolean isMorir() {
        return morir;
    }

    public void setMorir(boolean morir) {
        this.morir = morir;
    }

    public boolean isCansado() {
        return cansado;
    }

    public void setCansado(boolean cansado) {
        this.cansado = cansado;
    }

    public boolean isEnfermo() {
        return enfermo;
    }

    public void setEnfermo(boolean enfermo) {
        this.enfermo = enfermo;
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
        this("Default", 0, 100, 100, 15, 0, 0, false, false, false);
    }

    public void alimentar(Alimentos alimento) {
        this.setHambre(this.getHambre() - alimento.calorias);
        this.setEnergia(this.getEnergia() + alimento.energia);
    }

    public void curar(Medicamento medicamento) {
        if (this.getSalud() == 100) {
            this.setSalud(this.getSalud() - medicamento.cantidadSalud);
        }
        this.setSalud(this.getSalud() + medicamento.cantidadSalud);
    }

    public void realizarActividad(Actividades actividad) {
        this.setAburrimiento(this.getAburrimiento() - actividad.cantidadAburrimiento);
        this.setEnergia(this.getEnergia() - actividad.cantidadEnergia);
    }

    @Override
    public String toString() {
        return "\n*************" + "\nNombre: " + nombre + "||Edad: " + edad + "||Aburrimiento: " + aburrimiento + "||Hambre: " + hambre + "||Energia: " + energia + "||Necesidades: " + necesidades + "||Salud: " + salud + "||Morir: " + morir + "||Cansado: " + cansado + "||Enfermo: " + enfermo;
    }

}
