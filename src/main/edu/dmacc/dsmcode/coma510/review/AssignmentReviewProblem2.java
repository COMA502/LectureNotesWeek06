package edu.dmacc.dsmcode.coma510.review;

import java.util.ArrayList;
import java.util.Iterator;

public class AssignmentReviewProblem2 {

    /**
     * Write a main method that removes all negative values from an ArrayList, preserving the order of the remaining elements.
     *
     * For example, if the list starts out as [-1, 2, 3, -4, -5], then it should print out [2, 3] at the end.
     *
     * Remember that you can print a list using System.out.println(numbers);
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(-4);
        numbers.add(-5);
        System.out.println(numbers);

        //Causes a ConcurrentModificationException removing in a foreach loop
//        for(int i = 0; i < numbers.size(); i++) {
//            if(i < 0) {
//                numbers.remove(i);
//            }
//        }

        //Valid solution, but tricky to get right
//        for(int i = 0; i < numbers.size(); i++) {
//            if(numbers.get(i) < 0) {
//                numbers.remove(i);
//                i--;//If you forget this, you're left with [2, 3, -5]...
//            }
//        }

        //Another valid solution
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if(next < 0) {
//                numbers.remove(next);//Causes ConcurrentModificationException
                iterator.remove();//This does it the correct way behind the scenes!
            }
        }

        System.out.println(numbers);
    }
}
