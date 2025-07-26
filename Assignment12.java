package assignmentJava8;

import java.util.*;

public class Assignment12 {
    public static void main(String[] args) {
        // Step 1: List of character names
        List<String> names = Arrays.asList(
            "Sirius", "Albus", "Draco", "Luna", "Harry", "Ron", "Hermione"
        );

        // Step 2: Sort using method reference instead of lambda
        names.sort(String::compareTo);

        // Step 3: Print sorted names
        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}

