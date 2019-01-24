/**
 * Created by Dzmitry Dziachenka on 11/16/2018
 */
public class ProjectFactory {
    Project project;

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }



    Project cloneProject() {
        return (Project)project.copy();
    }
}
