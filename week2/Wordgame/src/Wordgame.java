import java.util.Scanner;


public class Problem4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int turn = 0;

        Printer.startGame();

        Printer.askPlayerNum();
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] players = Player.getPlayers(n);
        Printer.startWord();

        char chain = Controller.getChain("기러기");
        Controller.playTurn(players, chain, turn);
    }
}

class Controller {
    static Scanner scanner = new Scanner(System.in);

    // 차례 진행
    public static void playTurn(String[] players, char chain, int turn) {
        String player = players[turn % players.length];
        // 참가자 단어 입력
        Printer.alertTurn(player);
        String playerWord = scanner.nextLine();
        // 참가자 단어 체크
        if (!isChain(playerWord, chain) || !checkLength(playerWord)) {
            Printer.endGame(player);
        } else {
            playTurn(players, getChain(playerWord), turn+1);
        }
    }

    // 참가자 단어 입력받은 값 가공
    public static char getChain(String sentence){
        char lastChar = sentence.charAt(sentence.length()-1);
        return lastChar;
    }

    public static boolean checkLength (String word) {
        boolean result = false;
        if (word.length() >= 2) result = true;
        return result;
    }

    public static boolean isChain (String word, char beforeLastLetter) {
        boolean result = false;
        if (beforeLastLetter == word.charAt(0)) result = true;
        return result;
    }
}

class Player {
    static Scanner scanner;

    // 플레이어 입력 함수
    public static String[] getPlayers(int n) {
        scanner = new Scanner(System.in);
        String[] players = new String[n];
        for (int i=0; i<n; i++) {
            System.out.print("참가자 이름을 입력해주세요. >> ");
            players[i] = scanner.nextLine().trim();
        }
        return players;
    }

}

class Printer {
    static String startWord = "기러기";
    public static void startGame() {
        System.out.println("끝말잇기 게임을 시작합니다!!");
    }
    public static void askPlayerNum(){
        System.out.print("게임에 참여하는 인원은 몇 명입니까 >>");
    }
    public static void startWord() {
        System.out.println("시작 단어는 "+ startWord +"입니다.");
    }
    public static void alertTurn(String player) {
        System.out.print(player+">> ");
    }
    public static void endGame(String player) {
        System.out.println(player+"이 졌습니다.");
    }
}