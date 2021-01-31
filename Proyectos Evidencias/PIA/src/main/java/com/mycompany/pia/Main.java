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
public class Main {
    
    public static void main(String[] args){
        Electrodomestico[] electrodomesticos = new Electrodomestico[9];
       //Aplicacion de polirmismo
       
        //Constructores por defecto 
        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Lavadora();
        electrodomesticos[2] = new Television();
        
        //COnstructores con parametros 
        electrodomesticos[3] = new Electrodomestico(1000,"Rojo",'C',30);
        electrodomesticos[4] = new Lavadora(5000,"Azul",'D',25,20);
        electrodomesticos[5] = new Television(25,true,1000,"Verde",'E',17);
        electrodomesticos[6] = new Lavadora(7000,"Negro",'Z',30,40);
        electrodomesticos[7] = new Television(45,false,1000,"Amarrillo",'B',17);
        electrodomesticos[8] = new Electrodomestico(1500,"Gris",'A',30);
     
        
        
        for(Electrodomestico x:electrodomesticos){
            //Aqui le quise cambiar un poco senti que era mejor asi 
            x.comprobarConsumoEnergetico();
            x.comprobarColor();
            x.precioFinal();
            
            System.out.println(x.toString());
        }
    
    
    
    
    
    }
    
}
