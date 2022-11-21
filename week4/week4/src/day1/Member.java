package day1;

public class Member {
    MemberShip memberShip;
    int shoppingFee;
    int howManyHours;
    double bonusRatio;
    double salesRatio;
    int parkingFee;
    public Member(MemberShip memberShip, int shoppingFee, int howManyHours){
        this.memberShip = memberShip;
        this.shoppingFee = shoppingFee;
        this.howManyHours = howManyHours;
        this.bonusRatio = memberShip.grade.getBonusRatio();
        this.salesRatio = memberShip.grade.getSalesRatio();
        this.parkingFee = memberShip.grade.getParkingFee();
    }

    void memberBuy(){
        System.out.printf("%s님의 지불 금액은 %d 원 이고, 적립 포인트는 %d점 입니다.\n주차요금은 %d원 입니다\n",
                memberShip.getName(), (int) (shoppingFee * (1 - salesRatio)), (int) (shoppingFee * bonusRatio), howManyHours * parkingFee);
    }
}
