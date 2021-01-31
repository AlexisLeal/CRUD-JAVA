/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Estados;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author ALEXIS
 */
@Stateless
@LocalBean
public class EstadosFacade {

    
    @PersistenceContext(unitName = "Evidencia_9-ejbPU") 
    private EntityManager em;
    
    
    
     public List<Estados> findAll(){
         //TypeQuery 
        TypedQuery <Estados> querry;
        //querry = em.createQuery("Select x.id, x.nombre, x.pais FROM Estados x", Estados.class);
        querry = em.createQuery("Select x FROM Estados x", Estados.class);
        return querry.getResultList();   
    }
     
     
     
      public List<Estados> findAll2(){
        //NamedQuerries
        Query query;  
        query = em.createNamedQuery("FindEstados");
        
        return query.getResultList();
    }
      
        public List <Estados> findByEstado(String Nombre_Estado){
         //TypedQuerry
            TypedQuery <Estados> querry;
            //Especificamos 
          querry = em.createQuery("Select x.nombre from Estados x where x.nombre=:nombre_estado", Estados.class);
          querry.setParameter("nombre_estado", Nombre_Estado);
          //return querry.getSingleResult(); no se utliza el single por que si no lo encuntra ocasiona un error por eso utilzamos el List
          //Aparte debemos hacer un casteo 
          return querry.getResultList();
     }
        
          public void insert(Estados est){
          em.persist(est);
          //el persiste sube nuevos regristos
      }
      
       public void update(Estados est){
          em.merge(est);
          // el marge sube un un regrito que ya estaba ahi 
      }
       public Estados find(Long id){
           return em.find(Estados.class, id);
       }
}
