package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static CoffeeMachineState state = CoffeeMachineState.ON;
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int cash = 550;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (CoffeeMachine.state != CoffeeMachineState.OFF) {
            System.out.println("\n" + CoffeeMachine.state.getMessage());
            System.out.print("> ");
            CoffeeMachine.processInput(s.next());
        }
    }

    public static void processInput(String input) {
        switch (state) {
            case ON:
                chooseAction(input);
                break;
            case BUY:
                chooseCoffee(input);
                break;
            case FILL_WATER:
                fillWater(input);
                break;
            case FILL_MILK:
                fillMilk(input);
                break;
            case FILL_BEANS:
                fillBeans(input);
                break;
            case FILL_CUPS:
                fillCups(input);
                break;
        }
    }

    private static void chooseAction(String input) {
        switch (input) {
            case "buy":
                state = CoffeeMachineState.BUY;
                break;
            case "fill":
                state = CoffeeMachineState.FILL_WATER;
                break;
            case "take":
                takeMoney();
                break;
            case "remaining":
                printStatus();
                break;
            case "exit":
                state = CoffeeMachineState.OFF;
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private static void chooseCoffee(String input) {
        switch (input) {
            case "1":
                makeCoffee(CoffeeType.ESPRESSO);
                break;
            case "2":
                makeCoffee(CoffeeType.LATTE);
                break;
            case "3":
                makeCoffee(CoffeeType.CAPPUCCINO);
                break;
            case "back":
                state = CoffeeMachineState.ON;
                break;
            default:
                System.out.println("Unknown command");
        }
    }

    private static void makeCoffee(CoffeeType type) {
        if (water < type.getWater()) {
            System.out.println("Sorry, not enough water!");
        } else if (milk < type.getMilk()) {
            System.out.println("Sorry, not enough milk!");
        } else if (beans < type.getBeans()) {
            System.out.println("Sorry, not enough beans!");
        } else if (cups < type.getCups()) {
            System.out.println("Sorry, not enough cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= type.getWater();
            milk -= type.getMilk();
            beans -= type.getBeans();
            cups -= type.getCups();
            cash += type.getCost();
        }
        state = CoffeeMachineState.ON;
    }

    private static void fillWater(String input) {
        water += Integer.parseInt(input);
        state = CoffeeMachineState.FILL_MILK;
    }

    private static void fillMilk(String input) {
        milk += Integer.parseInt(input);
        state = CoffeeMachineState.FILL_BEANS;
    }

    private static void fillBeans(String input) {
        beans += Integer.parseInt(input);
        state = CoffeeMachineState.FILL_CUPS;
    }

    private static void fillCups(String input) {
        cups += Integer.parseInt(input);
        state = CoffeeMachineState.ON;
    }

    private static void takeMoney() {
        System.out.println("\nI gave you $" + cash);
        cash = 0;
    }

    private static void printStatus() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of beans");
        System.out.println(cups + " of cups");
        System.out.println(cash + " of money");
    }
}

enum CoffeeMachineState {
    ON("Write action (buy, fill, take, remaining, exit):"),
    BUY("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:"),
    FILL_WATER("Write how many ml of water do you want to add:"),
    FILL_MILK("Write how many ml of milk do you want to add:"),
    FILL_BEANS("Write how many grams of beans do you want to add:"),
    FILL_CUPS("Write how many disposable cups of coffee do you want to add:"),
    OFF("");

    private final String message;

    CoffeeMachineState(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

enum CoffeeType {
    ESPRESSO(250, 0, 16, 1, 4),
    LATTE(350, 75, 20, 1, 7),
    CAPPUCCINO(200, 100, 12, 1, 6);

    private final int water;
    private final int milk;
    private final int beans;
    private final int cups;
    private final int cost;

    CoffeeType(int water, int milk, int beans, int cups, int cost) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cups = cups;
        this.cost = cost;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCups() {
        return cups;
    }

    public int getCost() {
        return cost;
    }
}