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
public class Desarrollador implements Interfaz {
    
    private String nombre;
    private String lineascodigo;

    public Desarrollador(String nombre, String lineascodigo) {
        this.nombre = nombre;
        this.lineascodigo = lineascodigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLineascodigo() {
        return lineascodigo;
    }

    public void setLineascodigo(String lineascodigo) {
        this.lineascodigo = lineascodigo;
    }

    @Override
    public void encenderObjeto() {
         System.out.println("Soy el desarrollador " + this.nombre + " y encendi mi computadora");
    }

    @Override
    public void maniobrarObjeto() {
        System.out.println("Soy el desarrollador " + this.nombre+ " y llevo mas de " + this.lineascodigo + " lineas de codigo");
    }

    @Override
    public void apagarObjeto() {
         System.out.println("Soy el desarrollador " + this.nombre + " y apague mi computadora");
    }
    
    
}
