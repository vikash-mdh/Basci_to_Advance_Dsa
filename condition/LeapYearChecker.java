package condition;

import java.util.Scanner;

public class LeapYearChecker {

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkLeapYear(n);
        // Example usage:
        // checkLeapYear(2020);  // Prints "Leap Year"
        // checkLeapYear(1900);  // Prints "Not a Leap Year"
        // checkLeapYear(2000);  // Prints "Leap Year"
    }
}
