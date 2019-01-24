package com.company;

/**
 * Created by Dzmitry Dziachenka on 11/13/2018
 */
public class Singleton {
    private static Singleton ourInstance;

    private static int id;

    public void upId() {
        id++;
    }

    public static Singleton getInstance() {
        if (ourInstance == null) {
            ourInstance = new Singleton();
        }
        return ourInstance;
    }

    public String getId() {
        return String.valueOf(id);
    }

    private Singleton() {
    }


}
