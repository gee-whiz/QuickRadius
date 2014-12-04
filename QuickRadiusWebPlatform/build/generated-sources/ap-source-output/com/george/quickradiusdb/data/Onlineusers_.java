package com.george.quickradiusdb.data;

import com.george.quickradiusdb.data.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2014-12-04T01:23:33")
@StaticMetamodel(Onlineusers.class)
public class Onlineusers_ { 

    public static volatile SingularAttribute<Onlineusers, Double> hotSpot;
    public static volatile SingularAttribute<Onlineusers, Integer> onlineUserID;
    public static volatile SingularAttribute<Onlineusers, String> totalTime;
    public static volatile SingularAttribute<Onlineusers, String> name;
    public static volatile SingularAttribute<Onlineusers, Double> ipAddress;
    public static volatile SingularAttribute<Onlineusers, String> startTime;
    public static volatile SingularAttribute<Onlineusers, String> userName;
    public static volatile SingularAttribute<Onlineusers, User> userID;
    public static volatile SingularAttribute<Onlineusers, Double> totalTraffic;

}