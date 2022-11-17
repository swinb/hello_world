package mission2;

public class DanceEvaluation implements GradeEvaluation {
    @Override
    public String getGrade(int point) {
        if(point>=70)  return "P";
        return "F";
    }
}