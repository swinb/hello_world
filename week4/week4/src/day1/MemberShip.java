package day1;

import java.util.Objects;

public class MemberShip {
    GRADE grade;
    int memberId;
    String name;


    public MemberShip(int memberId, String name, GRADE grade) {
        this.memberId = memberId;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberId);
    }

    @Override
    public boolean equals(Object obj) {
        //p1.equals(p2)
        if (obj instanceof MemberShip) {
            MemberShip m = (MemberShip) obj;
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

