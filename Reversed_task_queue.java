package assignment;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;

public class Reversed_task_queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> taskList = new LinkedList<>();

        System.out.println("Enter 4 tasks (add ! at end if urgent):");

        for (int i = 0; i < 4; i++) {
            String task = scanner.nextLine();
            if (task.endsWith("!")) {
                taskList.addFirst(task);  // Urgent task goes to front
            } else {
                taskList.addLast(task);   // Normal task goes to end
            }
        }

        // Print tasks in reverse order
        System.out.println("\nTasks in reverse order:");
        Iterator<String> reverseIt = taskList.descendingIterator();
        while (reverseIt.hasNext()) {
            System.out.println(reverseIt.next());
        }

        scanner.close();
    }
}