import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing two months worth of rent on one tenant");
        System.out.println();


        // SCANNER TESTING
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Tenant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter building address: ");
        String address = sc.nextLine();

        System.out.print("Enter apartment/store number: ");
        String apartment = sc.nextLine();

        System.out.print("Enter monthly rent: ");
        double monthlyRent = sc.nextDouble();
        sc.nextLine();

        System.out.print("Is commercial? (true/false): ");
        boolean isCommercial = sc.nextBoolean();
        sc.nextLine();

        Tenant userTenant = new Tenant(
                name,
                address,
                apartment,
                monthlyRent,
                isCommercial
        );


        System.out.print("Enter the month owed: ");
        String month = sc.nextLine();

        System.out.print("Enter payment method: ");
        String method = sc.nextLine();

        System.out.print("Enter the amount paid: ");
        double amountPay = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the date paid: ");
        String datePay = sc.nextLine();

        RentPayment rent = new RentPayment(
                userTenant,
                month,
                method,
                amountPay,
                datePay
        );
        userTenant.addPayment(rent);
        userTenant.printTenant();
        userTenant.printPaymentHistory();

        // make a tenant array list here to auto store the tenants created.

        // END OF SCANNER TESTING


        Tenant John = new Tenant( // name of tenant, address, apt, monthly rent, isCommercial, totalBalance.
                "John Doe", "230 Grand Street", "1A", 1000, false);

        Tenant Jane = new Tenant( // name of tenant, address, apt, monthly rent, isCommercial, totalBalance.
                "Jane Doe", "230 Grand Street", "1B", 1000, false);


        RentPayment john_january2026 = new RentPayment(  // tenant, month, paymentMethod, amountPaid, datePaid.
                John, "January", "Check", 500, "01/15/26");

        RentPayment john_february2026 = new RentPayment(  // tenant, month, paymentMethod, amountPaid, datePaid.
                John, "February", "Check", 500, "02/15/26");

        RentPayment jane_january2026 = new RentPayment(  // tenant, month, paymentMethod, amountPaid, datePaid.
                Jane, "January", "Check", 100, "01/19/26");

        John.addPayment(john_january2026); // testing by adding in 2 months worth of rent and MUST BE BEFORE the get totalBalance
        John.addPayment(john_february2026);


        // Prints tenant and the rent info
        John.printTenant(); // Prints out the tenant info ex: John.printTenant(), Jane.printTenant()
        John.printPaymentHistory(); // Rent info for this tenant only.

        Jane.addPayment(jane_january2026); // testing out 1 month for a different tenant
        Jane.printTenant();
        Jane.printPaymentHistory();
    }
}