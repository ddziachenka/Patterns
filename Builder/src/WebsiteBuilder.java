/**
 * Created by Dzmitry Dziachenka on 11/23/2018
 *
 */

//сущность с помощью которой можем конструировать наш класс
    //затем делаем реализацию этого абстрактоного класса


public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    Website getWebsite() {
        return website;
    }











    }

