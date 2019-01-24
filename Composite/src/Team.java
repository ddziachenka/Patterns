import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dzmitry Dziachenka on 11/28/2018
 */
public class Team {
    private List<Developer> developers = new ArrayList <>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("Team creates project....\n");
        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
