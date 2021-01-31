/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

/**
 *
 * @author ALEXIS
 */
public class Cocinero implements Interfaz{
    
    private String nombre;
    private String horaEnEstufa;

    public Cocinero(String nombre, String horaEnEstufa) {
        this.nombre = nombre;
        this.horaEnEstufa = horaEnEstufa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraEnEstufa() {
        return horaEnEstufa;
    }

    public void setHoraEnEstufa(String horaEnEstufa) {
        this.horaEnEstufa = horaEnEstufa;
    }

    @Override
    public void encenderObjeto() {
        System.out.println("Soy el cocinero " + this.nombre + " mi encendi mi estufa");
    }

    @Override
    public void maniobrarObjeto() {
        System.out.println("Soy el cocinero " + this.nombre + " y llemos mas de " + this.horaEnEstufa + " cocinando");
    }

    @Override
    public void apagarObjeto() {
    
    System.out.println("Soy el cocinero " + this.nombre + " y apague mi estufa");
    
    }
    
    
    
    
}
