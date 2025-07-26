package assignmentJava8;

import java.util.*;
import java.util.stream.Collectors;

public class Assignment8 {
    public static void main(String[] args) {
        // Step 1: List of custom city names
        List<String> citiesOfEnglandTestSeries = Arrays.asList( 
            "England", "London", "Manchester", "Leeds", "Birmingham" 
        );

        // Step 2: Join the cities into a comma-separated string
        String result = citiesOfEnglandTestSeries.stream() 
                              .collect(Collectors.joining(", "));

        // Step 3: Print the result
        System.out.println("citiesOfEnglandTestSeries: " + result);
    }
}

