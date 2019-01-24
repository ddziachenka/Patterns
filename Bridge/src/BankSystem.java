/**
 * Created by Dzmitry Dziachenka on 11/25/2018
 */
public class BankSystem extends Program{

    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();

    }
}
