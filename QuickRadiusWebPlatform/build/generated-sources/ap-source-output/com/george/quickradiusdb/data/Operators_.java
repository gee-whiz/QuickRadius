package com.george.quickradiusdb.data;

import com.george.quickradiusdb.data.Company;
import com.george.quickradiusdb.data.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-04T01:23:33")
@StaticMetamodel(Operators.class)
public class Operators_ { 

    public static volatile SingularAttribute<Operators, String> lastName;
    public static volatile SingularAttribute<Operators, String> password;
    public static volatile SingularAttribute<Operators, Company> companyID;
    public static volatile ListAttribute<Operators, User> userList;
    public static volatile SingularAttribute<Operators, String> name;
    public static volatile SingularAttribute<Operators, String> tel;
    public static volatile SingularAttribute<Operators, String> userName;
    public static volatile SingularAttribute<Operators, Integer> operatorID;
    public static volatile SingularAttribute<Operators, String> email;

}