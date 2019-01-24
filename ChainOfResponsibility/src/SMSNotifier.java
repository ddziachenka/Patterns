/**
 * Created by Dzmitry Dziachenka on 12/6/2018
 */

public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager " + message);
    }
}
