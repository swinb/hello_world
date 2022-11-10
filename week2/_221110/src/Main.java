import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\82104\\Desktop\\start\\_221110\\src\\input.txt");
        Scanner scan = new Scanner(file);
        ArrayList<String> scanInput = new ArrayList<String>();
        while (scan.hasNext()) {
            scanInput.add(scan.nextLine());
        }
        Student a = new Student(scanInput.get(0));
        Student b = new Student(scanInput.get(1));
        a.putInfo();
        b.putInfo();
        System.out.println(a);
        System.out.println(b);

    }
}

class Student {
    String name;
    String major;
    int studentNumber;
    int korean;
    int math;
    int english;
    int subjectNumber;
    int totalScore;
    int averageScore;
    String[] info;

    public Student(String a) {
        info = a.split(" ");
        System.out.println(info[1]);
    }

    public void putInfo() {
        for (int i = 0; i < info.length / 2; i++) {
            setInfo(i * 2);
        }
        totalScore = korean + math + english;
        averageScore = totalScore / subjectNumber;
    }

    public void setInfo(int a) {
        if (info[a].equals("이름")) this.name = info[a + 1];
        else if (info[a].equals("학번")) studentNumber = Integer.parseInt(info[a + 1]);
        else if (info[a].equals("전공")) major = info[a + 1];
        else if (info[a].equals("국어")) {
            korean = Integer.parseInt(info[a + 1]);
            subjectNumber++;
        } else if (info[a].equals("수학")) {
            math = Integer.parseInt(info[a + 1]);
            subjectNumber++;
        } else if (info[a].equals("영어")) {
            english = Integer.parseInt(info[a + 1]);
            subjectNumber++;
        }
    }

    public String toString() {
        return this.name + "학생은 " + subjectNumber + "과목을 수강했습니다 \n총점은" + totalScore + "점이고 평균은" + averageScore + "입니다.";
    }
}