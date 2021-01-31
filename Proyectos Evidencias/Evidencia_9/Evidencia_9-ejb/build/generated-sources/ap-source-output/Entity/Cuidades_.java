package Entity;

import Entity.Estados;
import Entity.Vuelos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-05T12:51:49")
@StaticMetamodel(Cuidades.class)
public class Cuidades_ { 

    public static volatile ListAttribute<Cuidades, Vuelos> lista;
    public static volatile SingularAttribute<Cuidades, Estados> estado;
    public static volatile ListAttribute<Cuidades, Vuelos> lista2;
    public static volatile SingularAttribute<Cuidades, Long> id;
    public static volatile SingularAttribute<Cuidades, String> destino;
    public static volatile SingularAttribute<Cuidades, String> nombre;

}