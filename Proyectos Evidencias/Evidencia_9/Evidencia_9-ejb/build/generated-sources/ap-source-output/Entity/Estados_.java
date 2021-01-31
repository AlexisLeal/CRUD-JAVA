package Entity;

import Entity.Cuidades;
import Entity.Paises;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-05T12:51:49")
@StaticMetamodel(Estados.class)
public class Estados_ { 

    public static volatile ListAttribute<Estados, Cuidades> prueba;
    public static volatile SingularAttribute<Estados, Long> id;
    public static volatile SingularAttribute<Estados, String> nombre;
    public static volatile SingularAttribute<Estados, Paises> pais;

}