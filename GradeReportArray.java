
/**
 * This file reads in assignments names and scores using an Array list. Then, the file sorts the 
 * data based on assignment name or score of project. 
 *
 * @summary  GradeReportArray
 * @author Ainsley Pyle
 *
 * Created at     : 2023-09-18 11:53:42 
 * Last modified  : 2023-09-18 13:17:18
 */

import java.util.ArrayList;
import java.util.Scanner;


//Assignment data type class.
class Assignment {
    String name;
    int score;
}


//GradeReportArray class
public class GradeReportArray {
    public static void processAssignments(int numAssignments) {
        Scanner scan = new Scanner(System.in);
        int scoreSum = 0;


        //Collection initialization and filling the collection
        ArrayList<Assignment> assignments = new ArrayList<Assignment>();
        int collectionSize = 3;
        for (int i = 0; i < collectionSize; i++) {
            Assignment x = new Assignment();
            System.out.print("Enter Assignment Name: ");
            x.name = scan.nextLine();

            String temp;
            System.out.print("Assignment Score: ");
            temp = scan.nextLine();
            x.score = Integer.parseInt(temp);

            assignments.add(x);
        }


        //Sorting the assignments by name 
        System.out.println("Sort by name");
        assignments
                .sort((Assignment assignment1, Assignment assignment2) -> assignment1.name.compareTo(assignment2.name));
        for (Assignment assignment : assignments) {
            System.out.println("Assignment: " + assignment.name + " Score: " + assignment.score);
        }


        //Sorting the assignment by score
        System.out.println("Sort by score");
        assignments.sort((Assignment assignment1, Assignment assignment2) -> Integer.valueOf(assignment1.score)
                .compareTo(Integer.valueOf(assignment2.score)));
        for (Assignment assignment : assignments) {
            System.out.println("Assignment: " + assignment.name + " Score: " + assignment.score);
        }
        scan.close();

    }

    public static void main(String args[]) {
        processAssignments(3);
    }
}
