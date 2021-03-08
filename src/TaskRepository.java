import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private final List<Task> tasks = new ArrayList<>();

    public void add(Task task) {
        tasks.add(task);
    }

    public void removeAt(int index) {
        try {
            tasks.remove(index);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("No task to remove");
        }
    }

    public List<Task> fetchAllTasks() {
        return new ArrayList<>(tasks);
    }
}
