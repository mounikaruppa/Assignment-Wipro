package assignment;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

class Job {
    String name;
    int urgency;

    Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }
}

public class Smart_Job_Picker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Custom Comparator: lower urgency → higher priority; if same, shorter name wins
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(new Comparator<Job>() {
            public int compare(Job j1, Job j2) {
                if (j1.urgency != j2.urgency) {
                    return Integer.compare(j1.urgency, j2.urgency); // lower urgency first
                } else {
                    return Integer.compare(j1.name.length(), j2.name.length()); // shorter name first
                }
            }
        });

        System.out.print("How many jobs do you want to enter? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter job name " + i + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter urgency (1 to 5): ");
            int urgency = scanner.nextInt();
            scanner.nextLine(); // consume newline

            jobQueue.add(new Job(name, urgency));
        }

        System.out.println("\nJob processing order (most urgent first):");
        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();
            System.out.println(job.name + " (Urgency: " + job.urgency + ")");
        }

        scanner.close();
    }
}
