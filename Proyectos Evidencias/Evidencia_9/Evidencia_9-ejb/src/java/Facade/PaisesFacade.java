/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Paises;
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
public class PaisesFacade {  
    @PersistenceContext(unitName = "Evidencia_9-ejbPU") 
    private EntityManager em;
    
    
     public List<Paises> findAll(){
         //TypeQuery 
        TypedQuery <Paises> querry;
       // querry = em.createQuery("Select x.nombre FROM Paises x", Paises.class);
        querry = em.createQuery("Select x FROM Paises x", Paises.class);
        return querry.getResultList();   
    }
     
     
     
      public List<Paises> findAll2(){
        //NamedQuerries
        Query query;  
        query = em.createNamedQuery("FindPaises");
        
        return query.getResultList();
    }
      
     public List <Paises> findByNombre(String nombre){
         //NamedQuerries
         Query query;
         
         query = em.createNamedQuery("FindPaises2");
         
         query.setParameter("nombre", nombre);
         //el "numero_vuelo" del set debe ser igual como en la consulta de sql 
         
          return query.getResultList();
          // Aqui pide casteo por que en el aterio le decimos el tipo de dato que va hacer 
          
     }  
        public void insert(Paises paises){
          em.persist(paises);
          //el persiste sube nuevos regristos
      }
      
       public void update(Paises paises){
          em.merge(paises);
          // el marge sube un un regrito que ya estaba ahi 
      }
       public Paises find(Long id){
           return em.find(Paises.class, id);
       }
      
}
