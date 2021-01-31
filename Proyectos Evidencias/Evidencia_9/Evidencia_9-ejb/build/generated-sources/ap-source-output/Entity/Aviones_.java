package Entity;

import Entity.Vuelos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-05T12:51:49")
@StaticMetamodel(Aviones.class)
public class Aviones_ { 

    public static volatile ListAttribute<Aviones, Vuelos> Lista;
    public static volatile SingularAttribute<Aviones, String> numeroavion;
    public static volatile SingularAttribute<Aviones, Long> id;
    public static volatile SingularAttribute<Aviones, String> aerolínea;
    public static volatile SingularAttribute<Aviones, Integer> capacidad_pasajeros;
    public static volatile SingularAttribute<Aviones, String> modelo;

}