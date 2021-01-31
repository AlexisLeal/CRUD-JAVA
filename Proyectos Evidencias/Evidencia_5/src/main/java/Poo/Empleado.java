/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

/**
 *
 * @author ALEXIS
 */
public class Empleado {
    protected String Nombre = "",Estado_Civil = "",Apellido="";
    protected int edad = 0;
    protected double Salario = 0;
    protected boolean Cedula =  false;
    protected String Calificacion = "";

    public Empleado(String Nombre, boolean Cedula, String Estado_Civil, int edad, double Salario, String Calificacion,String Apellido){
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Estado_Civil = Estado_Civil;
        this.edad = edad;
        this.Salario = Salario;
        this.Calificacion = Calificacion;
        this.Apellido = Apellido;
    }

     public void asignarClasificación(){
        if(this.edad >=18 && this.edad <=21 ){
            this.Calificacion = "Pricipiante";
        }else if(this.edad >= 22 && this.edad <= 35){
            this.Calificacion = "Intermedio";
         }else if(this.edad >= 36 && this.edad <= 45){
            this.Calificacion = "Senior";
        }    
        
    }

    @Override
    public String toString() {
        return "Nombre= " + Nombre + "\nApellido= " + Apellido +" \nEstado_Civil= " + Estado_Civil + "\nedad= " + edad + "\nSalario= " + Salario + "\nCedula= " + Cedula + "\nCalificacion= " + Calificacion;
    }
    
    
}
