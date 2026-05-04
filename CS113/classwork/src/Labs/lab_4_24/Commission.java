public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(
        String eName,
        String eAddress,
        String ePhone,
        String SocsecNumber,
        double payRate,
        double comRate
    ) {
        super(eName, eAddress, ePhone, SocsecNumber, payRate);
        commissionRate = comRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0;
        return payment;
    }

    public String toString() {
        return super.toString() + " Total Sales: " + totalSales;
    }
}
