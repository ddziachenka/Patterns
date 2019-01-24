package main.java;

/**
 * Created by Dzmitry Dziachenka on 12/3/2018
 */
public class ProxyProject implements Project {
    private String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realProject == null) {
            realProject=new RealProject(url);
        }
        realProject.run();
    }
}
