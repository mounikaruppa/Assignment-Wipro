package assignmentJava8;

//Step 1: Create a functional interface with 1 method
@FunctionalInterface
interface MessagePrinter {
 void print(String message);
}

public class Assignment3 {

 // Step 2: Method that takes the interface as parameter
 public static void greet(MessagePrinter printer) {
     printer.print("Hello Harry!");
 }

 public static void main(String[] args) {
     // Step 3: Pass lambda as implementation of functional interface
     greet(msg -> System.out.println("Greeting Message: " + msg));
 }
}

