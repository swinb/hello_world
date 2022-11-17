package mission1;

public class Player {
    private PlayerLevel level;
    public Player(){
        level = new beginnerPlayer();
    }
    public void upgradeLevel(PlayerLevel playerLevel) {
        level = playerLevel;
    }
    public void getLevel(){
        level.showLevelMessage();
    }

    public void play(int time) {
        getLevel();
        level.go(time);

    }
}
abstract class PlayerLevel{
    private int level;

    abstract void run();

    abstract void jump();

    abstract void turn();

    abstract void showLevelMessage();

    void go(int count){
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }

}

class beginnerPlayer extends PlayerLevel {
    void run() {
        System.out.println("천천히 달립니다.");
    }

    void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
    void showLevelMessage(){
        System.out.println("현재 레벨은 BEGINNER 입니다");
    }
}

class advancedPlayer extends PlayerLevel {
    void run() {
        System.out.println("빨리 달립니다.");
    }

    void jump() {
        System.out.println("높이 jump 합니다.");
    }

    void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }
    void showLevelMessage(){
        System.out.println("현재 레벨은 ADVANCED 입니다");
    }
}

class superPlayer extends PlayerLevel{
    void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    void turn() {
        System.out.println("한 바퀴 돕니다.");
    }
    void showLevelMessage(){
        System.out.println("현재 레벨은 SUPER 입니다");
    }
}

