package day1;

import java.util.HashMap;
import java.util.Map;

public class MemberShipManagementMap {
    static Map<Integer, MemberShip> memberMap = new HashMap<Integer, MemberShip>();
    final String line = "==================================";

    public MemberShipManagementMap() {
    }

    void addMemberShip(int memberId, String name, GRADE grade) {
        if (!memberMap.containsKey(memberId)) {
            memberMap.put(memberId, new MemberShip(memberId, name, grade));
        } else {
            System.out.printf("이미 있는 아이디 %d의 값이 변경됩니다.\n", memberId);
            memberMap.replace(memberId, new MemberShip(memberId, name, grade));
        }
    }

    void showAllMember() {
        System.out.println(line);
        for (int i = 1001; i <= memberMap.size() + 1001; i++) {
            if (memberMap.containsKey(i)) {
                System.out.println(memberMap.get(i));
            }
        }
        System.out.println(line);
    }

    boolean removeMember(int memberId) {
        if (memberMap.containsKey(memberId)) {
            memberMap.remove(memberId);
            return true;
        }
        System.out.printf("%d에 해당하는 멤버가 없습니다.\n", memberId);
        System.out.println(line);
        return false;
    }
}