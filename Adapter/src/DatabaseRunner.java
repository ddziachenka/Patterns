

/**
 * Created by Dzmitry Dziachenka on 11/23/2018
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase() ;

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
