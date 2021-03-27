
import java.util.Scanner;

public class Main {
    static String[] tasks = new String[100];
    static String[] projects = new String[100];
    static String[] changeLog = new String[100];
    static int tasksCount = 0;
    static int projectsCount = 0;
    static int changeLogCount = 0;

    public static void displayMenu() {
        System.out.println("1. Create new task");
        System.out.println("2. Remove task");
        System.out.println("3. Create new project");
        System.out.println("4. Remove project");
        System.out.println("5. Display all tasks");
        System.out.println("6. Display all projects");
        System.out.println("7. Display change log");
        System.out.println("0. Exit application");
    }

    public static void addTask(String task) {
        boolean hasCapacityForNewTask = tasksCount < tasks.length ;
        if (hasCapacityForNewTask) {
            tasks[tasksCount] = task;
            tasksCount++;
        }
    }

    public static void removeTask(int indexTask) {
        boolean isTaskExist = indexTask < tasksCount;
        if (isTaskExist) {
            for (int i = indexTask; i < tasksCount - 1; i++) {
                tasks[i] = tasks[i + 1];
                tasksCount--;
            }
        }
    }

    public static void addProject(String project){
        boolean hasCapacityForNewProject= projectsCount < projects.length;
        if (hasCapacityForNewProject){
            projects[projectsCount]= project;
            projectsCount++;
        }
    }
    public static void deleteProject(int indexProject){
        boolean isProjectExist = indexProject < projectsCount;
        if (isProjectExist){
            for (int i =indexProject; i <projectsCount; i++){
                projects[i] =projects[i +1];
                projectsCount--;
            }
        }
    }

    public static void displayTasks() {
        System.out.println("List of tasks: ");
        for (int i = 0; i < tasksCount; i++) {
            System.out.println(tasks[i]);
        }
    }
    public static void displayProjects(){
        System.out.println("List of projects: ");
        for (int i=0; i< projectsCount; i++){
            System.out.println(projects[i]);
        }
    }
    //TODO do a change log module
    public static void showChangeLog(){
        System.out.println("Change log: ");
        for (int i=0; i< changeLogCount; i++){
            System.out.println(changeLog[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true) {
            displayMenu();
            System.out.println("Choose a option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Write a name of quest to add");
                    String task = scanner.next();
                    addTask(task);
                    break;
                case 2:
                    System.out.println("Write an index of quest which u want to delete");
                    int indexTask = scanner.nextInt();
                    removeTask(indexTask);
                    break;
                case 3:
                    System.out.println("Write a name of project to add");
                    String project = scanner.next();
                    addProject(project);
                    break;
                case 4:
                    System.out.println("Write an idnex of project which u want to delete");
                    int indexProject = scanner.nextInt();
                    deleteProject(indexProject);
                    break;
                case 5:
                    displayTasks();
                    break;
                case 6:
                    displayProjects();
                case 7:
                    showChangeLog();
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("No option");
                    break;
            }


        }
    }

}


