package com.company.banking;

import com.company.Developer;
import com.company.ProjectManager;
import com.company.ProjectTeamFactory;
import com.company.Tester;


/**
 * Created by Dzmitry Dziachenka on 11/13/2018
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }


}
