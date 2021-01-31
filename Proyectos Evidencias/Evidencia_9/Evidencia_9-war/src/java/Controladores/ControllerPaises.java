/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Entity.Paises;
import Facade.PaisesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ALEXIS
 */
@Named(value = "controllerPaises")
@SessionScoped
public class ControllerPaises implements Serializable {

    
    @EJB
    private PaisesFacade paisesfacade;
    private Paises paises = new Paises();
     private boolean confirm = false;
    
    public List<Paises> findAll(){
        return paisesfacade.findAll();
    }
    
     public List<Paises> findAll2(){
        return paisesfacade.findAll2();
    }
     
     public List <Paises> findAll3(){
         return paisesfacade.findByNombre("Mexico");
     }
     
     public void clean(){
         paises = new Paises();
         //Funcion que limpia el objeto
     }
     
      public String insert(){
      try{
         paisesfacade.insert(paises);
         //Llama al objeto declaro mas arriba llamado aviones
         clean();
      }catch(Exception e){
          
      }
      //En el return se pone el Xhtml que queremos que nos rederiga despues de ejecutar esta funcion 
      return "PaisesAlta"; 
  }
    /**
     * @return the paises
     */
      
      public String prepareEdit(Paises paises){
          this.paises = paises;
          return "PaisesEdit";
      }
      public String update(){
          paisesfacade.update(paises);
          clean();
          return "PaisesList";
      }
      
      
      public Paises find(Long id){
          return paisesfacade.find(id);
      }
      
        public String prepareConfirm(){
            setConfirm(true);
             return "PaisesList";
  }
      
    public Paises getPaises() {
        return paises;
    }

    /**
     * @param paises the paises to set
     */
    public void setPaises(Paises paises) {
        this.paises = paises;
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
