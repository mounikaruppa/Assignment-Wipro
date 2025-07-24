package assignment;

public class Average_confusion {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 8, 15, 3};  // sample input
        int sum = 0;

        // Process each number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 10) {
                numbers[i] = numbers[i] * 2;  // Double if less than 10
            }
            sum += numbers[i];  // Add to sum
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Print result
        System.out.println("Average: " + average);
    }
}
