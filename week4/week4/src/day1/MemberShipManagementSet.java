package day1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class MemberShipManagementSet {
    Set memberSet = new HashSet();

    MemberShipManagementSet() {
    }

    void addMemberShip(int memberId, String name, GRADE grade) {
        memberSet.add(new MemberShip(memberId, name, grade));
    }

    void showAllMember() {
        for (Object a : memberSet) {
            System.out.println(a);
        }
    }

    boolean removeMember(int memberId) {
        for (Object a : memberSet) {
            if (a.hashCode() == Objects.hash(memberId)){
                memberSet.remove(a);
                return true;
            }
        }
        System.out.printf("%d에 해당하는 멤버가 없습니다.\n",memberId);
        return false;
    }
}