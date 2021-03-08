
import java.util.Scanner;

public class Main {
    private static class App {
        private final Scanner scanner = new Scanner(System.in);

        private final TaskRepository taskRepository = new TaskRepository();
        private final ProjectRepository projectRepository = new ProjectRepository();

        private boolean shouldContinue = true;

        public boolean shouldContinue() {
            return shouldContinue;
        }

        public void run() {
            System.out.println("1. Create new task");
            System.out.println("2. Remove task");
            System.out.println("3. Create new project");
            System.out.println("4. Remove project");
            System.out.println("5. Display all tasks");
            System.out.println("6. Display all projects");
            System.out.println("7. Display change log");
            System.out.println("0. Exit application");


            System.out.println("Choose a option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    createNewTask();
                    break;
                case 2:
                    selectAndRemoveTask();
                    break;
                case 3:
                    createNewProject();
                    break;
                case 4:
                    selectAndRemoveProject();
                    break;
                case 5:
                    displayAllTasks();
                    break;
                case 6:
                    displayAllProjects();
                    break;
                case 7:
                    showChangelog();
                    break;
                case 0:
                    shouldContinue = false;
                    break;
                default:
                    noOptionChosen();
                    break;
            }
        }

        private void noOptionChosen() {
            System.out.println("No option");
        }

        private void showChangelog() {
            // TODO
        }

        private void displayAllTasks() {
            taskRepository.fetchAllTasks().forEach(System.out::println);
        }

        private void displayAllProjects() {
            projectRepository.fetchAllTasks().forEach(System.out::println);
        }

        private void selectAndRemoveProject() {
            System.out.println("Write an index of project which u want to delete");
            projectRepository.removeAt(scanner.nextInt());
        }

        private void createNewProject() {
            System.out.println("Write a name of project to add");
            projectRepository.add(new Project(scanner.next()));
        }

        private void selectAndRemoveTask() {
            System.out.println("Write an index of quest which u want to delete");
            taskRepository.removeAt(scanner.nextInt());
        }

        private void createNewTask() {
            System.out.println("Write a name of quest to add");
            taskRepository.add(new Task(scanner.next()));
        }
    }

    public static void main(String[] args) {
        App app = new App();

        while (app.shouldContinue()) {
            app.run();
        }
    }

}


