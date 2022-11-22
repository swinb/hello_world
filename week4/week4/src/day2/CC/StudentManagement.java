package day2.CC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
//        Scanner 대용
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Silver", "Java", 1, 4.1),
                new Student("Honux", "데이터베이스", 2, 3.9),
                new Student("Shine", "웹공학", 3, 3.5),
                new Student("JK", "iOS", 4, 4.25)));
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("---------------------------------------");

        while (true) {
            System.out.print("학생 이름 >> ");
            String input = scanner.next();
            if (input.equals("그만")) break;
            for (Student a : students) {
                if (a.getName().equals(input)) {
                    System.out.printf(a.getName() + ", " + a.getMajor() + ", " + a.getStudentNumber() + ", " + a.getScoreAverage() + "\n");
                }
            }
        }
    }
}
