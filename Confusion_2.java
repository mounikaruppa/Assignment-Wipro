package assignment;

import java.util.Scanner;

public class Confusion_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 10) {
                numbers[i] = numbers[i] * 2;  // Double the number if less than 10
            }
            sum += numbers[i];  // Add to sum
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Output result
        System.out.println("Average after processing: " + average);

        scanner.close();
    }
}