/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Cuidades;
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
public class CuidadesFacade { 
    @PersistenceContext(unitName = "Evidencia_9-ejbPU") 
    private EntityManager em;
    
    
    
      public List<Cuidades> findAll(){
         //TypeQuery 
        TypedQuery <Cuidades> querry;
        //querry = em.createQuery("Select x.id, x.nombre, x.estado FROM Cuidades x", Cuidades.class);
        querry = em.createQuery("Select x FROM Cuidades x", Cuidades.class);
        return querry.getResultList();   
    }
     
     
     
      public List<Cuidades> findAll2(){
        //NamedQuerries
        Query query;  
        query = em.createNamedQuery("FindCuidades");
        
        return query.getResultList();
    }
      /*
       public List <Cuidades> findByEstado(String Nombre_Estado){
         //TypedQuerry
            TypedQuery <Cuidades> querry;
            //Especificamos 
          querry = em.createQuery("Select x.estado from Cuidades x where x.estado=:nombre_estado", Cuidades.class);
          querry.setParameter("nombre_estado", Nombre_Estado);
          //return querry.getSingleResult(); no se utliza el single por que si no lo encuntra ocasiona un error por eso utilzamos el List
          //Aparte debemos hacer un casteo 
          return querry.getResultList();
     }
      */
           
       public List <Cuidades> findByNombre(String nombre){
         //NamedQuerries
         Query query;
         
         query = em.createNamedQuery("FindCuidades2");
         
         query.setParameter("nombre", nombre);
         //el "numero_vuelo" del set debe ser igual como en la consulta de sql 
         
          return query.getResultList();
          // Aqui pide casteo por que en el aterio le decimos el tipo de dato que va hacer 
          
     }
       
       
         public void insert(Cuidades cd){
          em.persist(cd);
          //el persiste sube nuevos regristos
      }
      
       public void update(Cuidades cd){
          em.merge(cd);
          // el marge sube un un regrito que ya estaba ahi 
      }
       public Cuidades find(Long id){
           return em.find(Cuidades.class, id);
       }
      
}
