public class DiceGame {
    public static void main(String[] args) {
        playGame play = new playGame();
        play.gameStart();
    }
}

class playGame {
    int money = 1000;
    int appleCount;
    int shineMusketCount;
    int mandarinCount;
    int gameCount;
    int fruitCount;
    boolean gameRule = true;
    static Memento memento = new Memento();

    public playGame() {
    }

    public void gameStart() {
        while (gameRule) {
            checkDiceNumber(rollDice());
            System.out.println(Printer());
            if(forEndGame())break;
            isSavePoint(memento);
            loadSavePoint(memento);
            gameCount++;
        }
    }

    public int rollDice() {
        java.util.Random random = new java.util.Random();
        int dice = random.nextInt(6) + 1;
        return dice;
    }

    public void checkDiceNumber(int diceNumber) {
        if (diceNumber == 1 || diceNumber == 3) money += 100;
        else if (diceNumber == 2 || diceNumber == 4) money /= 2;
        else if (diceNumber == 6) {
            if (fruitCount % 3 == 0) {
                fruitCount++;
                appleCount++;
            } else if (fruitCount % 3 == 1) {
                fruitCount++;
                shineMusketCount++;
            } else if (fruitCount % 3 == 2) {
                fruitCount++;
                mandarinCount++;
            }
        }
    }

    public void isSavePoint(Memento memento) {
        if (this.money > memento.money) {
            memento.setMemento(money, appleCount, shineMusketCount, mandarinCount, gameCount, fruitCount);
        }
    }

    public void loadSavePoint(Memento memento) {
        if (memento.money / 2 > this.money) {
            money = memento.money;
            appleCount = memento.appleCount;
            shineMusketCount = memento.shineMusketCount;
            mandarinCount = memento.mandarinCount;
            gameCount = memento.gameCount;
            fruitCount = memento.fruitCount;
            System.out.println("!---memento 자산에 비해 2배 적어 save 시점으로 복구되었습니다---!");
        }

    }

    public boolean forEndGame() {
        if (gameCount == 99 || money == 0)return true;
        return false;
    }


    public String Printer() {
        return (gameCount + 1 + "번째 주사위가 던져졌습니다. \n" + "현재 Gamer 의 자산은 " + money + "원 사과 " + appleCount + "개 " +
                "샤인머스캣 " + shineMusketCount + "개 귤 " + mandarinCount + "개");
    }
}

class Memento {
    int money = 1000;
    int appleCount;
    int shineMusketCount;
    int mandarinCount;
    int gameCount;
    int fruitCount;

    public Memento() {
    }
    public void setMemento(int money, int appleCount, int shineMusketCount, int mandarinCount, int gameCount, int fruitCount) {
        this.money = money;
        this.appleCount = appleCount;
        this.shineMusketCount = shineMusketCount;
        this.mandarinCount = mandarinCount;
        this.gameCount = gameCount;
        this.fruitCount = fruitCount;
    }
}
