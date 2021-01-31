/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 
 * @author ALEXIS
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el valor del radio ");
        //Creamos una variable llamada "radio" que almacena el valor que ingresa el usario 
        int radio = sc.nextInt();
        
       /* Creamos una variable de tipo double llamada "result" que almacena el valor que regresa la funcion " calcularCircunferencia"
          que un valor tipo double que se le envia el valor que introduzco el usuario */
        double result = calcularCircunferencia(radio);
        
        System.out.println("Circuferencia: " + result);
        
        //Sobreescribimos la variable "result" con el valor que regresa la funcion calcularArea
        result = calcularArea(radio);
        
        System.out.println("Area: " + result);
        
        
        
        
        }
    
    //Creamos un metodo public estatico que nos regresa un valor double llamado calcularCircunferencia
    public static double calcularCircunferencia(int radio){
        return (2*radio) * 3.1416;
        
    }
    
     //Creamos un metodo public estatico que nos regresa un valor double llamado calcularArea
    public static double calcularArea(int radio){
        return  Math.pow(radio, 2) * 3.1416; 
        
    }
    
}
