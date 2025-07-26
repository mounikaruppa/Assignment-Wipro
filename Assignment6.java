package assignmentJava8;

import java.util.*;
import java.util.stream.*;

public class Assignment6 {
    public static void main(String[] args) {
        // Step 1: List of Harry Potter character names
        List<String> names = Arrays.asList(
            "Albus", "Severus", "Sirius", "Harry", "Ron", "Hermoine",
            "Longbottom", "Luna", "Lily", "James", "Minerva",
            "Umbridge", "Ginny", "Voldemort"
        );

        // Step 2: Count names longer than 5 characters
        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();

        // Step 3: Print the count
        System.out.println("Number of names longer than 5 characters: " + count);
    }
}


