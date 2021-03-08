import java.util.ArrayList;
import java.util.List;

public class ProjectRepository {

    private final List<Project> projects = new ArrayList<>();

    public void add(Project task) {
        projects.add(task);
    }

    public void removeAt(int index) {
        try {
            projects.remove(index);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("No project to remove");
        }
    }

    public List<Project> fetchAllTasks() {
        return new ArrayList<>(projects);
    }
}
