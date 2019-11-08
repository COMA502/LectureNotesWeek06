package edu.dmacc.dsmcode.coma510.examples;

import java.io.FileNotFoundException;

public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException{
//        example1();
//        example2();
        try {
            example3();
        } catch(Exception e) {
            System.out.println("In catch in main");
        }
        System.out.println("End of main");
    }

    private static void example3() {
        try {
            badMethod();
            System.out.println("In try, after exception");
        } finally {
            System.out.println("In finally");
        }
        System.out.println("After try-finally");
    }

    private static void example2() throws FileNotFoundException {
        try {
//            badMethod();
            badFileMethod();
            System.out.println("In try, after exception");
        } catch(RuntimeException exception) {
            System.out.println("In catch");
        } finally {
            System.out.println("In finally");
        }
        System.out.println("After try-catch-finally");
    }

    private static void badFileMethod() throws FileNotFoundException {
        throw new FileNotFoundException("Uh oh, no file!");
    }

    private static void example1() {
        badMethod();
        System.out.println("After exception");
    }

    private static void badMethod() {
        throw new RuntimeException("Something really bad happened!");
    }
}
