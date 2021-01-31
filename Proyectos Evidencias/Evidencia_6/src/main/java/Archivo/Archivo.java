/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALEXIS
 */
public class Archivo {
    
    public static void main(String [] args) throws IOException{
   
            // String ruta = "C:\\ALM.txt";
            String ruta = "C:\\Users\\ALEXI\\Documents\\ALM.txt";
            String contenido = "Alexis Leal Mata";
            
            try{
                 File file = new File(ruta);
                System.out.println(file.getAbsoluteFile());
      
                   //Comprueba si ya existe el archivo 
                  if (!file.exists()) {
                     file.createNewFile();
                    //Si no existe el archivo
            }
            
            //Se hace la escritura 
            FileWriter fw = new FileWriter(file);
            BufferedWriter wr = new BufferedWriter(fw);
            wr.write(contenido);
            wr.close();
             } catch (IOException e) {
                 e.printStackTrace();
           
             }
            

            
            String Cadena;
      try{
           //Se empieza a leer el archivo
            FileReader leer = new FileReader(ruta);
            BufferedReader bf = new BufferedReader(leer);
         
            while ((Cadena = bf.readLine())!=null){
            System.out.println(Cadena);
        }
            bf.close();
           
        } catch (IOException ex) {
            ex.printStackTrace();
            }
    
        
    }
}

    
    

