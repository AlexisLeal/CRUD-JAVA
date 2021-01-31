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
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora = 0;
    private String lenguajeDominante = "";

    public Programador(String Nombre,boolean Cedula, String Estado_Civil, int edad, double Salario, String Calificacion,String Apellido, int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(Nombre, Cedula, Estado_Civil, edad, Salario, Calificacion, Apellido);
        this.lenguajeDominante = lenguajeDominante;
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

   

    @Override
    public String toString() {
        return "Programdor\n"+ super.toString()+ "\nlineasDeCodigoPorHora= " + lineasDeCodigoPorHora + "\nlenguajeDominante= " + lenguajeDominante;
    }
    
    
    
}
