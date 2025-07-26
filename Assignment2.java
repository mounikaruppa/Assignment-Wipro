package assignmentJava8;

import java.util.Optional;

public class Assignment2 {
    
    // Method that returns Optional result
    public static Optional<Integer> divide(int a, int b) {
        if (b == 0) {
            return Optional.empty(); // return empty if divisor is 0
        } else {
            return Optional.of(a / b); // return result
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0; // Change this to a non-zero to see actual result

        Optional<Integer> result = divide(num1, num2);

        if (result.isPresent()) {
            System.out.println("Result: " + result.get());
        } else {
            System.out.println("Not Allowed");
        }
    }
}
