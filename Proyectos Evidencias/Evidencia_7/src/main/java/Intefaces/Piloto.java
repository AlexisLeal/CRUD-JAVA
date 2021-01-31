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
public class Piloto implements Interfaz{
    private String nombre;
    private String aniosvolando;

    public Piloto(String nombre, String aniosvolando) {
        this.nombre = nombre;
        this.aniosvolando = aniosvolando;
    }
    
    

    public String getAniosvolando() {
        return aniosvolando;
    }

    public void setAniosvolando(String aniosvolando) {
        this.aniosvolando = aniosvolando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void encenderObjeto() {
         System.out.println("Soy el piloto " + this.nombre + " y encendi mi nave");
    }

    @Override
    public void maniobrarObjeto() {
        System.out.println("Soy el piloto " + this.nombre + " Y llevo mas " + this.aniosvolando + " volando");
    }

    @Override
    public void apagarObjeto() {
        System.out.println("Soy el piloto " + this.nombre + " y apague mi nave");
    }
    
    
    
    
    
    
    
    
    
    
    
}
