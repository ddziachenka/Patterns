/**
 * Created by Dzmitry Dziachenka on 11/16/2018
 */
public class Project implements Copyable{
    private int id;
    private String projectName;
    private String sourceCode;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getStringname() {
        return projectName;
    }

    public void setStringname(String stringname) {
        this.projectName = stringname;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Project(int id, String stringname, String sourceCode) {
        this.id = id;
        this.projectName = stringname;
        this.sourceCode = sourceCode;
    }

    @Override
    public Object copy() {
        Project copy = new Project(id, projectName, sourceCode);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }
}
