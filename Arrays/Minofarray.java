package Arrays;

import java.util.Scanner;

public class Minofarray {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Take input for each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Initialize max with the first element of the array
        int min = array[0];

        // Traverse the array to find the maximum value
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i]; // Update max if the current element is greater
            }
        }

        int smin = Integer.MAX_VALUE;
        for (int i = 1; i < size; i++) {
            if (array[i] < smin && array[i]!= min) {
                smin = array[i]; // Update max if the current element is greater
            }
        }
        System.out.println("The maximum element in the array is: " + smin);


        // Print the maximum value
        System.out.println("The maximum element in the array is: " + min);

        // Close the scanner object


    }
    
}
