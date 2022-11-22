package day2.BB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Map<String, Integer> country = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("나라 이름, 인구 >>");
            String input = scanner.next();
            if (input.equals("그만")) {
                break;
            }
            country.put(input, scanner.nextInt());
        }

        while (true) {
            System.out.print("인구 검색>>");
            String input = scanner.next();
            if (country.containsKey(input)) {
                System.out.printf("%s의 인구는 %d\n", input, country.get(input));
            } else if (input.equals("그만")) {
                break;
            } else System.out.printf("%s 나라는 없습니다\n", input);
        }
    }
}
