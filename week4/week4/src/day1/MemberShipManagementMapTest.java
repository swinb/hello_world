package day1;

public class MemberShipManagementMapTest {

    public static void main(String[] args) {


        MemberShipManagementMap management = new MemberShipManagementMap();
        management.addMemberShip(1001, "Hong", GRADE.SILVER);
        management.addMemberShip(1002, "Park", GRADE.VIP);
        management.addMemberShip(1003, "Kim", GRADE.PLATINUM);

        System.out.println("모든 멤버 보여주기: ");
        management.showAllMember();

        System.out.println("존재 하는 아이디를 지웠을때 :");
        if(management.removeMember(1001)) {
            management.showAllMember();
        }

        System.out.println("존재 하지 않는 아이디를 지우려 할때:");
        if(management.removeMember(1005)) {
            management.showAllMember();
        }

        System.out.println("이미 존재 하는 아이드를 추가하려 할때 :");
        management.addMemberShip(1002, "Lee", GRADE.VIP);

        management.showAllMember();

        management.addMemberShip(1003, "Song", GRADE.PLATINUM);
        management.showAllMember();
    }

}