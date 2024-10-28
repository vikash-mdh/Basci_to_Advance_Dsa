package condition;

public class tringle {
        public static void findTriangleType(int side1, int side2, int side3) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }
    
        public static void main(String[] args) {
            // Example usage:
            findTriangleType(3, 3, 3);  // Prints "Equilateral Triangle"
            findTriangleType(4, 4, 5);  // Prints "Isosceles Triangle"
            findTriangleType(3, 4, 5);  // Prints "Scalene Triangle"
        }
    }
    
    

