/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entity.Vuelos;
import Facade.VuelosFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ALEXIS
 */
@Named(value = "controllerVuelos")
@SessionScoped
public class ControllerVuelos implements Serializable {

 @EJB
 private VuelosFacade vuelosfacade;
 private Vuelos vuelo = new Vuelos();
 private boolean confirm = false;
 
 public List <Vuelos> findAll(){
     return vuelosfacade.findAll();
     
 }
 
  public List <Vuelos> findAll2(){
     return vuelosfacade.findAll2();    
 }
  
  public List <Vuelos> findAll3(){
      return vuelosfacade.findByNoVuelos("123");
      //Aqui va el parametro 
  }
 
  public List <Vuelos> findAll4(){
      return vuelosfacade.findByNoVuelos2("123");
      //Aqui va el parametro 
  }
  
  public void clean(){
      vuelo = new Vuelos();
      //Funcion que limpia el objeto
  }
  
  public String insert(){
      try{
         vuelosfacade.insert(vuelo);
         //Llama al objeto declaro mas arriba llamado aviones
         clean();
      }catch(Exception e){
          
      }
      //En el return se pone el Xhtml que queremos que nos rederiga despues de ejecutar esta funcion 
      return "VuelosAlta";
  }
  public String prepareEdit(Vuelos vuelos){
      this.vuelo = vuelos;
      return "VuelosEdit";
      
  }
  public String update(){
      vuelosfacade.update(vuelo);
      clean();
      return "VuelosList";
  }
  
  public String prepareConfirm(){
      setConfirm(true);
      return "VuelosList";
  }
  
 

    /**
     * @return the vuelo
     */
    public Vuelos getVuelo() {
        return vuelo;
    }

    /**
     * @param vuelo the vuelo to set
     */
    public void setVuelo(Vuelos vuelo) {
        this.vuelo = vuelo;
    }
    
    
    public Vuelos find(Long id){
        return vuelosfacade.find(id);
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
