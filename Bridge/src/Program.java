/**
 * Created by Dzmitry Dziachenka on 11/25/2018
 */
public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
