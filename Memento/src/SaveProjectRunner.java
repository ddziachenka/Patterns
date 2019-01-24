/**
 * Created by Dzmitry Dziachenka on 12/10/2018
 */

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {


        Project project = new Project();
        GithubRepo github = new GithubRepo();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to github...");

        github.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing poor code...");
        Thread.sleep(3000);

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong");

        //теперь нужно откатиться к предыдущей версии

        System.out.println("Rolling back to Version 1.0");
        project.load(github.getSave());

        System.out.println("Project after rollback");

        System.out.println(project);


/*
Save  save;


        System.out.println("======");
        Project project1 = new Project();
        project1.setVersionAndDate("11111");
        save = project1.save();
        System.out.println(project1);
        Thread.sleep(2000);
        project1.setVersionAndDate("222222");
        System.out.println(project1);
        Thread.sleep(2000);
        project1.load(save);
        System.out.println(project1);
*/

    }
}
