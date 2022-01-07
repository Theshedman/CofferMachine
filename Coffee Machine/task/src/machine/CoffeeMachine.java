package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final Scanner scanner = new Scanner(System.in);
    private static int WATER_QUANTITY = 400;
    private static int MILK_QUANTITY = 540;
    private static int BEANS_QUANTITY = 120;
    private static int COFFEE_CUPS = 9;
    private static int MONEY = 550;

    public static void main(String[] args) {
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String coffeeMenu = scanner.next();

            coffeeMenu(coffeeMenu);
        } while (true);
    }

    private static void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String option = scanner.next();

        switch (option) {
            case "1":
                makeEspressoCoffee();
                break;
            case "2":
                makeLatteCoffee();
                break;
            case "3":
                makeCappuccinoCoffee();
                break;
            case "back":
                coffeeMenu("");
                break;
        }

        System.out.println();
    }

    private static void checkResources(int water, int beans) throws Exception {
        if (WATER_QUANTITY < water) {
            throw new Exception("Sorry, not enough water!");
        }

        if (BEANS_QUANTITY < beans) {
            throw new Exception("Sorry, not enough coffee beans!");
        }

        System.out.println("I have enough resources, making you a coffee!");
    }

    private static void checkResources(int water, int milk, int beans) throws Exception {
        if (WATER_QUANTITY < water) {
            throw new Exception("Sorry, not enough water!");
        }

        if (BEANS_QUANTITY < beans) {
            throw new Exception("Sorry, not enough coffee beans!");
        }

        if (MILK_QUANTITY < milk) {
            throw new Exception("Sorry, not enough milk!");
        }

        System.out.println("I have enough resources, making you a coffee!");
    }

    private static void makeEspressoCoffee() {
        final int WATER = 250;
        final int BEANS = 16;
        final int COST = 4;

        try {
            checkResources(WATER, BEANS);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return;
        }

        MONEY += COST;
        WATER_QUANTITY -= WATER;
        BEANS_QUANTITY -= BEANS;
        COFFEE_CUPS -= 1;
    }

    private static void makeLatteCoffee() {
        final int WATER = 350;
        final int MILK = 75;
        final int BEANS = 20;
        final int COST = 7;

        try {
            checkResources(WATER, MILK, BEANS);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return;
        }

        MONEY += COST;
        WATER_QUANTITY -= WATER;
        MILK_QUANTITY -= MILK;
        BEANS_QUANTITY -= BEANS;
        COFFEE_CUPS -= 1;
    }

    private static void makeCappuccinoCoffee() {
        final int WATER = 200;
        final int MILK = 100;
        final int BEANS = 12;
        final int COST = 6;

        try {
            checkResources(WATER, MILK, BEANS);
        } catch (Exception e) {
            System.out.println(e.getMessage());

            return;
        }

        MONEY += COST;
        WATER_QUANTITY -= WATER;
        MILK_QUANTITY -= MILK;
        BEANS_QUANTITY -= BEANS;
        COFFEE_CUPS -= 1;
    }

    private static void fillCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        int beans = scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int coffeeCups = scanner.nextInt();

        System.out.println();

        WATER_QUANTITY += water;
        MILK_QUANTITY += milk;
        BEANS_QUANTITY += beans;
        COFFEE_CUPS += coffeeCups;

    }

    private static void takeCoffee() {
        System.out.printf("I gave you $%d%n%n", MONEY);

        MONEY = 0;
    }

    private static void getCoffeeState() {
        System.out.printf("" +
            "The coffee machine has:%n" +
            "%d ml of water%n" +
            "%d ml of milk%n" +
            "%d g of coffee beans%n" +
            "%d disposable cups%n" +
            "$%d of money%n%n",

            WATER_QUANTITY,
            MILK_QUANTITY,
            BEANS_QUANTITY,
            COFFEE_CUPS,
            MONEY
        );
    }

    private static void coffeeMenu(String mainMenu) {
        switch (mainMenu.toLowerCase()) {
            case "buy":
                buyCoffee();
                break;
            case "fill":
                fillCoffee();
                break;
            case "take":
                takeCoffee();
                break;
            case "remaining":
                getCoffeeState();
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                break;
        }
    }
}
