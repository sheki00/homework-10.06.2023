public class RevenueCalculator {
}
import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        double totalRevenue = unitPrice * quantity;

        double discountRate = 0.0;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        }

        double discountAmount = totalRevenue * discountRate;
        double finalRevenue = totalRevenue - discountAmount;

        System.out.println("Total revenue: $" + totalRevenue);
        System.out.println("Discount rate: " + (discountRate * 100) + "%");
        System.out.println("Discount amount: $" + discountAmount);
        System.out.println("Final revenue: $" + finalRevenue);
    }
}