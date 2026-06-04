public class RentPayment {
    private final Tenant tenant;
    private String month;
    private String paymentMethod;
    private double amountPaid;
    private String datePaid;

    public RentPayment(Tenant tenant, String month, String paymentMethod, double amountPaid, String datePaid) {
        this.tenant = tenant;
        this.month = month;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
        this.datePaid = datePaid;
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

    public String getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }

    public double getMonthlyBalance() {     // monthlyBalance = monthlyRent + late fee - amount paid
        return this.tenant.getMonthlyRent() + getLateFee() - this.amountPaid;
    }

    /* Eventually if it is commercial, only apply late fee after 5 days into the month.

    Ex: January 1st shouldn't have a late fee.
        January 5th should have a late fee.

     */
    public double getLateFee() {
        if (this.tenant.isCommercial()) {
            return this.tenant.getMonthlyRent() * 0.05;
        } else {
            return 0.0;
        }

    }
}
