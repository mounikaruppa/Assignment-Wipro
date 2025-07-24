package assignment;

import java.util.*;

class Patient {
    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class Emergency_Patient_Tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // PriorityQueue with comparator to sort by severity (lower value = more urgent)
        PriorityQueue<Patient> queue = new PriorityQueue<>(new Comparator<Patient>() {
            public int compare(Patient p1, Patient p2) {
                return Integer.compare(p1.severity, p2.severity);
            }
        });

        System.out.print("Enter number of patients (max 5): ");
        int n = sc.nextInt();
        sc.nextLine(); // clear input

        if (n > 5) {
            System.out.println("Only 5 patients allowed. Taking first 5.");
            n = 5;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter severity (1 = high, 5 = low): ");
            int severity = sc.nextInt();
            sc.nextLine(); // clear input

            queue.add(new Patient(name, severity));
        }

        System.out.println("\nTreating patients in order:");
        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }

        sc.close();
    }
}
