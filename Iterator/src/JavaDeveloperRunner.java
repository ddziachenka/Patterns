public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Dmitrij", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hsNext()) {
            System.out.print(iterator.next().toString()+" ");
        }
    }
}
