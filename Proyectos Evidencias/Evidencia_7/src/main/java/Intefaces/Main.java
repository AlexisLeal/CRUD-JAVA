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
public class Main {
    
    
    public static void main(String[] args){
        
        Cocinero cocinero = new Cocinero("Daniela","400");
        
        Desarrollador desarrollador = new Desarrollador("Alexis","700");
        
        Piloto piloto = new Piloto("David","7");
        
       /* 
        Se que por eso eran los metodos set y get pero se me hizo mas sencillo hacer constructor y daler los metodos directos
        cocinero.setNombre("Leal");
        */
       
      piloto.encenderObjeto();
      piloto.maniobrarObjeto();
      piloto.apagarObjeto();
        System.out.println("\n");
      desarrollador.encenderObjeto();
      desarrollador.maniobrarObjeto();
      desarrollador.apagarObjeto();
        System.out.println("\n");
        
      cocinero.encenderObjeto();
      cocinero.maniobrarObjeto();
      cocinero.apagarObjeto();
    }
    
    
}
