package condition;
import java.util.*;

public class LeastofThree {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Variable to store the least number
        int least;

        // Nested if-else to find the least number
        if (num1 <= num2) {
            if (num1 <= num3) {
                least = num1;
            } else {
                least = num3;
            }
        } else {
            if (num2 <= num3) {
                least = num2;
            } else {
                least = num3;
            }
        }

        // Print the least number
        System.out.println("The least number is: " + least);

        // Close the scanner
        scanner.close();
    }
}

    
