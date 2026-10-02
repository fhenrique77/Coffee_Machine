package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int cups = 9;
    static int money = 550;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String action = "";

        System.out.println("Hello, welcome to the coffee machine!");

        while (!action.equals("exit")) {

            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            action = scanner.next();

            switch (action) {

                case "buy":
                    buy(scanner);
                    break;

                case "fill":
                    fill(scanner);
                    break;

                case "take":
                    take();
                    break;

                case "remaining":
                    remaining();
                    break;

                case "exit":
                    System.out.println("\nGoodbye!");
                    break;

                default:
                    System.out.println("\nInvalid action. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    public static void remaining() {

        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void take() {

        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void fill(Scanner scanner) {

        System.out.println("Enter the amount of water to add: ");
        water += scanner.nextInt();

        System.out.println("Enter the amount of milk to add: ");
        milk += scanner.nextInt();

        System.out.println("Enter the amount of coffee beans to add: ");
        coffeeBeans += scanner.nextInt();

        System.out.println("Enter the amount of cups to add: ");
        cups += scanner.nextInt();
    }

    public static void buy(Scanner scanner) {

        System.out.println(
                "\nWrite the type of coffee you want to buy " +
                        "(1 - espresso, 2 - latte, 3 - cappuccino): "
        );

        int coffeeType = scanner.nextInt();

        if (coffeeType == 1) {

            if (water < 250) {
                System.out.println("Not enough water");
                return;
            }

            if (coffeeBeans < 16) {
                System.out.println("Not enough Coffee beans");
                return;
            }

            if (cups < 1) {
                System.out.println("Not enough cups");
                return;
            }

            water -= 250;
            coffeeBeans -= 16;
            money += 4;
            cups -= 1;

            System.out.println("I have made you an espresso!");

        } else if (coffeeType == 2) {

            if (water < 350) {
                System.out.println("Not enough water");
                return;
            }

            if (milk < 75) {
                System.out.println("Not enough milk");
                return;
            }

            if (coffeeBeans < 20) {
                System.out.println("Not enough Coffee beans");
                return;
            }

            if (cups < 1) {
                System.out.println("Not enough cups");
                return;
            }

            water -= 350;
            milk -= 75;
            coffeeBeans -= 20;
            money += 7;
            cups -= 1;

            System.out.println("I have made you a latte!");

        } else if (coffeeType == 3) {

            if (water < 200) {
                System.out.println("Not enough water");
                return;
            }

            if (milk < 100) {
                System.out.println("Not enough milk");
                return;
            }

            if (coffeeBeans < 12) {
                System.out.println("Not enough Coffee Beans");
                return;
            }

            if (cups < 1) {
                System.out.println("Not enough cups");
                return;
            }

            water -= 200;
            milk -= 100;
            coffeeBeans -= 12;
            money += 6;
            cups -= 1;

            System.out.println("I have made you a cappuccino!");
        }
    }
}