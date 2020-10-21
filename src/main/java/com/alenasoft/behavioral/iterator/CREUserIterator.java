package com.alenasoft.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CREUserIterator implements Iterator{
    private int position;
//    private Map<Integer, UserData> usersData;
    private List<CREUser> usersData;
    public CREUserIterator() {
        this.position = 1;
        this.usersData = parseUserData(CREApi.getCREinfo());
    }

    @Override
    public boolean isDone() {
        return this.position>=this.usersData.size();
    }

    private List<CREUser> parseUserData(Map<Integer, UserData> userData){
        List<CREUser> users= new ArrayList<>();
        java.util.Iterator it = userData.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            users.add(new CREUser(key,userData.get(key)));
        }
        return users;
    }

    @Override
    public String currentItem() {
//        java.util.Iterator it = this.usersData.keySet().iterator();
//        it.hasNext();
//        UserData user = this.usersData.get(it.next());
//        System.out.println(user.toString());
        return usersData.get(position++).toString();
    }
}
