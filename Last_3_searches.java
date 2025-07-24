package assignment;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Last_3_searches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> searchHistory = new ArrayDeque<>();
        
        System.out.println("Enter your search terms (type 'exit' to stop):");

        while (true) {
            System.out.print("Search: ");
            String search = scanner.nextLine();

            if (search.equalsIgnoreCase("exit")) {
                break;
            }

            if (searchHistory.size() == 3) {
                searchHistory.removeFirst();  // remove oldest search
            }
            searchHistory.addLast(search);   // add new search to end
        }

        System.out.println("\nLast 3 Searches:");
        for (String term : searchHistory) {
            System.out.println(term);
        }

        scanner.close();
    }
}

