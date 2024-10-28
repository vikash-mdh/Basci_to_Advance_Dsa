package Arrays;

import java.util.Scanner;

public class Maxofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Take input for each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Initialize max with the first element of the array
        int max = array[0];

        // Traverse the array to find the maximum value
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if the current element is greater
            }
        }

        // Print the maximum value
        System.out.println("The maximum element in the array is: " + max);

        // Close the scanner object
        sc.close();
    }
    
}
