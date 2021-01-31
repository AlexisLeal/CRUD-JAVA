package Entity;

import Entity.Aviones;
import Entity.Cuidades;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-05T12:51:49")
@StaticMetamodel(Vuelos.class)
public class Vuelos_ { 

    public static volatile SingularAttribute<Vuelos, String> numerovuelos;
    public static volatile SingularAttribute<Vuelos, Date> Hora_Inicio_Vuelos;
    public static volatile SingularAttribute<Vuelos, Date> Fecha_Inicio_Vuelos;
    public static volatile SingularAttribute<Vuelos, Aviones> NumeroDeAvion;
    public static volatile SingularAttribute<Vuelos, Date> Hora_Fin_Vuelos;
    public static volatile SingularAttribute<Vuelos, Date> Fecha_Fin_Vuelos;
    public static volatile SingularAttribute<Vuelos, Long> id;
    public static volatile SingularAttribute<Vuelos, Cuidades> origen;
    public static volatile SingularAttribute<Vuelos, Cuidades> destino;
    public static volatile SingularAttribute<Vuelos, Integer> numero_pasajeros;

}