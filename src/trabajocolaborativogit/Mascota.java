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
    private boolean morir;
    private boolean salud;//False = Saludable

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

    public boolean isSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = aburrimiento;
        if (this.getAburrimiento() > 100) {
            this.setAburrimiento(100);
        }
        if (this.getAburrimiento() < 0) {
            this.setAburrimiento(0);
        }
        if (this.getAburrimiento() >= 90) {
            this.setSalud(true);
        }
        if (this.getAburrimiento() == 100) {
            this.setMorir(true);
        }
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
        if (this.getHambre() > 100) {
            this.setHambre(100);
        } else if (this.getHambre() < 0) {
            this.setHambre(0);
        }
        if (this.getHambre() >= 90) {
            this.setSalud(true);
        }
        if (this.getHambre() == 100) {
            this.setMorir(true);
        }
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
        if (this.getEnergia() > 100) {
            this.setEnergia(100);
        } else if (this.getEnergia() < 0) {
            this.setEnergia(0);
        }
        if (this.getEnergia() <= 10) {
            this.setSalud(true);
        }
        if (this.getEnergia() == 0) {
            this.setMorir(true);
        }
    }

    public int getNecesidades() {
        return necesidades;
    }

    public void setNecesidades(int necesidades) {
        this.necesidades = necesidades;
        if (this.getNecesidades() > 100) {
            this.setNecesidades(100);
        }
        if (this.getNecesidades() < 0) {
            this.setNecesidades(0);
        }
        if (this.getNecesidades() >= 90) {
            this.setSalud(true);
        }
        if (this.getNecesidades() == 100) {
            this.setMorir(true);
        }
    }

    public boolean isMorir() {
        return morir;
    }

    public void setMorir(boolean morir) {
        this.morir = morir;
    }

    public Mascota(String nombre, int edad, int aburrimiento, int hambre, int energia, int necesidades, boolean morir, boolean salud) {
        this.nombre = nombre;
        this.edad = edad;
        this.aburrimiento = aburrimiento;
        this.hambre = hambre;
        this.energia = energia;
        this.necesidades = necesidades;
        this.morir = morir;
        this.salud = salud;
    }

    public Mascota() {
        this("Default", 0, 0, 0, 100, 0, false, false);
    }

    public void alimentar(Alimentos alimento) {
        this.setHambre(this.getHambre() - alimento.calorias);
        this.setEnergia(this.getEnergia() + alimento.energia);
    }

    public void curar(Medicamento medicamento) {
        if (this.isSalud() == false) {
            this.setAburrimiento(this.getAburrimiento() + medicamento.bajarAburrimiento);
            this.setEnergia(this.getEnergia() - medicamento.subirEnergia);
            this.setHambre(this.getHambre() + medicamento.bajarHambre);
            this.setNecesidades(this.getNecesidades() + medicamento.bajarNecesidades);
        }else{
        this.setAburrimiento(this.getAburrimiento() - medicamento.bajarAburrimiento);
        this.setEnergia(this.getEnergia() + medicamento.subirEnergia);
        this.setHambre(this.getHambre() - medicamento.bajarHambre);
        this.setNecesidades(this.getNecesidades() - medicamento.bajarNecesidades);
        }
    }

    public void realizarActividad(Actividades actividad) {
        this.setAburrimiento(this.getAburrimiento() - actividad.cantidadAburrimiento);
        this.setEnergia(this.getEnergia() - actividad.cantidadEnergia);
    }

    @Override
    public String toString() {
        return """
               
               *************
               Nombre: """ + nombre + "||Edad: " + edad + "||Aburrimiento: " + aburrimiento + "||Hambre: " + hambre + "||Energia: " + energia + "||Necesidades: " + necesidades + "||Salud: " + salud + "||Morir: " + morir;
    }

}
