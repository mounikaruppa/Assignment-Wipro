package assignmentJava8;

import java.util.*;

public class Assignment1 {
    public static void main(String[] args) {
        // Step 1: Create a list of names
        List<String> names = Arrays.asList(
            "Sirius Black",
            "Severus Snape",
            "Albus Dumbledore",
            "Rubeus Hagrid",
            "Dolores Umbridge"
        );

        // Step 2: Sort using Comparator with Lambda
        names.sort(Comparator.comparing(name -> name));

        // Step 3: Print sorted names
        System.out.println("Sorted Names:");
        names.forEach(System.out::println);
    }
}

