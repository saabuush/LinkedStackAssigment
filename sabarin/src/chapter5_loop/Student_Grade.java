package chapter5_loop;

import java.util.Scanner;

public class Student_Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter number of student");
         int NumStudents= input.nextInt();

        System.out.println("Enter number of subject in exam");
        int numberOfSubject= input.nextInt();
        double totalMarks = 0;

        for (int s = 0; s < NumStudents; s ++) {
            System.out.println("Enter marks for student " + (s + 1) + ":");


            for (int f= 0; f < numberOfSubject; f++) {
                System.out.print("Enter marks for subject " + (f + 1) + ": ");
                double marks = input.nextDouble();

                totalMarks += marks;
            }
            double averageMarks = totalMarks / numberOfSubject;

            System.out.println("Total Marks for student " + (s + 1) + ": " + totalMarks);
            System.out.println("Average Marks for student " + (s + 1) + ": " + averageMarks);


                if(averageMarks>90){
                    System.out.println("Grade A");
                } else if (averageMarks>80) {
                    System.out.println("Grade B");
                }
                else if (averageMarks>70) {
                    System.out.println("Grade C");
                }
                else if (averageMarks>60) {
                        System.out.println("Grade D");}
                else if (averageMarks>50) {
                    System.out.println("Grade E");}
                else {
                    System.out.println("Grade F");
                }






                }





            }



        }




