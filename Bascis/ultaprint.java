package Bascis;

import java.util.Scanner;

public class ultaprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        while(n > 0){
            int dig = n % 10;
            n /= 10;
            System.out.print(dig);
        }
    }
    
}
