package com.george.quickradiusdb.data;

import com.george.quickradiusdb.data.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-04T01:23:33")
@StaticMetamodel(Billing.class)
public class Billing_ { 

    public static volatile SingularAttribute<Billing, Integer> billID;
    public static volatile SingularAttribute<Billing, Double> vat;
    public static volatile SingularAttribute<Billing, String> contactPerson;
    public static volatile SingularAttribute<Billing, String> company;
    public static volatile SingularAttribute<Billing, String> tel;
    public static volatile SingularAttribute<Billing, String> userName;
    public static volatile SingularAttribute<Billing, String> plan;
    public static volatile SingularAttribute<Billing, User> userID;
    public static volatile SingularAttribute<Billing, String> email;

}