package Bascis;

import java.util.*;

public class printprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the number");
        // This line using input in user
        int num = sc.nextInt();
        // This line count the current number
        int cnt = 0;
        // This loop work is the 
        for (int i = 0; i < num; i++) {

            for (int div = 2; div * div <= num; div++) {
                if (num % div == 0) {
                    cnt++;
                    break;
                }
            }
        }
        if (cnt == 0) {
            System.out.println("this prime number");
        } else {
            System.out.println("this is not prime number");
        }
    }

}
