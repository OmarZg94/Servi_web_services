package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-28T09:12:39")
@StaticMetamodel(Administrador.class)
public class Administrador_ { 

    public static volatile SingularAttribute<Administrador, String> password;
    public static volatile SingularAttribute<Administrador, Date> lastSeen;
    public static volatile SingularAttribute<Administrador, String> lastIp;
    public static volatile SingularAttribute<Administrador, String> username;

}