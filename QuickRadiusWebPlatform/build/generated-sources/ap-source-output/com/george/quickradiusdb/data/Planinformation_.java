package com.george.quickradiusdb.data;

import com.george.quickradiusdb.data.Company;
import com.george.quickradiusdb.data.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-04T01:23:33")
@StaticMetamodel(Planinformation.class)
public class Planinformation_ { 

    public static volatile SingularAttribute<Planinformation, Company> companyID;
    public static volatile ListAttribute<Planinformation, User> userList;
    public static volatile SingularAttribute<Planinformation, Double> allowedByPlan;
    public static volatile SingularAttribute<Planinformation, Integer> planInformationID;
    public static volatile SingularAttribute<Planinformation, Double> used;
    public static volatile SingularAttribute<Planinformation, String> userName;
    public static volatile SingularAttribute<Planinformation, String> plan;
    public static volatile SingularAttribute<Planinformation, Double> remaining;

}