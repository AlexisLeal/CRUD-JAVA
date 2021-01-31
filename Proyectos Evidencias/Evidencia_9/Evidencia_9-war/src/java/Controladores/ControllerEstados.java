/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;


import Entity.Estados;
import Facade.EstadosFacade;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author ALEXIS
 */
@Named(value = "controllerEstados")
@SessionScoped
public class ControllerEstados implements Serializable{

  @EJB
  private EstadosFacade estadosfecade;
  private Estados estados = new Estados();
  private boolean confirm = false;
  
  public List<Estados> findAll(){
      return estadosfecade.findAll();  
}
    public List<Estados> findAll2(){
      return estadosfecade.findAll2();  
}
    
    
     public List<Estados> finAll3(){
         return estadosfecade.findByEstado("NuevoLeon");
     }
     public void clean(){
         estados = new Estados();
         //Funcion que limpia el objeto
     }

        public String insert(){
      try{
         estadosfecade.insert(estados);
         //Llama al objeto declaro mas arriba llamado aviones
         clean();
      }catch(Exception e){
          
      }
      //En el return se pone el Xhtml que queremos que nos rederiga despues de ejecutar esta funcion 
      return "EstadosAlta";
  }
        public String prepareEdit(Estados estados){
            this.estados = estados;
            return "EstadosEdit";
        }
        
        public String update(){
           estadosfecade.update(estados);
           clean();
           return "EstadosList";
        }
        
        
        
        
          public String prepareConfirm(){
                 setConfirm(true);
                return "EstadosList";
  }
        
    public Estados find(Long id){
        return estadosfecade.find(id);
    }
    /**
     * @return the estados
     */
    
    
    public Estados getEstados() {
        return estados;
    }

    /**
     * @param estados the estados to set
     */
    public void setEstados(Estados estados) {
        this.estados = estados;
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

    /**
     * @return the acuidades
     */
   
    
}
