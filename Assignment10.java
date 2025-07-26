package assignmentJava8;

import java.util.*;
import java.util.stream.Collectors;

public class Assignment10 {
    public static void main(String[] args) {
        // Step 1: List with duplicate names
        List<String> names = Arrays.asList(
            "Harry", "Hermione", "Ron", "Harry", "Draco", "Ron", "Harry", 
            "Luna", "Neville", "Hermione", "Ron"
        );

        // Step 2: Create a frequency map using groupingBy + counting
        Map<String, Long> nameCountMap = names.stream()
            .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        // Step 3: Print the map
        System.out.println("Name frequency map:");
        nameCountMap.forEach((name, count) -> 
            System.out.println(name + ": " + count));
    }
}

