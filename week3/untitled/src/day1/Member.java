package day1;

public class Member {
    String customerName;
    int shoppingFee;
    int howManyHours;
    String customerGrade;
    double bonusRatio;
    double salesRatio;
    int parkingCharge;
    boolean needGuide;

    public Member(String customerName, int shoppingFee, int howManyHours) {
        this.customerName = customerName;
        this.shoppingFee = shoppingFee;
        this.howManyHours = howManyHours;
    }

    public void totalCharge() {
        System.out.printf("%s님의 지불 금액은 %d 원 이고 주차요금은 %d원 입니다", customerName, shoppingFee, howManyHours * 3000);
    }
}

class Red extends Member {
    public Red(String customerName, int shoppingFee, int howManyHours) {
        super(customerName, shoppingFee, howManyHours);

        customerGrade = "RED";
        bonusRatio = 0.01;
        parkingCharge = 3000;
    }

    public void totalCharge() {
        System.out.printf("%s님의 지불 금액은 %d 원 이고, 적립 포인트는 %d점 입니다.\n주차요금은 %d원 입니다\n",
                customerName, shoppingFee, (int) (shoppingFee * bonusRatio), howManyHours * parkingCharge);
    }
}

class Platinum extends Member {
    public Platinum(String customerName, int shoppingFee, int howManyHours) {
        super(customerName, shoppingFee, howManyHours);

        customerGrade = "PLATINUM";
        bonusRatio = 0.05;
        salesRatio = 0.05;
        parkingCharge = 1000;
    }

    public void totalCharge() {
        System.out.printf("%s님의 지불 금액은 %d 원 이고, 적립 포인트는 %d점 입니다.\n주차요금은 %d원 입니다\n",
                customerName, (int) (shoppingFee * (1 - salesRatio)), (int) (shoppingFee * bonusRatio), howManyHours * parkingCharge);
    }
}

class Diamond extends Member {
    public Diamond(String customerName, int shoppingFee, int howManyHours) {
        super(customerName, shoppingFee, howManyHours);

        customerGrade = "DIAMOND";
        bonusRatio = 0.1;
        salesRatio = 0.1;
        parkingCharge = 0;
        needGuide = true;
    }

    public void totalCharge() {
        System.out.printf("%s님의 지불 금액은 %d 원 이고, 적립 포인트는 %d점 입니다.\n주차요금은 %d원 입니다\n",
                customerName, (int) (shoppingFee * (1 - salesRatio)), (int) (shoppingFee * bonusRatio), howManyHours * parkingCharge);
    }
}

class Main {
    public static void main(String[] args) {
        Red james = new Red("James", 10000, 2);
        Red tomas = new Red("Tomas", 30000, 2);
        Platinum edward = new Platinum("Edward", 10000, 2);
        Platinum percy = new Platinum("Percy", 30000, 2);
        Diamond elizabet = new Diamond("Elizabet", 30000, 2);

        james.totalCharge();
        tomas.totalCharge();
        edward.totalCharge();
        percy.totalCharge();
        elizabet.totalCharge();
    }
}