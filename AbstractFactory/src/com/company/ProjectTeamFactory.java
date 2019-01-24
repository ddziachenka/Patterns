package com.company;

import java.sql.PreparedStatement;

/**
 * Created by Dzmitry Dziachenka on 11/13/2018
 */
public interface ProjectTeamFactory {
    //здесь можем варьировать (например 2 разработчика и 3 тестера)
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
