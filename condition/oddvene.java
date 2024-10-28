package condition;
import java.util.*;

public class oddvene {
        public static void oddeven(int number) {
            if (number % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          oddeven(a); // function call
           
        }
    }
    
    

