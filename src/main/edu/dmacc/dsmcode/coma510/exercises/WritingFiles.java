package edu.dmacc.dsmcode.coma510.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\COMA502\\code\\LectureNotesWeek06\\src\\main\\edu\\dmacc\\dsmcode\\coma510\\exercises\\names.txt");
        System.out.println(file.getAbsolutePath());
        Scanner input = new Scanner(file);

        PrintWriter writer = new PrintWriter(new File("C:\\COMA502\\code\\LectureNotesWeek06\\src\\main\\edu\\dmacc\\dsmcode\\coma510\\exercises\\output.txt"));
        while(input.hasNextLine()) {
            writer.println("Hello " + input.nextLine());
        }
        writer.close();
    }
}
