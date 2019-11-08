package edu.dmacc.dsmcode.coma510.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\COMA502\\code\\LectureNotesWeek06\\src\\main\\edu\\dmacc\\dsmcode\\coma510\\exercises\\names.txt");
        System.out.println(file.getAbsolutePath());
        Scanner input = new Scanner(file);
        while(input.hasNextLine()) {
            System.out.println("Hello " + input.nextLine());
        }
    }
}
