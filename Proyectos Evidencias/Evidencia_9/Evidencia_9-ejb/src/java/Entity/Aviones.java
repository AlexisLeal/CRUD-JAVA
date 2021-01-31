/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ALEXIS
 * RECUERDA que todas las variables deben tener su getter y su setter para poder acceder
 */
@Entity
@Table(name = "Aviones")
@NamedQueries({
    
    @NamedQuery(name = "FindAviones",query = "Select x.id, x.numeroavion, x.capacidad_pasajeros FROM Aviones x"),
    @NamedQuery(name = "FindAviones2",query = "Select x.numeroavion, x.capacidad_pasajeros FROM Aviones x where x.numeroavion=:numero_avion AND x.capacidad_pasajeros=:capacidad_pasajeros")
})

public class Aviones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NumeroDeAvion",length = 20,nullable = false)
    private String numeroavion;
    
    @Column(name = "capacidaddepasajeros",nullable = false)
    private int capacidad_pasajeros;
    
    @Column(name = "modelo",length = 25,nullable = false)
    private String modelo;
    
    @Column(name = "aerolínea",length = 35,nullable = false)
    private String aerolínea;
   
    
     @OneToMany(cascade = CascadeType.MERGE,mappedBy = "NumeroDeAvion")
     //El mappedy debe el nombre del joincolumn debe ser el mismo nombre 
     private List <Vuelos> Lista;
     
    
     
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aviones)) {
            return false;
        }
        Aviones other = (Aviones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Aviones[ id=" + id + " ]";
    }

    /**
     * @return the numeroavion
     */
    public String getNumeroavion() {
        return numeroavion;
    }

    /**
     * @param numeroavion the numeroavion to set
     */
    public void setNumeroavion(String numeroavion) {
        this.numeroavion = numeroavion;
    }

    /**
     * @return the capacidad_pasajeros
     */
    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    /**
     * @param capacidad_pasajeros the capacidad_pasajeros to set
     */
    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the aerolínea
     */
    public String getAerolínea() {
        return aerolínea;
    }

    /**
     * @param aerolínea the aerolínea to set
     */
    public void setAerolínea(String aerolínea) {
        this.aerolínea = aerolínea;
    }
    
}
