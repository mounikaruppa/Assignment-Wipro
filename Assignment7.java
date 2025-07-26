package assignmentJava8;

import java.util.*;
import java.util.stream.*;

public class Assignment7 {
    public static void main(String[] args) {
        // Step 1: Create a list of numbers
        List<Integer> numbers = Arrays.asList(5, 12, 3, 8, 7, 10, 21, 4, 16);

        // Step 2: Filter and collect even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());

        // Step 3: Print the even numbers
        System.out.println("Even numbers:");
        evenNumbers.forEach(System.out::println);
    }
}

