package Bascis;

import java.util.Scanner;

public class printallprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high  = sc.nextInt();
        for(int i = low; i <= high; i++){
            int cnt = 0;

            for(int j = 2; j*j < i; j++){
                if (i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0){
                System.out.print(cnt);
            }
        }
       
    }
}
