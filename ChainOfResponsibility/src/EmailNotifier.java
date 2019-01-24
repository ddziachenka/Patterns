/**
 * Created by Dzmitry Dziachenka on 12/6/2018
 */

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: "+message);
    }
}
