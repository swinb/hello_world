package day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class MemberShipManagementSet {
    Set memberSet = new HashSet();
    final String line = "==================================";

    MemberShipManagementSet() {
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
        for (Object a : memberSet) {
            if (a.hashCode() == Objects.hash(memberId)){
                memberSet.remove(a);
                return true;
            }
        }
        System.out.printf("%d에 해당하는 멤버가 없습니다.\n",memberId);
        System.out.println(line);
        return false;
    }
}