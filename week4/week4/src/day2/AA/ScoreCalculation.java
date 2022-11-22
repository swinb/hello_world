package day2.AA;

import java.util.ArrayList;

public class ScoreCalculation {
    public ScoreCalculation() {
    }

    double checkScore(ArrayList<String> arrayList, double sum, int count) {
        double total = sum;
        if (arrayList.get(count).equals("A")) {
            total += 4.0;
        } else if (arrayList.get(count).equals("B")) {
            total += 3.0;
        } else if (arrayList.get(count).equals("C")) {
            total += 2.0;
        } else if (arrayList.get(count).equals("D")) {
            total += 1.0;
        }
        if (arrayList.size() - 1 == count) {
            return total;
        }
        return checkScore(arrayList, total, count + 1);
    }

    double averageScore(double score, int size){
        return score / size;
    }
}

