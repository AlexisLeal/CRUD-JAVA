/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Main {
    static  Empleado[] empleado;
    //Variable para la posicion en el array de tipo Empleado
    static int x = 0;
    static int empleados = 0;
    

    public static void main(String[] args){
     //La variable c es para hacer un conteo de cuantos empleados agregado el usuario
      //int c = 0;
      char option;
      Scanner sc = new Scanner(System.in);
      System.out.println("Bievenido\n ¿cuantos empleados desea agregar?");
      empleados = sc.nextInt();
      
      empleado= new Empleado[empleados];
      do{
          //Quitar el sout y poner if en los metodos if empleados == x{
         // System.out.println("Tu has agregado "+ c + " Empleados "+ "Te quedan " + (empleados - c));
          System.out.println("¿Que deseas hacer?\n [1]-Agregar un empleado\n [2]-Agregar un programador\n [3]-Mostrar informacion\n [4]-Salir del programa");
          option = sc.next().charAt(0);
          switch (option){
              case '1': agregarempleado();
                  x++;
                  break;
              case '2': agregarprogramdor();
                  x++;
                  break;
                  
              case '3': mostrarinformacion();
                      //  c--;
                  break;
              case '4':
                  //c = empleados;
                  System.out.println("Hasta luego");
                  break;
              default:
                  System.out.println("Ingrese una option valida");
               //   c--;
          }
           
        //  c++;
      }while(option!='4');      
        
    }
    
   //12:35 am vas a completar este metodo vas hacer poliformismo, y la x que tienes arriba va hacer la ubicacion del arreglo 
    public static void agregarempleado(){
        Scanner sc = new Scanner(System.in);
        
        if(empleados==x){
            System.out.println("Ya no puedes agregar mas empleados");
            x--;
        }else{     
        //System.out.println("la x vale " + x);
        String Nombre,Apellido,Estado_Civil,respuesta,Calificacion = "";
        int edad;
        double Salario;
        boolean Cedula = false;
        System.out.println("Ingrese el nombre del empleado");
        Nombre = sc.nextLine();
 
        System.out.println("Ingrese el apellido del empleado");
        Apellido = sc.nextLine();
        
        System.out.println("Ingrese el estado civil");
        Estado_Civil = sc.nextLine();
        
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        //Para liberar el buffer siempre ponerlo cuando entrer un tipo de dato numero y un string o char 
        sc.nextLine();
        
        System.out.println("¿Cuenta con cedula? Si/No");
        respuesta = sc.nextLine();
        Cedula = "si".equals(respuesta) || "Si".equals(respuesta) || "SI".equals(respuesta);
       
        System.out.println("Ingrese el salario");
        Salario = sc.nextDouble();
        
        empleado[x] = new Empleado(Nombre,Cedula,Estado_Civil,edad,Salario,Calificacion,Apellido);
        empleado[x].asignarClasificación();
        
      //  System.out.println(empleado[x].toString());
        }
          }
    
    
    
    public static void agregarprogramdor(){ 
        Scanner sc = new Scanner(System.in);
          if(empleados==x){
            System.out.println("Ya no puedes agregar mas empleados");
            x--;
        }else{     
         // System.out.println("la x vale " + x);
        String Nombre,Apellido,Estado_Civil,respuesta,Calificacion = "",lenguajeDominante;
        int edad, lineasDeCodigoPorHora;
        double Salario;
        boolean Cedula = false;
        System.out.println("Ingrese el nombre del programador");
        Nombre = sc.nextLine();
 
        System.out.println("Ingrese el Apellido del programador");
        Apellido = sc.nextLine();
        
        System.out.println("Ingrese el estado civil");
        Estado_Civil = sc.nextLine();
        
        System.out.println("Ingrese la edad");
        edad = sc.nextInt();
        //Para liberar el buffer siempre ponerlo cuando entrer un tipo de dato numero y un string o char 
        sc.nextLine();
        
        System.out.println("¿Cuenta con cedula? Si/No");
        respuesta = sc.nextLine();
        Cedula = "si".equals(respuesta) || "Si".equals(respuesta) || "SI".equals(respuesta);
        
        System.out.println("Ingrese el lenguaje dominante");
        lenguajeDominante = sc.nextLine();
        
        System.out.println("Ingrese la lineas de codigo por hora");
        lineasDeCodigoPorHora= sc.nextInt();
       
        System.out.println("Ingrese el salario");
        Salario = sc.nextDouble();
        
        empleado[x] = new Programador(Nombre,Cedula,Estado_Civil,edad,Salario,Calificacion,Apellido,lineasDeCodigoPorHora,lenguajeDominante);
        
        empleado[x].asignarClasificación();
        
       // System.out.println(empleado[x].toString());
        
          }
}
    
    public static void mostrarinformacion(){       
    /*  for(Empleado i:empleado){
           i.toString();
      }              
    */
    if(x==0){
        System.out.println("No has agregado ningun empleado o programador");
    }else{
        //System.out.println("el valor de x es "+ x);
         for(int i=0; i<x;i++){
             System.out.println("\n");
             System.out.println(empleado[i].toString());
             System.out.println("\n");
          }
         
        }
     }
    
}
