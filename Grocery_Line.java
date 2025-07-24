package assignment;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Grocery_Line {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        System.out.print("Enter number of customers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of customer " + i + ": ");
            String name = scanner.nextLine();

            if (name.length() % 2 == 0) {
                queue.addFirst(name); // even length -> front
            } else {
                queue.addLast(name);  // odd length -> end
            }
        }

        System.out.println("\nServing Order:");
        for (String customer : queue) {
            System.out.println(customer);
        }

        scanner.close();
    }
}
