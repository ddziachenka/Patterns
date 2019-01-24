/**
 * Created by Dzmitry Dziachenka on 12/3/2018
 */

public class SprintRunner {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();

        workflow.solveProblems();


        /*

        Очень громоздко в классе клиенте

         Job job = new Job();
        job.doJob();

        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();

        Developer developer = new Developer();
        developer.doJobBeforeDeadline(bugTracker);

        bugTracker.finishSprint();
        developer.doJobBeforeDeadline(bugTracker);
         */
    }
}
