package edu.dmacc.dsmcode.coma510.review;

import java.util.Arrays;

public class AssignmentReviewProblem1 {

    /**
     * Write a main method that rotates the elements of an array by one position, moving the initial element to the end of the array.
     *
     * For example, if the array starts out as [1, 2, 3, 4, 5], then it should print out [2, 3, 4, 5, 1] at the end.
     *
     * Remember that you can print an array using System.out.println(Arrays.toString(numbers));
     */
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(numbers));

        int temp = numbers[0];
        for(int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        numbers[numbers.length - 1] = temp;

        System.out.println(Arrays.toString(numbers));
    }
}
