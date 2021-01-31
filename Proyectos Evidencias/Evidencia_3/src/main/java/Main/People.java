/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
  * @author ALEXIS*
Como duda
* Tambien se podia usar un array dinamico con objetos de tipo persona para almacenar 
* los objetos ?
 */
public class People {
   static  int contador = 0;
   static String peoples [][];
   
      public static void main(String [] args){
        Scanner sc = new Scanner(System.in); 
        char option;
        System.out.println("¿Cuanta personas deseas agregar?");
        int people = sc.nextInt();
        peoples = new String [people][4];
       
      
        do{
            System.out.println("¿Que desea hacer?");
            System.out.println("1- Agregar una persona\n2- Monstrar informacion de las personas\n3- Salir del programa\n ");
            option = sc.next().charAt(0);
            switch (option){
                
            case '1': addpeople();
                    break;
            case '2': showinformation();
                    break;
            case '3': System.out.println("Hasta luego");break;
           
            default:
                System.out.println("Ingrese una opcion valida por favor");         
        }            
        }while(option !='3');    
    } 
    
    public static void addpeople(){
    Scanner sc = new Scanner(System.in); 
    if(contador<peoples.length){
        for(int i=0;i<4;i++){
             switch (i) {
                 case 0:
                     System.out.println("Ingrese el nombre de la persona de la posicion " + (contador+1));
                     peoples[contador][i] = sc.nextLine();
                     break;
                 case 1:
                     System.out.println("Ingrese la edad de "+peoples[contador][i-1]);
                     peoples[contador][i] = sc.nextLine();
                     break;
                 case 2:
                     System.out.println("Ingrese el estado civil(S/C)");
                     peoples[contador][i] = sc.nextLine();
                     break;
                 case 3:
                     System.out.println("Ingrese el sexo(H/F)");
                     peoples[contador][i] = sc.nextLine();
                     break;
                 default:
                     break;
             }
            }
        contador++;
    }else{
        System.out.println("Ya no puede agregar mas usuarios a alcanzado el numero maximo de usuarios");
    }
        
        }
    
    public static void showinformation(){
        int S = 0,C = 0,age = 0,H=0,F=0;
        double promedio_C = 0,promedio_S = 0;
        
        System.out.println("La cantidad de personas ingresadas es "+ (contador) );
        for(int i=0;i<contador;i++){
             age += Integer.parseInt(peoples[i][1]);
           }
        double promedio_age = age/contador;
        System.out.println("El promedio de edad es: " + promedio_age+"%");
        
        //Casados o solteros 
         for(int i=0;i<contador;i++){
             //SOLTEROS
             if("S".equals(peoples[i][2])||"s".equals(peoples[i][2])){
                    S++;   
             //Casados 
             }else if("C".equals(peoples[i][2])||"c".equals(peoples[i][2])){
                  C++;     
             } 
           }
         promedio_C = (double) C/contador*100;
         promedio_S = (double) S/contador*100;       
         System.out.println("El procentaje de Casados es " + promedio_C + "%");
         System.out.println("El procentaje de Solteros es " + promedio_S + "%");
         
         
          //Hombre o Mujer 
          for(int i=0;i<contador;i++){
              //Hombre
             if("H".equals(peoples[i][3])||"h".equals(peoples[i][3])){
                    H++;   
             //Mujeres 
             }else if("F".equals(peoples[i][3])||"f".equals(peoples[i][3])){
                  F++;
                 
             } 
           }
          double promedio_H = (double) H/contador*100;
          double promedio_F = (double) F/contador*100; 
          System.out.println("El procentaje de Hombres  es " + promedio_H+ "%");
          System.out.println("El procentaje de Mujeres  es " + promedio_F + "%");
          System.out.println("\n");
         
        
    }
}
