package chapter7;

import java.util.Scanner;

public class assigm7 {
    public static void main(String[] args) {
     studet_regestion();

    }
public static void studet_regestion(){
    Scanner input = new Scanner(System.in);
    String[] student_id = new String[5];
    String[] student_name = new String[5];
        for (int i=0; i<student_id.length-1 ; i++) {
            System.out.println("enter your id" + (i + 1));
            student_id[i] = input.next();
            System.out.println("enter student name" + (i + 1));
            student_name[i] = input.next();

            String old_id = student_id[i];
            if (old_id.equals(student_id[i])) {
                System.out.println("this id already in" );
            }

//            for (int j=0; j==student_id[i].length();){
////                if (student_id[i]==j)
//                System.out.println("this id is already assigned");
//            }}



        }}}















