package day1;

import java.util.Comparator;
import java.util.Objects;

public class MemberShip implements Comparable<MemberShip> {
    GRADE grade;
    int memberId;
    String name;


    public MemberShip(int memberId, String name, GRADE grade) {
        this.memberId = memberId;
        this.name = name;
        this.grade = grade;
    }

    @Override
//    public int compareTo(MemberShip memberShip) {
//        int result = this.memberId - memberShip.memberId;
//        if (result == 0) {
//            System.out.printf("이미 있는 아이디 %d는 추가할 수 없습니다.\n", memberShip.getMemberId());
//        }
//        return result;
//    }

    public int compareTo(MemberShip memberShip) {
        int result = this.name.compareTo(memberShip.getName());
        if (result == 0) {
            System.out.printf("이미 있는 이름 %s는 추가할 수 없습니다.\n", memberShip.getName());
        }
        return result;
    }



    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

    @Override
    public boolean equals(Object obj) {
        MemberShip m = (MemberShip) obj;
        if (hashCode() == m.hashCode()) {
            System.out.printf("이미 있는 아이디 %d는 추가할 수 없습니다.\n", m.getMemberId());
            return this.hashCode() == m.hashCode();
        }

        return false;
    }

    String getName() {
        return name;
    }

    int getMemberId() {
        return memberId;
    }

    GRADE getGrade() {
        return grade;
    }

    public String toString() {
        return name + "님의 아이디는" + memberId + "이고 등급은" + grade + "입니다.";
    }

}

