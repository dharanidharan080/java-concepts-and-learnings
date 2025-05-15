/*You are building a simple Java program for a school to process the marks of students in a subject. The school wants a tool that can:

Store marks for N students using an array.

Calculate:

Total marks

Average marks

Highest mark

Lowest mark

Display the list of all marks entered.

*/

import java.util.*;

public class Task3 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
        int[] marks = new int[n];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks for student " + (i + 1) + ":");
            marks[i] = s.nextInt();
        }

        int sum = 0;
        int highest = marks[0];
        int lowest = marks[0];

        for (int j = 0; j < marks.length; j++) {
            sum += marks[j];

            if (marks[j] > highest) {
                highest = marks[j];
            }
            if (marks[j] < lowest) {
                lowest = marks[j];
            }
        }

        double average = (double) sum / n;

        System.out.println("\nTotal: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}
