/**
 * Created by Dzmitry Dziachenka on 11/23/2018
 */
public class BuildWebsiteRunner {

    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());  //можем поменять на другой сайт
        Website website = director.buildWebsite();

        System.out.println(website);

    }
}
