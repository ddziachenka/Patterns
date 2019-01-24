package main.java;


/**
 * Created by Dzmitry Dziachenka on 12/3/2018
 */
public class ProjectRunner {
    public static void main(String[] args) {
      //  Project project = new RealProject("https://www.github/.........");

       Project project = new ProxyProject("https://www.github/.........");

        project.run();

    }
}
