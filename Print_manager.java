package assignment;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Print_manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maximum 3 print jobs allowed
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        System.out.println("Add up to 5 print jobs (Only 3 will be accepted):");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter print job " + i + ": ");
            String job = scanner.nextLine();

            // Offer will not add if queue is full
            if (!printQueue.offer(job)) {
                System.out.println("Queue full! Job skipped: " + job);
            }
        }

        System.out.println("\nProcessing print jobs...");

        while (!printQueue.isEmpty()) {
            String job = printQueue.poll(); // take one job
            System.out.println("Printing: " + job);
        }

        scanner.close();
    }
}
