package assignment;

import java.util.LinkedList;
import java.util.Scanner;

public class RecentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> recentApps = new LinkedList<>();

        System.out.println("Open 5 apps (Enter app names):");

        for (int i = 0; i < 5; i++) {
            System.out.print("App " + (i + 1) + ": ");
            String app = scanner.nextLine();

            // If app is already opened, remove it from current position
            if (recentApps.contains(app)) {
                recentApps.remove(app);
            }

            // Add the app to the top (front of the list)
            recentApps.addFirst(app);
        }

        System.out.println("\nRecent Apps Opened (most recent first):");
        for (String app : recentApps) {
            System.out.println(app);
        }

        scanner.close();
    }
}
