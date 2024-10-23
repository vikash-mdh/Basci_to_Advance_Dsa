package Bascis;
import java.util.*;

public class prime_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int low = sc.nextInt();
        int hig =sc.nextInt();
        
        for(int i = low; i <= hig; i++){
            int count = 0;

            for(int div = 2; div*div <= i; div++){
                if(i % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.print(i+" ");
            }
        }

    }
    
}
