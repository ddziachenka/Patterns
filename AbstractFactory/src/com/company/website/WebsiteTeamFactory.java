package com.company.website;

import com.company.Developer;
import com.company.ProjectManager;
import com.company.ProjectTeamFactory;
import com.company.Tester;

/**
 * Created by Dzmitry Dziachenka on 11/13/2018
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
