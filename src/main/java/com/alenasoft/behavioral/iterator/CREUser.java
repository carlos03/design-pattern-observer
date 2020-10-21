package com.alenasoft.behavioral.iterator;

public class CREUser {
    private int id;
    private UserData userData;

    public CREUser(int id, UserData userData) {
        this.id = id;
        this.userData = userData;
    }

    public int getId() {
        return id;
    }

    public UserData getUserData() {
        return userData;
    }

    @Override
    public String toString() {
        return String.format("CREUser: id: %s, %s", this.id, this.userData.toString());
    }
}
