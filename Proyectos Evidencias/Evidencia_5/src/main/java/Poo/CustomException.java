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
public class CustomException extends Exception {
    
    public CustomException(){
        
    }
    
    public  CustomException(String msj_error){
        super(msj_error);
    }
}
