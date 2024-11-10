package chapter5_loop;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of employee");
        int num_employee= input.nextInt();

        System.out.println("enter the weeks of wrok employee");
        int week= input.nextInt();

        for(int i=0;i<num_employee;i++){
            System.out.println("enter the the employee"+(i+1)+":");
            for (int s=0 ;s<week;s++) {
                System.out.println("enter the number week" + (s + 1) + ":");
                System.out.println("hours of work");
                double hours = input.nextDouble();

                if(hours<=40) {
                    System.out.println("your salary of week " + "is" + 40 * 15.00);
                }
                else {
                    System.out.println("your salary of week "+"is"+40*15.00+(hours-40)*22.50);

                }
            }



        }}

    }

