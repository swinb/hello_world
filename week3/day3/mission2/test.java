package mission2;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        CreateStudent createStudent = new CreateStudent();
        StudentInfo a = createStudent.createStudentInfo("강감찬", 211213, "국어국문학과", "국어", 95, 56,95, "OOO");
        StudentInfo b = createStudent.createStudentInfo("김유신", 212330, "컴퓨터공학과", "수학", 95, 98,85, "OOO");
        StudentInfo c = createStudent.createStudentInfo("신사임당", 201518, "국어국문학과", "국어", 100, 88, 55,"OOO");
        StudentInfo d = createStudent.createStudentInfo("이순신", 202360, "국어국문학과", "국어", 89, 95, "OOX");
        StudentInfo e = createStudent.createStudentInfo("홍길동", 201290, "컴퓨터공학과", "수학", 83, 56, "OOX");

        ArrayList<StudentInfo> info = new ArrayList<>();
        info.add(a);
        info.add(b);
        info.add(c);
        info.add(d);
        info.add(e);
        Report report = new Report(info);
        report.koreanReport();
        report.mathReport();
        report.danceReport();

    }


}
