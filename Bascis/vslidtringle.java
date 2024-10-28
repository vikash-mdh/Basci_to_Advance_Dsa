package Bascis;

import java.util.Scanner;

public class vslidtringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:- ");
        int a = sc.nextInt();
        System.out.println("Enter the number b:- ");
        int b = sc.nextInt();
        System.out.println("Enter the number c:- ");
        int c = sc.nextInt();
        if(a+b>c && b+c>a && c+a>b){
            System.out.println("This is a valid tringle");
        }else{
            System.out.println("This is a valid tringle");
        }

    }
    
}
