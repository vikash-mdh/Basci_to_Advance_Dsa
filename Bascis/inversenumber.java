package Bascis;
import java.util.*;
public class inversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int inv = 0;
        int op = 1;
        while(n != 0){
            int od = n % 10;
            int id = op;
            int ip = od;
            
            // make change to inv using and id 
            inv += id*(int)Math.pow(10,ip - 1);
            n = n/10;
            op++;
           

        }
        System.out.println(inv);
    }
    
}
