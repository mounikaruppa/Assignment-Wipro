package assignmentJava8;
import java.util.*;
import java.util.stream.*;

public class Assignment5 {
    public static void main(String[] args) {
        // Step 1: List of Harry Potter character names
        List<String> names = Arrays.asList(
            "Albus", "Severus", "Sirius", "Harry", "Ron", "Hermoine",
            "Longbottom", "Luna", "Lily", "James", "Minerva",
            "Umbridge", "Ginny", "Voldemort"
        );

        // Step 2: Filter names that start with A, S, or H
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A") || name.startsWith("S") || name.startsWith("H"))
            .collect(Collectors.toList());

        // Step 3: Print filtered names
        System.out.println("Names starting with A, S, or H:");
        filteredNames.forEach(System.out::println);
    }
}
