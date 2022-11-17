package mission2;

public class StudentInfo {
    private String name;
    private int studentCode;
    private String major;
    private String majorSubject;
    private int koreanScore;
    private int mathScore;
    private int danceScore;
    private String koreanGrade;
    private String mathGrade;
    private String danceGrade;
    private String learningSubject;
    private GradeEvaluation gradeEvaluation;


    public StudentInfo(String name, int studentCode, String major, String majorSubject, int koreanScore, int mathScore, String learningSubject) {
        this.name = name;
        this.studentCode = studentCode;
        this.major = major;
        this.majorSubject = majorSubject;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.learningSubject = learningSubject;
    }
    public StudentInfo(String name, int studentCode, String major, String majorSubject, int koreanScore, int mathScore, int danceScore, String learningSubject) {
        this.name = name;
        this.studentCode = studentCode;
        this.major = major;
        this.majorSubject = majorSubject;
        this.koreanScore = koreanScore;
        this.mathScore = mathScore;
        this.danceScore = danceScore;
        this.learningSubject = learningSubject;

    }

    public void koreanEvaluation() {
        if (majorSubject.equals("국어")) gradeEvaluation = new MajorEvaluation();
        else gradeEvaluation = new BasicEvaluation();
        koreanGrade = gradeEvaluation.getGrade(koreanScore);
    }

    public void mathEvaluation() {
        if (majorSubject.equals("수학")) gradeEvaluation = new MajorEvaluation();
        else gradeEvaluation = new BasicEvaluation();
        mathGrade = gradeEvaluation.getGrade(mathScore);
    }

    public void danceEvaluation() {
        gradeEvaluation = new DanceEvaluation();
        danceGrade = gradeEvaluation.getGrade(danceScore);
    }

    public String getName() {
        return name;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getDanceScore() {
        return danceScore;
    }

    public String getKoreanGrade() {
        return koreanGrade;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public String getDanceGrade() {
        return danceGrade;
    }

    public String getLearningSubject() {
        return learningSubject;
    }
}
