package Arrays;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the lenght");
        int n = sc.nextInt();
        System.out.println("Enter the array");
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int i = 0; 
        int j = arr.length -1;
        while(i <= j) {
            int tmep = arr[i];
            arr[i] = arr[j];
            arr[j] = tmep;
            i++;
            j--;
            
        }
       
       for(int k = 0; k < n; k++){
        System.out.print(arr[k]+" ");
       }


        // -------- this is second approch-----------
        // System.out.println();
        // for(int i = 0; i < n/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;

        // }
        // for(int i = 0; i <n; i++){
        //     System.out.print(arr[i]+" ");
        // }
       
        
    }
    
}
