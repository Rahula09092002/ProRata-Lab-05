import java.util.Scanner;

public class IT23373648Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        int startDate;
        int endDate;
        int days;

        double discountRate;
        double total;
        double discountAmount;

        System.out.print("Enter start date: ");
        startDate = input.nextInt();

        System.out.print("Enter end date: ");
        endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates should be between 1 and 31.");
            System.exit(0);
        }

        // Validation 2
        if (startDate >= endDate) {

            System.out.println("Error: Start date should be less than end date.");
            System.exit(0);
        }

        // Calculate number of days
        days = endDate - startDate;

        // Determine discount rate
        if (days < 3) {
            discountRate = 0;
        }
        else if (days <= 4) {
            discountRate = DISCOUNT_10;
        }
        else {
            discountRate = DISCOUNT_20;
        }

        // Calculate total amount
        total = days * ROOM_CHARGE;

        discountAmount = total * discountRate;

        total = total - discountAmount;

        System.out.println("Number of days reserved = " + days);
        System.out.println("Discount amount = Rs. " + discountAmount);
        System.out.println("Total amount to be paid = Rs. " + total);
    }
}