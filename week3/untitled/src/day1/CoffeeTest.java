package day1;

class Coffee {
    String coffeeMenu;
    String somethingAdd = "";

    public Coffee() {
    }

    public void brewing() {
        System.out.printf("%s", coffeeMenu);
    }
}

class EthiopiaAmericano extends Coffee {
    public EthiopiaAmericano() {
        coffeeMenu = "EthiopiaAmericano";
    }

    public void brewing() {
        System.out.printf("%s", coffeeMenu);
    }
}

class KenyaAmericano extends Coffee {
    public KenyaAmericano() {
        coffeeMenu = "KenyaAmericano";
    }

    public void brewing() {
        System.out.printf("%s", coffeeMenu);
    }
}

class BrazilAmericano extends Coffee {
    public BrazilAmericano() {
        coffeeMenu = "BrazilAmericano";
    }

    public void brewing() {
        System.out.printf("%s", coffeeMenu);
    }
}

class HawaiiAmericano extends Coffee {
    public HawaiiAmericano() {
        coffeeMenu = "HawaiiAmericano";
    }

    public void brewing() {
        System.out.printf("%s", coffeeMenu);
    }
}

class Latte extends Coffee {
    public Latte(Coffee a) {
        coffeeMenu = a.coffeeMenu;
        somethingAdd = a.somethingAdd + "Adding Milk ";
    }

    public void brewing() {
        System.out.printf("%s %s", coffeeMenu, somethingAdd);
    }
}

class Mocha extends Coffee {
    public Mocha(Coffee a) {
        coffeeMenu = a.coffeeMenu;
        somethingAdd = a.somethingAdd + "Adding Mocha Syrup ";
    }

    public void brewing() {
        System.out.printf("%s %s", coffeeMenu, somethingAdd);
    }
}

class WhippedCream extends Coffee {
    public WhippedCream(Coffee a) {
        coffeeMenu = a.coffeeMenu;
        somethingAdd = a.somethingAdd + "Adding WhippedCream ";
    }

    public void brewing() {
        System.out.printf("%s %s", coffeeMenu, somethingAdd);
    }
}


public class CoffeeTest {

    public static void main(String[] args) {

        Coffee ethiopiaAmericano = new EthiopiaAmericano();
        ethiopiaAmericano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

        Coffee hawaiiWhippedMocha = new WhippedCream(new Mocha(new Latte(new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing();
        System.out.println();

    }
}

