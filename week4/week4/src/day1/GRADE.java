package day1;

public enum GRADE {
    SILVER(0, 0.01,3000), PLATINUM(0.05, 0.05,1000), VIP(0.1, 0.1,0);

    private final double salesRatio;
    private final double bonusRatio;
    private final int parkingFee;

    GRADE(double salesRatio, double bonusRatio, int parkingFee) {
        this.salesRatio = salesRatio;
        this.bonusRatio = bonusRatio;
        this.parkingFee = parkingFee;
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }
    public int getParkingFee() {
        return parkingFee;
    }
}





