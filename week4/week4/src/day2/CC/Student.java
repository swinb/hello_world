package day2.CC;

public class Student {
    private String name;
    private String major;
    private int studentNumber;
    private double scoreAverage;
    private final String line = "---------------------------------------";
    public Student(String name, String major, int studentNumber, double scoreAverage){
        this.name = name;
        this.major = major;
        this.studentNumber = studentNumber;
        this.scoreAverage = scoreAverage;
    }
    public String toString(){
        return line + "\n이름:  " +name+ "\n학과:  " +major + "\n학번:  "+ studentNumber + "\n학점평균:  " + scoreAverage;
    }
    String getName(){
        return name;
    }
    String getMajor(){
        return major;
    }
    int getStudentNumber(){
        return studentNumber;
    }
    double getScoreAverage(){
        return scoreAverage;
    }
}
