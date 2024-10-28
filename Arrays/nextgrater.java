package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nextgrater {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
       
        int[] result = nextGreaterElements(arr);
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }

    public static int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Initialize all elements to -1 (default if no greater element exists)
        
        // Iterate through each element in the array
        for (int i = 0; i < n; i++) {
            // Check elements to the right for the next greater element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        
        return result;
    }
}



