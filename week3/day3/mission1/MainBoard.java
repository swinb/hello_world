package mission1;

public class MainBoard {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);
        player.upgradeLevel(new advancedPlayer());
        player.play(2);
        player.upgradeLevel(new superPlayer());
        player.play(3);
    }
}