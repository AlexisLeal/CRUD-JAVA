/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entity.Cuidades;
import Facade.CuidadesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ALEXIS
 */
@Named(value = "controllerCuidades")
@SessionScoped
public class ControllerCuidades implements Serializable {

    @EJB
    private CuidadesFacade cuidadesfacade;
    private Cuidades cuidades = new Cuidades();
    private boolean confirm = false;
    
    
    public List<Cuidades> findAll(){
        return cuidadesfacade.findAll();
    }
    
     public List<Cuidades> finAll2(){
         return cuidadesfacade.findAll2();
     }
     
       public List<Cuidades> finAll4(){
         return cuidadesfacade.findByNombre("Monterrey");
     }
       public void clean(){
           cuidades = new Cuidades();
           //Funcion que limpia el objeto
       }
       
        public String insert(){
      try{
         
         cuidadesfacade.insert(cuidades);
         //Llama al objeto declaro mas arriba llamado aviones
         clean();
      }catch(Exception e){
          
      }
      //En el return se pone el Xhtml que queremos que nos rederiga despues de ejecutar esta funcion 
      return "CuidadesAlta";
  }
        public String prepareEdit(Cuidades cuidades){
            this.cuidades = cuidades;
            return "CuidadesEdit";
        }
        
        public String update(){
            cuidadesfacade.update(cuidades);
            clean();
            return "CuidadesList";
        }
        
          public String prepareConfirm(){
            setConfirm(true);
                return "CuidadesList";
  }
        
        public Cuidades find(Long id){
            return cuidadesfacade.find(id);
        }

    /**
     * @return the cuidades
     */
    public Cuidades getCuidades() {
        return cuidades;
    }

    /**
     * @param cuidades the cuidades to set
     */
    public void setCuidades(Cuidades cuidades) {
        this.cuidades = cuidades;
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
