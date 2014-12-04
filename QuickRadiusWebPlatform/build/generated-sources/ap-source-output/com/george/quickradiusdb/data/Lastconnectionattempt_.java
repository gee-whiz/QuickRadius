package com.george.quickradiusdb.data;

import com.george.quickradiusdb.data.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-04T01:23:33")
@StaticMetamodel(Lastconnectionattempt.class)
public class Lastconnectionattempt_ { 

    public static volatile SingularAttribute<Lastconnectionattempt, String> password;
    public static volatile SingularAttribute<Lastconnectionattempt, String> radiusReply;
    public static volatile SingularAttribute<Lastconnectionattempt, String> startTime;
    public static volatile SingularAttribute<Lastconnectionattempt, String> userName;
    public static volatile SingularAttribute<Lastconnectionattempt, User> userID;
    public static volatile SingularAttribute<Lastconnectionattempt, Integer> lastConnectionAttemptID;

}