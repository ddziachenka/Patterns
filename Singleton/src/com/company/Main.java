package com.company;

public class Main {

    public static void main(String[] args) {

        Singleton.getInstance().upId();
        Singleton.getInstance().upId();

        System.out.println(Singleton.getInstance().getId());

    }



}
