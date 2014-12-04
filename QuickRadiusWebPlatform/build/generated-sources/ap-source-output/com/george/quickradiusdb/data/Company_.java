package com.george.quickradiusdb.data;

import com.george.quickradiusdb.data.Operators;
import com.george.quickradiusdb.data.Planinformation;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-04T01:23:33")
@StaticMetamodel(Company.class)
public class Company_ { 

    public static volatile SingularAttribute<Company, Integer> companyID;
    public static volatile SingularAttribute<Company, String> address;
    public static volatile ListAttribute<Company, Planinformation> planinformationList;
    public static volatile SingularAttribute<Company, String> companyName;
    public static volatile SingularAttribute<Company, Double> latitude;
    public static volatile SingularAttribute<Company, String> tel;
    public static volatile SingularAttribute<Company, Double> longitude;
    public static volatile ListAttribute<Company, Operators> operatorsList;

}