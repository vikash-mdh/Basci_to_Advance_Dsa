package Arrays;
import java.util.*;
public class Lineraserch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terget element");
        int tag = sc.nextInt();
        System.out.println("Enter the lengh");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        boolean falg = false;
        for(int i = 0; i < n; i++){
            if(arr[i] == tag){
            falg = true;
            break;
        }
    }
        if(falg == true)
        System.out.println("element is found");
        else
        System.out.println(" Element is not found");

    

    }
    
}
