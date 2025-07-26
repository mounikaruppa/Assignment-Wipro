package assignmentJava8;
/*
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment11 {
    public static void main(String[] args) {
        // Step 1: List of names
        List<String> names = Arrays.asList(
            "Albus", "Severus", "Sirius", "Ariana", "Amanda", "Minerva",
            "Draco", "Luna", "Angela", "Harry", "Anusha", "Alexa"
        );

        // Step 2: Create two predicates
        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        // Step 3: Combine predicates using .and() or .or()
        Predicate<String> combinedPredicate = startsWithA.and(endsWithA);
        // You can also try: startsWithA.or(endsWithA);

        // Step 4: Filter names using the combined predicate
        List<String> filteredNames = names.stream()
                                          .filter(combinedPredicate)
                                          .collect(Collectors.toList());

        // Step 5: Print filtered names
        System.out.println("Names that start with 'A' AND end with 'a':");
        filteredNames.forEach(System.out::println);
    }
}
*/

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment11 {
    public static void main(String[] args) {
        // Step 1: List of names
        List<String> names = Arrays.asList(
            "Albus", "Severus", "Sirius", "Ariana", "Amanda", "Minerva",
            "Draco", "Luna", "Angela", "Harry", "Anusha", "Asha"
        );

        // Step 2: Define two predicates
        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        // Step 3A: Filter names that start with A AND end with a
        List<String> andFiltered = names.stream()
            .filter(startsWithA.and(endsWithA))
            .collect(Collectors.toList());

        System.out.println("Names that start with 'A' AND end with 'a':");
        andFiltered.forEach(System.out::println);

        System.out.println("\n-------------------------\n");

        // Step 3B: Filter names that start with A OR end with a
        List<String> orFiltered = names.stream()
            .filter(startsWithA.or(endsWithA))
            .collect(Collectors.toList());

        System.out.println("Names that start with 'A' OR end with 'a':");
        orFiltered.forEach(System.out::println);
    }
}


