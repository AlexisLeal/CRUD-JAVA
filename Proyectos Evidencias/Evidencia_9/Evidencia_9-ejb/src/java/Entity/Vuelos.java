package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ALEXIS
 */
@Entity
@Table(name = "Vuelos")
//El namedQueries es para tener varios querrys 
@NamedQueries({
    
    @NamedQuery(name = "FindVuelos",query = "Select x.numerovuelos, x.NumeroDeAvion, x.origen, x.destino FROM Vuelos x"),
    @NamedQuery(name = "findByNoVuelos", query = "Select x.numerovuelos FROM Vuelos x where x.numerovuelos=:numero_vuelo")
})


public class Vuelos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NumeroVuelos",length = 20,nullable = false)
    private String numerovuelos;
    
    @JoinColumn(name = "NumeroDeAvion",nullable = false,referencedColumnName = "NumeroDeAvion")
    @ManyToOne(optional = false)
    private Aviones NumeroDeAvion;          
    
    
    @JoinColumn(name = "Origen",nullable = false, referencedColumnName ="nombre")
    @ManyToOne(optional = false)
    private Cuidades origen;
    
    @JoinColumn(name = "Destino",nullable = false, referencedColumnName ="Destino")
    @ManyToOne(optional = false)
    private Cuidades destino;
    
   
    
    
    @Column(name = "Numerodepasajeros")
    private int numero_pasajeros;
    
    @Column(name = "FechaIniciodeVuelos")
    @Temporal(TemporalType.DATE)
    private Date Fecha_Inicio_Vuelos;
    
    @Column(name = "FechaFindeVuelos")
    @Temporal(TemporalType.DATE)
    private Date Fecha_Fin_Vuelos;
    
    @Column(name = "HoraIniciodeVuelos")
    @Temporal(TemporalType.TIME)
    private Date Hora_Inicio_Vuelos;
    
    @Column(name = "HoraFindeVuelos")
    @Temporal(TemporalType.TIME)
    private Date Hora_Fin_Vuelos;
    
    
    
    
    
    
    
    
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
        if (!(object instanceof Vuelos)) {
            return false;
        }
        Vuelos other = (Vuelos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Vuelos[ id=" + id + " ]";
    }

    /**
     * @return the numerovuelos
     */
    public String getNumerovuelos() {
        return numerovuelos;
    }

    /**
     * @param numerovuelos the numerovuelos to set
     */
    public void setNumerovuelos(String numerovuelos) {
        this.numerovuelos = numerovuelos;
    }

    /**
     * @return the numerodeavion
     */
   /* public String getNumerodeavion() {
        return numerodeavion;
    }

    /**
     * @param numerodeavion the numerodeavion to set
     */
    /*
    public void setNumerodeavion(String numerodeavion) {
        this.numerodeavion = numerodeavion;
    }

    /**
     * @return the origen
     */
    /*
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    /*
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the Destino
     *//*
    public String getDestino() {
        return Destino;
    }

    /**
     * @param Destino the Destino to set
     *//*
    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    /**
     * @return the numero_pasajeros
     */
    public int getNumero_pasajeros() {
        return numero_pasajeros;
    }

    /**
     * @param numero_pasajeros the numero_pasajeros to set
     */
    public void setNumero_pasajeros(int numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }

    /**
     * @return the Fecha_Inicio_Vuelos
     */
    public Date getFecha_Inicio_Vuelos() {
        return Fecha_Inicio_Vuelos;
    }

    /**
     * @param Fecha_Inicio_Vuelos the Fecha_Inicio_Vuelos to set
     */
    public void setFecha_Inicio_Vuelos(Date Fecha_Inicio_Vuelos) {
        this.Fecha_Inicio_Vuelos = Fecha_Inicio_Vuelos;
    }

    /**
     * @return the Fecha_Fin_Vuelos
     */
    public Date getFecha_Fin_Vuelos() {
        return Fecha_Fin_Vuelos;
    }

    /**
     * @param Fecha_Fin_Vuelos the Fecha_Fin_Vuelos to set
     */
    public void setFecha_Fin_Vuelos(Date Fecha_Fin_Vuelos) {
        this.Fecha_Fin_Vuelos = Fecha_Fin_Vuelos;
    }

    /**
     * @return the Hora_Inicio_Vuelos
     */
    public Date getHora_Inicio_Vuelos() {
        return Hora_Inicio_Vuelos;
    }

    /**
     * @param Hora_Inicio_Vuelos the Hora_Inicio_Vuelos to set
     */
    public void setHora_Inicio_Vuelos(Date Hora_Inicio_Vuelos) {
        this.Hora_Inicio_Vuelos = Hora_Inicio_Vuelos;
    }

    /**
     * @return the Hora_Fin_Vuelos
     */
    public Date getHora_Fin_Vuelos() {
        return Hora_Fin_Vuelos;
    }

    /**
     * @param Hora_Fin_Vuelos the Hora_Fin_Vuelos to set
     */
    public void setHora_Fin_Vuelos(Date Hora_Fin_Vuelos) {
        this.Hora_Fin_Vuelos = Hora_Fin_Vuelos;
    }

    /**
     * @return the NumeroDeAvion
     */
    public Aviones getNumeroDeAvion() {
        return NumeroDeAvion;
    }

    /**
     * @param NumeroDeAvion the NumeroDeAvion to set
     */
    public void setNumeroDeAvion(Aviones NumeroDeAvion) {
        this.NumeroDeAvion = NumeroDeAvion;
    }

    /**
     * @return the origen
     */
    public Cuidades getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(Cuidades origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public Cuidades getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Cuidades destino) {
        this.destino = destino;
    }
    
}
