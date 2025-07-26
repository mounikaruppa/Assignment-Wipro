package assignmentJava8;

/// Step 1: Define the interface
interface MagicPower {
    
    // Abstract method (must be implemented by class)
    void usePower();
    
    // Default method (already implemented)
    default void showDefaultPower() {
        System.out.println("This is a default magical power.");
    }
}

// Step 2: Class that implements the interface
public class Assignment4 implements MagicPower {

    // Provide implementation for abstract method
    public void usePower() {
        System.out.println("Wizard casts a powerful spell!");
    }

    public static void main(String[] args) {
        Assignment4 w = new Assignment4();

        // Call abstract method
        w.usePower();

        // Call default method
        w.showDefaultPower();
    }
}


