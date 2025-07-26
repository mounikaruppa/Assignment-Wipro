package assignmentJava8;

import java.util.*;

public class Assignment9 {
    public static void main(String[] args) {
        // Step 1: Create a list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Step 2: Print squares using parallelStream
        numbers.parallelStream()
               .forEach(num -> {
                   int square = num * num;
                   System.out.println("Square of " + num + " is: " + square + 
                       " - Thread: " + Thread.currentThread().getName());
               });
    }
}

