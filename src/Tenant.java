public class Tenant {
    private String name;    // John Doe
    private String buildingAddress; // 123 John Street
    private String apartmentOrStoreNumber;  // 1A
    private double monthlyRent; // $1,400.00
    private boolean isCommercial;
    private double totalBalance;


    public Tenant(String name, String buildingAddress, String apartmentOrStoreNumber, double monthlyRent, boolean isCommercial, double totalBalance) {
        this.name = name;
        this.buildingAddress = buildingAddress;
        this.apartmentOrStoreNumber = apartmentOrStoreNumber;
        this.monthlyRent = monthlyRent;
        this.isCommercial = isCommercial;
        this.totalBalance = totalBalance;
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
        return totalBalance;
    }

}