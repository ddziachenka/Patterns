/**
 * Created by Dzmitry Dziachenka on 11/23/2018
 */
public class EnterPriceWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprice web site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);

    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
