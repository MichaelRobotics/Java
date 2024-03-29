import java.io.Console;
import java.util.Scanner;

public class Module6 {
    public static void main(String[] args) {
            int number = 2;
            
            switch (number) { // switch statement, float and double are not allowed
                case 1:
                    // code for case 1
                    break;
                case 2:
                    // code for case 2
                    break;
                case 3:
                    // code for case 3
                    break;
                default:
                    // code for default case
                    break;
            }
            System.out.println(SimpleLoop(number));
            boolean condition = true;
            do {
                condition = false;// code inside the loop
            } while (condition);
            int i = 0;
            while (i < number) {
                // code inside the loop
                i++;
            }
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter your name: ");

            // Read the input provided by the user
            String name = scanner.nextLine();

            // Display a greeting message
            System.out.println("Hello, " + name + "!");

            // Close the Scanner to release system resources
            scanner.close();

            try {
                Console console = System.console();
    
//                if (console == null) {
//                    throw new IllegalStateException("Console is not available.");
//                }
    
                char[] passwordArray = console.readPassword("Enter your password: ");
                String password = new String(passwordArray);
    
                // Example usage: print the password
                System.out.println("Your password is: " + password);
            } catch (IllegalStateException e) {
                // Handle the exception when console is not available
                System.err.println(e.getMessage() + " Please run the program from the command line.");
            } catch (Exception e) {
                // Handle any other exceptions
                System.err.println("An error occurred: " + e.getMessage() + " Please run the program from the command line.");
                e.printStackTrace();
            }
        }
        
            int number2 = 2;
            
            public static String switchStatement(int number2) {
                return switch (number2) { // switch statement, float and double are not allowed
                    case 1 -> {
                        // code for case 1
                        yield "Case 1";
                    }
                    case 2 -> {
                        // code for case 2
                        yield "Case 2";
                    }
                    case 3 -> {
                        // code for case 3
                        System.out.println("Case 3");
                        yield "Case 3";
                    }
                    default -> {
                        yield "Unknown";
                    }
                };
            }
            public static int SimpleLoop(int number2) {
                for (int i = 20; i > number2; number2++) {
                    // code inside the loop
                }
                return  number2;  
            }
            
        }