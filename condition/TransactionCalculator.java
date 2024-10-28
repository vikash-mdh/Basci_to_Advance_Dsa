package condition;

import java.util.Scanner;

public class TransactionCalculator {

    public static void calculateTransaction(double costPrice, double sellingPrice) {
        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        } else if (sellingPrice < costPrice) {
            System.out.println("Loss");
        } else {
            System.out.println("Break-even");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input cost price and selling price from user
        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();

        // Calculate and print the result of the transaction
        calculateTransaction(costPrice, sellingPrice);
        
        scanner.close();
    }
}
