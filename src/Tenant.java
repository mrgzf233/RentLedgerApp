import java.util.ArrayList;

public class Tenant {
    private String name;    // John Doe
    private String buildingAddress; // 123 John Street
    private String apartmentOrStoreNumber;  // 1A
    private double monthlyRent; // $1,400.00
    private boolean isCommercial;
    private double totalBalance;

    private ArrayList<RentPayment> payments;
    /* payment = single rent payment obj/one month
       payments = entire rent ledger that stores all records of that tenant
    */


    public Tenant(String name, String buildingAddress, String apartmentOrStoreNumber, double monthlyRent, boolean isCommercial, double totalBalance) {
        this.name = name;
        this.buildingAddress = buildingAddress;
        this.apartmentOrStoreNumber = apartmentOrStoreNumber;
        this.monthlyRent = monthlyRent;
        this.isCommercial = isCommercial;
        this.totalBalance = totalBalance;
        this.payments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public String getApartmentOrStoreNumber() {
        return apartmentOrStoreNumber;
    }

    public void setApartmentOrStoreNumber(String apartmentOrStoreNumber) {
        this.apartmentOrStoreNumber = apartmentOrStoreNumber;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(double monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public boolean isCommercial() {
        return isCommercial;
    }

    public void setCommercial(boolean commercial) {
        isCommercial = commercial;
    }

    public double getTotalBalance() {
        // currently set to 0 in Main.java until I add Arraylist that can track multiple months
        double totalBalance = 0.0;

        for (int i = 0; i < this.payments.size(); i++) {
            RentPayment payment = this.payments.get(i); // get the individual month
            totalBalance += payment.getMonthlyBalance();
        }
        return totalBalance;
    }


    public void addPayment(RentPayment payment) {   // Takes one month of payment and adds it to the arraylist payments
        this.payments.add(payment);
    }
}