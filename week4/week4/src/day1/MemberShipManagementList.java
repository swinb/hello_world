package day1;

import java.util.ArrayList;

public class MemberShipManagementList {
    static ArrayList<MemberShip> memberList = new ArrayList<>();
    final String line = "==================================";

    public MemberShipManagementList() {
    }

    void addMemberShip(int memberId, String name, GRADE grade) {
        memberList.add(new MemberShip(memberId, name, grade));
    }

    void showAllMember() {
        System.out.println(line);
        for (MemberShip a : memberList) {
            System.out.println(a);
        }
        System.out.println(line);
    }
    boolean removeMember(int memberId) {
        for (MemberShip a : memberList) {
            if (a.getMemberId() == memberId) {
                memberList.remove(a);
                return true;
            }
        }
        System.out.printf("%d에 해당하는 멤버가 없습니다.\n",memberId);
        return false;
    }
}

