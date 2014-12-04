package com.george.quickradiusdb.data;

import com.george.quickradiusdb.data.Billing;
import com.george.quickradiusdb.data.Lastconnectionattempt;
import com.george.quickradiusdb.data.Onlineusers;
import com.george.quickradiusdb.data.Operators;
import com.george.quickradiusdb.data.Planinformation;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-04T01:23:33")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile ListAttribute<User, Onlineusers> onlineusersList;
    public static volatile ListAttribute<User, Billing> billingList;
    public static volatile SingularAttribute<User, Double> latitude;
    public static volatile SingularAttribute<User, String> groups;
    public static volatile SingularAttribute<User, Planinformation> planInformationID;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, Integer> userID;
    public static volatile ListAttribute<User, Lastconnectionattempt> lastconnectionattemptList;
    public static volatile SingularAttribute<User, Operators> operatorID;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, Double> longitude;

}