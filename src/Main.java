import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing one month worth of rent on one tenant");

        Tenant John = new Tenant( // name of tenant, address, apt, monthly rent, isCommercial, totalBalance.
                "John Doe", "230 Grand Street", "1A", 1000, true, 0);

        RentPayment january2026 = new RentPayment(  // tenant, month, paymentMethod, amountPaid
                John, "January", "Check", 100);

        RentPayment february2026 = new RentPayment(  // tenant, month, paymentMethod, amountPaid
                John, "February", "Check", 1000);

        System.out.println("Tenant name: " + John.getName());
        System.out.println("Address: " + John.getBuildingAddress() + " " + John.getApartmentOrStoreNumber());
        System.out.println("Reisdential/Commercial: " + John.isCommercial());
        System.out.println("Monthly Rent: " + John.getMonthlyRent());
        System.out.println("Month: " + january2026.getMonth());
        System.out.println("Month: " + february2026.getMonth());
        System.out.println("Amount paid: " + january2026.getAmountPaid());
        System.out.println("Amount paid: " + february2026.getAmountPaid());
        System.out.println("Payment method: " + january2026.getPaymentMethod());
        System.out.println("Payment method: " + february2026.getPaymentMethod());
        System.out.println("Late Fee: " + january2026.getLateFee());
        System.out.println("Late Fee: " + february2026.getLateFee());
        System.out.println("Monthly Balance: " + january2026.getMonthlyBalance());
        System.out.println("Monthly Balance: " + february2026.getMonthlyBalance());

         System.out.println("Total Balance: " + John.getTotalBalance());
        // currently set to 0 in Main.java until I add Arraylist that can track multiple months

    }
}