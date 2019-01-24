/**
 * Created by Dzmitry Dziachenka on 11/23/2018
 */

//уменьшаем кол-во работы в классе клиенте
    //определяет какой именно сайт будем создавать

public class Director {
    private WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        Website website = builder.getWebsite();

        return website;

    }
}
