import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dzmitry Dziachenka on 12/6/2018
 */

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap <>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty){
                case "Java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "C++" :
                    System.out.println("Hiring C++ developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty,developer);
        }
        return developer;
    }
}
