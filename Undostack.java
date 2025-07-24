package assignment;

import java.util.Scanner;
import java.util.Stack;

public class Undostack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> commandStack = new Stack<>();

        // Step 1: Add 3 commands from user
        System.out.println("Enter 3 commands:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Command " + i + ": ");
            String command = scanner.nextLine();
            commandStack.push(command);
        }

        // Step 2: Undo last command
        String undoneCommand = commandStack.pop();
        System.out.println("\nUndo command: " + undoneCommand);

        // Step 3: Redo it (re-add to stack)
        commandStack.push(undoneCommand);
        System.out.println("Redo command: " + undoneCommand);

        // Step 4: Show final stack
        System.out.println("\nFinal command stack:");
        for (String cmd : commandStack) {
            System.out.println(cmd);
        }

        scanner.close();
    }
}
