/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pia;

/**
 *
 * @author ALEXIS
 */
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintotinzarTDT;

    public Television(){
        super();
        this.resolucion = 20;
        this.sintotinzarTDT = false;
    }

    public Television(int resolucion, boolean sintotinzarTDT, int precio_base, String color, char consumo_energia, int peso) {
        super(precio_base, color, consumo_energia, peso);
        this.resolucion = resolucion;
        this.sintotinzarTDT = sintotinzarTDT;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); //To change body of generated methods, choose Tools | Templates.
            if(this.resolucion>40){
                double aumento = (double) this.precio_base * 0.30;
                this.precio_base += aumento;
            }
            
            if(this.sintotinzarTDT){
                this.precio_base += 500;   
            }
            
    }

    @Override
    public String toString() {
        return super.toString() + " Television " + " resolucion= " + this.resolucion + " sintotinzarTDT= " + this.sintotinzarTDT;
    }



}
