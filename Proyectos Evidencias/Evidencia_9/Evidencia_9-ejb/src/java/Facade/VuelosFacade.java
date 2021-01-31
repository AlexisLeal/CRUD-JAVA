/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Vuelos;
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
public class VuelosFacade {
    @PersistenceContext(unitName = "Evidencia_9-ejbPU") 
    private EntityManager em;
    
    //Es de tipo Vuelos por que es el tipo de tabla que vamos a buscar
    //el findall es el nombre que le damos a la funcion 
    public List<Vuelos> findAll(){
        //TypedQuerry
        TypedQuery <Vuelos> querry;
        
        //querry = em.createQuery("Select x.numerovuelos, x.NumeroDeAvion, x.origen, x.destino FROM Vuelos x", Vuelos.class);
        querry = em.createQuery("Select x  FROM Vuelos x", Vuelos.class);
        
        return querry.getResultList();   
    }
    
     public List<Vuelos> findAll2(){
        //NamedQuerries
        Query query;
        
        query = em.createNamedQuery("FindVuelos");
        
    return query.getResultList();
        
    }
     
     
     
     public List<Vuelos> findByNoVuelos(String numero_vuelo){
         //TypedQuerry
         //Buscar con paremotro cuando son varios utliza el logicas And o Or 
            TypedQuery <Vuelos> querry;
            //Especificamos 
          querry = em.createQuery("Select x.numerovuelos FROM Vuelos x where x.numerovuelos=:numero_vuelo", Vuelos.class);
          querry.setParameter("numero_vuelo", numero_vuelo);
          //return querry.getSingleResult(); no se utliza el single por que si no lo encuntra ocasiona un error por eso utilzamos el List
          //Aparte debemos hacer un casteo 
          return querry.getResultList();
     }
     
     public List<Vuelos> findByNoVuelos2(String numero_vuelo){
         //NamedQuerries
         Query query;
         
         query = em.createNamedQuery("findByNoVuelos");
         
         query.setParameter("numero_vuelo", numero_vuelo);
         //el "numero_vuelo" del set debe ser igual como en la consulta de sql 
         
          //return (Vuelos) query.getResultList();
          // Aqui pide casteo por que en el aterio le decimos el tipo de dato que va hacer 
          return query.getResultList();
     }
     
     //Tienes que checar el controler en este caso ControllerVuelos
     
        public void insert(Vuelos vuelos){
          em.persist(vuelos);
          //el persiste sube nuevos regristos
      }
      
       public void update(Vuelos vuelos){
          em.merge(vuelos);
          // el marge sube un un regrito que ya estaba ahi 
      }
       
       public Vuelos find(Long id){
           return em.find(Vuelos.class, id);
       }
     
     
    
    
}
