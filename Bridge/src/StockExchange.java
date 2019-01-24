/**
 * Created by Dzmitry Dziachenka on 11/25/2018
 */
public class StockExchange  extends Program{
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
