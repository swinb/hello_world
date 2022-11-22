package day2.AA;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore {
    public static void main(String[] args) {
        ArrayList<String> scoreList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ScoreCalculation scoreCalculation = new ScoreCalculation();

        System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
        for (int i = 0; i < 6; i++) {
            scoreList.add(scanner.next());
        }
        scanner.close();

        double score = scoreCalculation.checkScore(scoreList, 0, 0);
        double averageScore = scoreCalculation.averageScore(score, scoreList.size());
        System.out.println(averageScore);
    }
}