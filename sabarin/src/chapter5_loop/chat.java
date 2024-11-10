package chapter5_loop;

import java.util.Scanner;

public class chat {


    public static class StudentGrades {
        public static char calculateGrade(double averageMarks) {
            if (averageMarks >= 90) {
                return 'A';
            } else if (averageMarks >= 80) {
                return 'B';
            } else if (averageMarks >= 70) {
                return 'C';
            } else if (averageMarks >= 60) {
                return 'D';
            } else {
                return 'F';
            }
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int numStudents = input.nextInt();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = input.nextInt();

            for (int i = 0; i < numStudents; i++) {
                System.out.println("\nEntering marks for student " + (i + 1) + ":");
                double totalMarks = 0;

                for (int j = 0; j < numSubjects; j++) {
                    System.out.print("Enter marks for subject " + (j + 1) + ": ");
                    double marks = input.nextDouble();
                    totalMarks += marks;
                }

                double averageMarks = totalMarks / numSubjects;
                char grade = calculateGrade(averageMarks);

                System.out.println("\nTotal Marks for student " + (i + 1) + ": " + totalMarks);
                System.out.println("Average Marks for student " + (i + 1) + ": " + averageMarks);
                System.out.println("Grade for student " + (i + 1) + ": " + grade);
            }
        }
    }
}
