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
public class Electrodomestico {
    protected int precio_base;
    protected String color;
    protected char consumo_energia;
    protected int peso;

    
    public Electrodomestico() {
        this.precio_base = 1000;
        this.color ="Blanco";
        this.consumo_energia = 'F';
        this.peso = 5;    
    }

    public Electrodomestico(int precio_base, String color, char consumo_energia, int peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energia = consumo_energia;
        this.peso = peso;
    }
    
    
    public void comprobarConsumoEnergetico(){
        if(this.consumo_energia>=65 && this.consumo_energia<=70 || this.consumo_energia>=97&&this.consumo_energia<=102){
        
        }else{
            this.consumo_energia = 'F';
        }   
    }
    
    
    public void comprobarColor(){
        String toUpperCase = this.color.toUpperCase();
        if("BLANCO".equals(toUpperCase) ||"NEGRO".equals(toUpperCase) || "ROJO".equals(toUpperCase) || "AZUL".equals(toUpperCase) ||"GRIS".equals(toUpperCase)){
        } else {
            this.color = "BLANCO";
                }
         }   
    
    public void precioFinal(){
        switch (this.consumo_energia) {
            case 65:
            case 97:
                this.precio_base += 1000;
                break;
            case 66:
            case 98:
                this.precio_base +=800;
                break;
            case 67:
            case 99:
                this.precio_base +=600;
                break;
            case 68:
            case 100:
                this.precio_base +=500;
                break;
            case 69:
            case 101:
                this.precio_base +=300;
                break;
            case 70:
            case 102:
                this.precio_base +=300;
                break;
            default:
                break;
        }
        
    if(this.peso >= 0 && this.peso <=19){
          this.precio_base +=100;
          
            }else if(this.peso >19 && this.peso <=49){
                  this.precio_base  +=500;
                 
                     }else if(this.peso >49 && this.peso <=79){
                             this.precio_base  +=800;
                             
                                    }else if(this.peso >79){
                                          this.precio_base  +=1000;
                                        }
                        }

    @Override
    public String toString() {
        return "Electrodomestico " + " precio_base= " + precio_base + ", color= " + color + ", consumo_energia= " + consumo_energia + " peso=" + peso;
    }
          




}