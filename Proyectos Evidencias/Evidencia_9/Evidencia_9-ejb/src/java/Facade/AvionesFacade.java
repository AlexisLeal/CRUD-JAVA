/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Aviones;
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
public class AvionesFacade {

     
    @PersistenceContext(unitName = "Evidencia_9-ejbPU") 
    private EntityManager em;
    
    
     public List<Aviones> findAll(){
         //TypeQuery 
        TypedQuery <Aviones> querry;
       // querry = em.createQuery("Select x.id, x.numeroavion, x.capacidad_pasajeros FROM Aviones x", Aviones.class); se comento por la actividad 13
        querry = em.createQuery("Select x FROM Aviones x", Aviones.class);
        return querry.getResultList();   
    }
     
     
     
      public List<Aviones> findAll2(){
        //NamedQuerries
        Query query;  
        query = em.createNamedQuery("FindAviones");
        
        return query.getResultList();
    } 
      
      
     public List <Aviones> findByNoAviones(String Numero_Avion){
         //TypedQuerry
            TypedQuery <Aviones> querry;
            //Especificamos 
          querry = em.createQuery("Select x.numeroavion from Aviones x where x.numeroavion=:numero_avion", Aviones.class);
          querry.setParameter("numero_avion", Numero_Avion);
          //return querry.getSingleResult(); no se utliza el single por que si no lo encuntra ocasiona un error por eso utilzamos el List
          //Aparte debemos hacer un casteo 
          return querry.getResultList();
     }
     
     
      public List <Aviones> findByAviones2(String numero_avion, int capacidad_pasajeros){
         //NamedQuerries
         Query query;
         
         query = em.createNamedQuery("FindAviones2");
         
         query.setParameter("numero_avion", numero_avion);
         //el "numero_vuelo" del set debe ser igual como en la consulta de sql 
         query.setParameter("capacidad_pasajeros",capacidad_pasajeros);
         
          return query.getResultList();
          // Aqui pide casteo por que en el aterio le decimos el tipo de dato que va hacer 
          
     }
      
      public void insert(Aviones aviones){
          em.persist(aviones);
          //el persiste sube nuevos regristos
      }
      
       public void update(Aviones aviones){
          em.merge(aviones);
          // el marge sube un un regrito que ya estaba ahi 
      }
       
         public Aviones find(Long id){
           return em.find(Aviones.class, id);
       }
       
}
