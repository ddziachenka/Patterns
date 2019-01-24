/**
 * Created by Dzmitry Dziachenka on 11/15/2018
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
