package day2.DD;

import java.util.*;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> students = new HashMap<>();

        System.out.println("Shine 장학금 관리 시스템입니다.");

//        for(int i = 0; i<5; i++){
//            students.put(scanner.next(),scanner.nextDouble());
//        }
        students.put("JK", 3.1);
        students.put("Crong", 2.4);
        students.put("Shine", 4.3);
        students.put("Silver", 3.9);
        students.put("Honux", 4.0);

        ArrayList<String> compare = new ArrayList<>(students.keySet());
        compare.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return students.get(o1).compareTo(students.get(o2));
            }
        });
        for (String a : compare) {
            System.out.print(a + "  ");
            System.out.println(students.get(a));
        }
        Double score = scanner.nextDouble();
        scanner.close();

        for (int i = 0; i < compare.size(); i++) {
            if (students.get(compare.get(i)) >= score) System.out.printf("%s  ", compare.get(i));
        }
    }
}
