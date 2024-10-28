package loops;

import java.util.Scanner;

public class palindrome {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = scanner.nextLine();
            boolean isPalindrome = true;
            
            int len = str.length();
            for (int i = 0; i < len / 2; i++) {
                if (str.charAt(i) != str.charAt(len - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
    
            if (isPalindrome) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
            scanner.close();
        
    }
    
}
