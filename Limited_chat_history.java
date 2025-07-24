package assignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Limited_chat_history {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> chatHistory = new ArrayDeque<>();

        System.out.println("Enter your chat messages (type 'exit' to stop):");

        while (true) {
            System.out.print("Message: ");
            String message = scanner.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                break;
            }

            if (chatHistory.size() == 4) {
                chatHistory.removeFirst(); // remove oldest message
            }

            chatHistory.addLast(message); // add new message
        }

        System.out.println("\nLast 4 messages in chat:");
        for (String msg : chatHistory) {
            System.out.println(msg);
        }

        scanner.close();
    }
}
