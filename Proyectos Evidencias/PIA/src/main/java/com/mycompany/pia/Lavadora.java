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
public class Lavadora extends Electrodomestico{
          private int carga;
         
          public Lavadora() {
       //Hereda el metodo contructor por defecto de la clase padre 
          super();
          this.carga = 5;
    }

    public Lavadora(int precio_base, String color, char consumo_energia, int peso, int carga) { 
        super(precio_base, color, consumo_energia, peso);
        this.carga = carga;
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        
        if(this.carga>30){
            this.precio_base +=500;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Lavadora " + " carga= " + carga;
    }
      
    
}
