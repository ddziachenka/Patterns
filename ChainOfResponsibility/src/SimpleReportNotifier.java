/**
 * Created by Dzmitry Dziachenka on 12/6/2018
 */

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: "+message);
    }
}
