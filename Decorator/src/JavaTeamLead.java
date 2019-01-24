/**
 * Created by Dzmitry Dziachenka on 12/3/2018
 */
public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+ sendWeekReport();
    }
}
