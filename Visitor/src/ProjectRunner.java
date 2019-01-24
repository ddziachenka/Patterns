import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in Action");
        project.beWritten(junior);

        System.out.println("\n===========\n");

        System.out.println("Senior in Action");
        project.beWritten(senior);

        List<Integer> list = new ArrayList <>();
        list.add(4);
        list.add(3);
        list.add(5);




        System.out.println(list.parallelStream().count());
        System.out.println(list.stream().parallel().count());


    }
}
