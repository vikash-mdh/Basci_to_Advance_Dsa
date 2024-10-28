package condition;

public class AbsoluteValue {
        public static void printAbsoluteValue(int number) {
            // If the number is negative, multiply by -1 to get the positive equivalent
            if (number < 0) {
                number = -number;
            }
            System.out.println("Absolute value: " + number);
        }
    
        public static void main(String[] args) {
            printAbsoluteValue(-3);  // Prints "Absolute value: 15"
            //printAbsoluteValue(20);   // Prints "Absolute value: 20"
        }
    }
    
    

