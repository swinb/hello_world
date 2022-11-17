package mission2;

public class CreateStudent {
    public CreateStudent() {
    }

    public StudentInfo createStudentInfo(String name, int studentCode, String major, String majorSubject, int koreanScore, int mathScore, String learningSubject) {
        return new StudentInfo(name, studentCode, major, majorSubject, koreanScore, mathScore, learningSubject);
    }
    public StudentInfo createStudentInfo(String name, int studentCode, String major, String majorSubject, int koreanScore, int mathScore, int danceScore, String learningSubject) {
        return new StudentInfo(name, studentCode, major, majorSubject, koreanScore, mathScore,danceScore, learningSubject);
    }

}
