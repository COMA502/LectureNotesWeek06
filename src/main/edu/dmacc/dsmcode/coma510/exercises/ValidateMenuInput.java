package edu.dmacc.dsmcode.coma510.exercises;

import java.util.HashMap;
import java.util.Scanner;

public class ValidateMenuInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> menu = new HashMap<>();

        String food = getFood(input);
        while(!food.equals("done")) {
            double price = getValidPrice(input);
            menu.put(food, price);

            food = getFood(input);
        }

//        System.out.println(food + String.format(" $%.2f", price));
        printMenu(menu);
    }

    private static void printMenu(HashMap<String, Double> menu) {
        for(String item : menu.keySet()) {
            System.out.printf("%s $%.2f\n", item, menu.get(item));
        }
    }

    private static double getValidPrice(Scanner input) {
        boolean validPrice = false;
        double price = 0;
        while (!validPrice) {
            try {
                System.out.println("Price? ");
                price = input.nextDouble();
                validPrice = true;
            } catch (Exception e) {
                System.out.println("Not a valid price");
                validPrice = false;
                input.next();//clear out previous value
            }
        }
        return price;
    }

    private static String getFood(Scanner input) {
        System.out.println("Food? ");
        String food = input.next();
        return food;
    }
}
