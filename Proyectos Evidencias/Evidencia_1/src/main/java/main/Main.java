/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//Importa al clase Scanner 
import java.util.Scanner;

//Nombre de la clse
public class Main {
    
    //Metodo principal (main)
    public static void  main(String[] args){
        //Creamos una variable llamada result para almacenar el resultado de la suma
        double result = 0;
        
        //Creamos un objeto de tipo Scanner
        Scanner sc = new Scanner(System.in);
        
        //Forma de imprimir por pantalla 
        System.out.println("Ingresa tu nombre por favor");
        //Variable de tipo Stirng llamada "name"
        String name = sc.nextLine();
        
        System.out.println("Ingrese un numero entero por favor");
        //Variable de tipo Integer llamda "int_numbre"
        int int_numbre = sc.nextInt();
        
        System.out.println("Ingrese un numero decimal por favor");
        //Variable de tipo double llamada "decimal_numbre"
        double decimal_numbre = sc.nextDouble();   
        
        //Realizamos la suma 
        result = int_numbre + decimal_numbre;
        
        System.out.println("Hola " + name + " el resultado de la suma entre " + int_numbre + " y " + decimal_numbre + " es " + result);
        
    }
}
