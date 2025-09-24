import java.util.*;

public class ToDoListApp {
    private Set<String> tasks;

    public ToDoListApp() {
        tasks = new TreeSet<>(); // Automatically keeps tasks sorted alphabetically
    }

    // Add a task
    public void addTask(String task) {
        if (tasks.add(task)) {
            System.out.println("Task added: " + task);
        } else {
            System.out.println("Task already exists: " + task);
        }
    }

    // Remove a task
    public void removeTask(String task) {
        if (tasks.remove(task)) {
            System.out.println("Task removed: " + task);
        } else {
            System.out.println("Task not found: " + task);
        }
    }

    // Display all tasks sorted alphabetically
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("To-Do List:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    // Example usage
    public static void main(String[] args) {
        ToDoListApp todo = new ToDoListApp();

        todo.addTask("Write report");
        todo.addTask("Buy groceries");
        todo.addTask("Call Alice");
        todo.addTask("Buy groceries"); // Duplicate

        todo.displayTasks();

        todo.removeTask("Call Alice");
        todo.removeTask("Go jogging"); // Non-existent

        todo.displayTasks();
    }
}


