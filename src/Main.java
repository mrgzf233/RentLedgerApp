import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing two months worth of rent on one tenant");
        System.out.println();

        Tenant John = new Tenant( // name of tenant, address, apt, monthly rent, isCommercial, totalBalance.
                "John Doe", "230 Grand Street", "1A", 1000, false, 0.0);

        RentPayment january2026 = new RentPayment(  // tenant, month, paymentMethod, amountPaid
                John, "January", "Check", 100);

        RentPayment february2026 = new RentPayment(  // tenant, month, paymentMethod, amountPaid
                John, "February", "Check", 1000);

        John.addPayment(january2026); // testing by adding in 2 months worth of rent and MUST BE BEFORE the get totalBalance
        John.addPayment(february2026);


        // Prints tenant and the rent info
        John.printTenant(); // Prints out the tenant info ex: John.printTenant(), Jane.printTenant()
        John.printPaymentHistory(); // Rent info for this tenant only.

    }
}