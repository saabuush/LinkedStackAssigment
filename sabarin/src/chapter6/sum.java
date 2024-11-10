package chapter6;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= input.nextInt();
        System.out.println("enter number 2");
        int num2= input.nextInt();
        System.out.println(sum_numbers(num1,num2));

    }
    public static int sum_numbers(int num1,int num2){

        return num1+num2;

    }
}
