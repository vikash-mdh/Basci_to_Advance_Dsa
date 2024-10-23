package Bascis;
import java.util.*;

public class gcdandlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int a = n1;
        int b = n2;
        while(n1 % n2  != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int gcd = n2;
        int lcm = (a * b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
    
}
