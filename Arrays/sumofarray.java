package Arrays;
import java.util.*;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the lenght");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
         sum+=arr[i];
        }
        System.out.println("sum of the arrays is this :- "+ sum);

    }

    
}
