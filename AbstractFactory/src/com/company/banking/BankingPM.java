package com.company.banking;

import com.company.ProjectManager;

/**
 * Created by Dzmitry Dziachenka on 11/13/2018
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
