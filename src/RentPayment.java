public class RentPayment {
    private final Tenant tenant;
    private String month;
    private String paymentMethod;
    private double amountPaid;

    public RentPayment(Tenant tenant, String month, String paymentMethod, double amountPaid) {
        this.tenant = tenant;
        this.month = month;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;

    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getMonthlyBalance() {     // monthlyBalance = monthlyRent + late fee - amount paid
        return this.tenant.getMonthlyRent() + getLateFee() - this.amountPaid;
    }

    public double getLateFee() {
        if (this.tenant.isCommercial()) {
            return this.tenant.getMonthlyRent() * 0.05;
        } else {
            return 0.0;
        }

    }
}
