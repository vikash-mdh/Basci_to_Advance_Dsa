package Bascis;
import java.util.*;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the number:- ");
        int n = sc.nextInt();

        if(n % 2 == 0)
        System.out.println("This is the Even number");
        
        if(n % 2 == 1)
        System.out.println("This is the odd number ");
    }
    
}
