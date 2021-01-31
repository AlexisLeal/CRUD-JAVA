/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ALEXIS
 */
public class Main {
    static  Empleado[] empleado;
    static int x = 0;
    static int empleados = 0;
    

    public static void main(String[] args) throws InputMismatchException{
      char option;
      Scanner sc = new Scanner(System.in);
      System.out.println("Bievenido\n ¿cuantos empleados desea agregar?");
      empleados = leerenteros();  
      empleado= new Empleado[empleados];      
      do{
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
                  break;
              case '4':
                  System.out.println("Hasta luego");
                  break;
              default:
                  System.out.println("Ingrese una option valida");
            
          }
     }while(option!='4');      
        
    }
    public static void agregarempleado(){
        Scanner sc = new Scanner(System.in);
          if(empleados==x){
            System.out.println("Ya no puedes agregar mas empleados");
            x--;
        }else{     
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
        
       do{
        System.out.println("Ingrese la edad");
        edad = getEddad();
        try{
            validadEdad(edad);
        }catch(CustomException ex){
            System.out.println(ex.getMessage());    
        }
      }while(edad<18 || edad>45); 
        
        System.out.println("¿Cuenta con cedula? Si/No");
        respuesta = sc.nextLine();
        Cedula = "si".equals(respuesta) || "Si".equals(respuesta) || "SI".equals(respuesta);
       
        System.out.println("Ingrese el salario");
        Salario = leerdoble();
        
        empleado[x] = new Empleado(Nombre,Cedula,Estado_Civil,edad,Salario,Calificacion,Apellido);
        empleado[x].asignarClasificación();
        }
          }
    
    
    
    public static void agregarprogramdor(){ 
        Scanner sc = new Scanner(System.in);
          if(empleados==x){
            System.out.println("Ya no puedes agregar mas empleados");
            x--;
        }else{     
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
      do{
        System.out.println("Ingrese la edad");
        edad = getEddad();
        try{
            validadEdad(edad);
        }catch(CustomException ex){
            System.out.println(ex.getMessage());    
        }
      }while(edad<18 || edad>45); 
         
        System.out.println("¿Cuenta con cedula? Si/No");
        respuesta = sc.nextLine();
        Cedula = "si".equals(respuesta) || "Si".equals(respuesta) || "SI".equals(respuesta);
        
        System.out.println("Ingrese el lenguaje dominante");
        lenguajeDominante = sc.nextLine();
        
        System.out.println("Ingrese la lineas de codigo por hora");
        lineasDeCodigoPorHora= sc.nextInt();
       
        System.out.println("Ingrese el salario");
        Salario = leerdoble();
        
        empleado[x] = new Programador(Nombre,Cedula,Estado_Civil,edad,Salario,Calificacion,Apellido,lineasDeCodigoPorHora,lenguajeDominante);
        
        empleado[x].asignarClasificación();
        
     
        
          }
}
    
    public static void mostrarinformacion(){       
   
    if(x==0){
        System.out.println("No has agregado ningun empleado o programador");
    }else{
         for(int i=0; i<x;i++){
             System.out.println("\n");
             System.out.println(empleado[i].toString());
             System.out.println("\n");
          }
         
        }
     }
    
    public static int leerenteros(){
        int entero = 0;
      do{
          try{
            Scanner sc = new Scanner(System.in);
            entero = sc.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Algo salio mal :c ,por favor intente nuevamente, Recuerde que debe ser un numero entero");
         }
      }while(entero==0);
           return entero;
    }
    public static double leerdoble(){
        double doble = 0;
      do{
          try{
            Scanner sc = new Scanner(System.in);
            doble = sc.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Algo salio mal :c ,por favor intente nuevamente ingresar el salario");
         }
      }while(doble==0);
           return doble;       
    }  
    
       public static int getEddad() throws InputMismatchException{
            int edad = 0;   
           do{
               try{
                   Scanner sc = new Scanner(System.in);
                    edad = sc.nextInt();
               }catch(InputMismatchException ex){
                   System.out.println("Algo salio mal :c ,por favor intente nuevamente ingresar la edad ");
               }
           }while(edad==0);  
         return edad;
     }
       
       public static void validadEdad(int edad) throws CustomException{
              if(edad<18 || edad>45){
               throw new CustomException("La edad capturada no pertenece al rango permitido (18 a 45 años), favor de capturar nuevamente");
              }
         
           
       }
    
    
}
