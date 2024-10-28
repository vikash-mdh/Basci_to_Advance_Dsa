package loops;
import java.util.*;
public class ap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number");
         int n = sc.nextInt();
        // for(int i = 0; i <= 2*n-1; i+=2){
        //     System.out.println(i);
        // }
        int a = 5;
        int d = -4;
        for(int i = 0; i <=n; i++){
            System.out.println(a);
            a+=d;

        }

    }
    
}
