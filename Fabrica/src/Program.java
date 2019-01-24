/**
 * Created by Dzmitry Dziachenka on 11/15/2018
 */
public class Program {

    public static void main(String[] args) {

        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();



    }


    static DeveloperFactory createDeveloperBySpecialty(String specilty) {
        if (specilty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specilty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(specilty + " is unknown specilty");
        }
    }


}
