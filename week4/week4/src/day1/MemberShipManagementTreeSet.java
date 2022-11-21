package day1;

import java.util.Set;
import java.util.TreeSet;

public class MemberShipManagementTreeSet {
    static TreeSet<MemberShip> memberSet = new TreeSet<>();
    final String line = "==================================";

    public MemberShipManagementTreeSet() {
    }

    void addMemberShip(int memberId, String name, GRADE grade) {
        memberSet.add(new MemberShip(memberId, name, grade));
    }

    void showAllMember() {
        System.out.println(line);
        for (Object a : memberSet) {
            System.out.println(a);
        }
        System.out.println(line);
    }

    boolean removeMember(int memberId) {
        for (MemberShip a : memberSet) {
            if (a.getMemberId() == memberId) {
                memberSet.remove(a);
                return true;
            }
        }
        System.out.printf("%d에 해당하는 멤버가 없습니다.\n", memberId);
        System.out.println(line);
        return false;
    }
}
