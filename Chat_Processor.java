package assignment;

import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;

public class Chat_Processor {

    // Shared queue with max capacity of 5
    static LinkedBlockingQueue<String> messageQueue = new LinkedBlockingQueue<>(5);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Producer Thread - adds messages
        Thread sender = new Thread(() -> {
            try {
                while (true) {
                    System.out.print("Type your message: ");
                    String message = scanner.nextLine();
                    messageQueue.put(message); // blocks if queue is full
                    System.out.println("[Sent]");
                }
            } catch (InterruptedException e) {
                System.out.println("Sender interrupted.");
            }
        });

        // Consumer Thread - reads messages
        Thread receiver = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(2000); // Simulates delay in reading
                    String received = messageQueue.take(); // blocks if queue is empty
                    System.out.println("📨 Received: " + received);
                }
            } catch (InterruptedException e) {
                System.out.println("Receiver interrupted.");
            }
        });

        // Start both threads
        sender.start();
        receiver.start();
    }
}

