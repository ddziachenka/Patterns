package com.company.website;

import com.company.ProjectManager;

/**
 * Created by Dzmitry Dziachenka on 11/13/2018
 */
public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("WebSite PM manages Website project...");
    }
}
