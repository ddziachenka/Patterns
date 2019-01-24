import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dzmitry Dziachenka on 11/16/2018
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode()");

        System.out.println(master);

        Project masterClone = (Project) master.copy(); //в клиентском коде нужно выполнять приведение типов - не очень хорошо
        System.out.println(masterClone);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.cloneProject();
        System.out.println(masterClone2);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Collections.reverse(list);
        System.out.println(list.get(0));

    }
}
