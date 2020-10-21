package com.alenasoft.behavioral.iterator;

import java.util.HashMap;
import java.util.Map;

public class CREApi {

    public static Map<Integer, UserData> getCREinfo() {

        CREUser user1= new CREUser(1,new UserData("Julico","barrio los mangales",3500));
        CREUser user2=new CREUser(2,new UserData("Luciana","barrio las peras",5500));
        CREUser user3=new CREUser(3,new UserData("Lorena","Mutualista",1000));
        CREUser user4=new CREUser(4,new UserData("Arminda","Magisterio",8600));

        Map<Integer,UserData> creUsers=new HashMap<>();
        creUsers.put(1,new UserData("Julico","barrio los mangales",3500));
        creUsers.put(2,new UserData("Luciana","barrio las peras",5500));
        creUsers.put(3,new UserData("Lorena","Mutualista",1000));
        creUsers.put(4,new UserData("Arminda","Magisterio",8600));
        return creUsers;
    }
}
