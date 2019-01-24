import java.util.Date;

/**
 * Created by Dzmitry Dziachenka on 12/10/2018
 */

public class Save {
    private final String version;
    private final Date date;

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }

    public Save(String version) {
        this.version = version;
        this.date=new Date();


    }
}
