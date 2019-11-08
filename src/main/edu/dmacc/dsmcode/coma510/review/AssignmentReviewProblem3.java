package edu.dmacc.dsmcode.coma510.review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AssignmentReviewProblem3 {

    /**
     * Write a main method that
     * 1. Creates a menu of food names and their prices
     * 2. A order of food names
     * 3. For each food the menu doesn't have, print "We don't have any " + the name of the food
     * 4. Prints the total cost of the order
     *
     * For example, if the
     * * Menu is $2 burger, $0.75 fries, $1 pop, $2.50 shake, $3 salad
     * * Order is burger, shake, fries, fries, yogurt
     * Output should be
     *    "We don't have any yogurt"
     *    "Total: $6.00"
     */
    public static void main(String[] args) {
        HashMap<String, Double> menu = new HashMap<>();
        menu.put("burger", 2.0);
        menu.put("fries", 0.75);
        menu.put("pop", 1.0);
        menu.put("shake", 2.5);
        menu.put("salad", 3.0);

        ArrayList<String> order = new ArrayList<>();
//        order.add("burger");
//        order.add("shake");
//        order.add("fries");
//        order.add("fries");
//        order.add("yogurt");
        Scanner input = new Scanner(System.in);
        String item = input.next();
        while(!item.equals("done")) {
            order.add(item);
            item = input.next();
        }

        System.out.printf("Your total is $%.2f\n", getTotal(menu, order));
    }

    private static double getTotal(HashMap<String, Double> menu, ArrayList<String> order) {
        double total = 0;
        for(String item : order) {
            if(menu.containsKey(item)) {
                total += menu.get(item);
            } else {
                System.out.println("Sorry we don't have " + item);
            }
        }
        return total;
    }
}
