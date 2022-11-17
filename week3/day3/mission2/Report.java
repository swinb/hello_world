package mission2;

import java.util.ArrayList;

public class Report{
    ArrayList<StudentInfo> studentList;

    public Report(ArrayList<StudentInfo> studentList){
        this.studentList = studentList;
    }

    public void koreanReport(){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("--------------------------------------");
        System.out.println("         국어 수강생 학점");
        System.out.println("이름   |    학번    |중점과목|    점수");
        System.out.println("--------------------------------------");
        for(int i = 0 ; i < studentList.size(); i++){
            StudentInfo info = studentList.get(i);
            info.koreanEvaluation();
            stringBuilder.append(info.getName()).append(" | ");
            stringBuilder.append(info.getStudentCode()).append(" | ");
            stringBuilder.append(info.getMajorSubject()).append(" | ");
            stringBuilder.append(info.getKoreanScore()).append(":");
            stringBuilder.append(info.getKoreanGrade()).append(" | \n");
        }
        System.out.println(stringBuilder);
        System.out.println("--------------------------------------");
    }
    public void mathReport(){
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("--------------------------------------");
        System.out.println("         수학 수강생 학점");
        System.out.println("이름   |    학번    |중점과목|    점수");
        System.out.println("--------------------------------------");
        for(int i = 0 ; i < studentList.size(); i++){
            StudentInfo info = studentList.get(i);
            info.mathEvaluation();
            stringBuilder.append(info.getName()).append(" | ");
            stringBuilder.append(info.getStudentCode()).append(" | ");
            stringBuilder.append(info.getMajorSubject()).append(" | ");
            stringBuilder.append(info.getMathScore()).append(":");
            stringBuilder.append(info.getMathGrade()).append(" | \n");
        }
        System.out.println(stringBuilder);
        System.out.println("--------------------------------------");

    }
    public void danceReport() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("--------------------------------------");
        System.out.println("         방송댄스 수강생 학점");
        System.out.println("이름   |    학번    |중점과목|    점수");
        System.out.println("--------------------------------------");
        for (int i = 0; i < studentList.size(); i++) {
            StudentInfo info = studentList.get(i);
            if (info.getLearningSubject().substring(2).equals("O")) {
                info.danceEvaluation();
                stringBuilder.append(info.getName()).append(" | ");
                stringBuilder.append(info.getStudentCode()).append(" | ");
                stringBuilder.append(info.getMajorSubject()).append(" | ");
                stringBuilder.append(info.getDanceScore()).append(":");
                stringBuilder.append(info.getDanceGrade()).append(" | \n");
            }
        }
        System.out.println(stringBuilder);
        System.out.println("--------------------------------------");

    }
}
