package assignment;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

class Task {
    int id;
    String name;

    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Task ID: " + id + ", Name: " + name;
    }
}

public class Blocking_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        System.out.print("How many tasks do you want to enter? ");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        // Input from user
        for (int i = 1; i <= numTasks; i++) {
            System.out.println("Enter task ID (number): ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.println("Enter task name: ");
            String name = scanner.nextLine();

            Task task = new Task(id, name);
            stage1.add(task);
        }

        // Process Stage 1 and move even-ID tasks to Stage 2
        while (!stage1.isEmpty()) {
            Task task = stage1.poll();
            System.out.println("Stage 1 processing: " + task);
            if (task.id % 2 == 0) {
                stage2.add(task);
            }
        }

        // Show Stage 2 tasks
        System.out.println("\nStage 2 Tasks (Even ID only):");
        for (Task task : stage2) {
            System.out.println("Stage 2: " + task);
        }

        scanner.close();
    }
}
