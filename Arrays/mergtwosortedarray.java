package Arrays;
import java.util.Arrays;
public class mergtwosortedarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        
        int[] mergedArray = mergeArrays(arr1, arr2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Merge both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1 if any
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2 if any
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}

    

