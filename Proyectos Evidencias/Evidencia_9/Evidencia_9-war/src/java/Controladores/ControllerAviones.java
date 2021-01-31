/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entity.Aviones;
import Facade.AvionesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 Archivo jfs CDE bEAN
 * @author ALEXIS
 */
@Named(value = "controllerAviones")
@SessionScoped
public class ControllerAviones implements Serializable {

   @EJB
   private AvionesFacade avionesfacade;
   //Muy importante esta parde donde se crear el objeto tipo de Aviones
   private Aviones aviones = new Aviones();
   private boolean confirm = false;
   
   public List<Aviones> findAll(){
       return avionesfacade.findAll();
   }
    
    public List<Aviones> findAll2(){
       return avionesfacade.findAll2();
   }
 public List<Aviones> findAll3(){
       return avionesfacade.findByAviones2("123", 550);
   }
 
  public List<Aviones> findAll4(){
       return avionesfacade.findByNoAviones("123");
   }
  
  public void clean(){
      aviones = new Aviones();
      //Funcion que limpia el objeto
  }
  
  public String insert(){
      try{
         avionesfacade.insert(aviones);
         //Llama al objeto declaro mas arriba llamado aviones
         clean();
         //Limpia el objeto, para que no esten los campos llenos cada ves que insertamos un nuevo objeto
      }catch(Exception e){    
      }
      //En el return se pone el Xhtml que queremos que nos rederiga despues de ejecutar esta funcion 
      return "AvionesAlta";
  }
  
  public String prepareEdit(Aviones aviones){
      //Nos manda a la pagina para editar
      this.aviones = aviones;  
      return "AvionesEdit";
  }
  
  public String update(){
      //Esta funcion nos ayuda ahora si actualizar 
      avionesfacade.update(aviones);
      clean();
      return "AvionesList";
  }
  
   public Aviones find(Long id){
        return avionesfacade.find(id);
    }
   public String prepareConfirm(){
       setConfirm(true);
       return "AvionesList";
   }


    /**
     * @return the aviones
     */
    public Aviones getAviones() {
        return aviones;
    }

    /**
     * @param aviones the aviones to set
     */
    public void setAviones(Aviones aviones) {
        this.aviones = aviones;
    }

    /**
     * @return the confirm
     */
    public boolean isConfirm() {
        return confirm;
    }

    /**
     * @param confirm the confirm to set
     */
    public void setConfirm(boolean confirm) {
        this.confirm = confirm;
    }
    
    
}
