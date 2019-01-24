/**
 * Created by Dzmitry Dziachenka on 12/3/2018
 */

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Hubrhubr...");
        }
    }
}
