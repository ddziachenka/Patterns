package com.company.website;

import com.company.Developer;

/**
 * Created by Dzmitry Dziachenka on 11/13/2018
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
