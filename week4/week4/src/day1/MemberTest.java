package day1;

public class MemberTest {
    public static void main(String[] args){
        MemberShip a = new MemberShip(1001, "Hong", GRADE.SILVER);

        Member member = new Member(a,10000,2);
        member.memberBuy();
    }
}
