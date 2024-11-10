package chapter6;

import java.util.Scanner;
public class maxamum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= input.nextInt();
        System.out.println("enter number 2");
        int num2= input.nextInt();
        System.out.println(max(num1,num2));

    }
    public static int max( int num1,int num2){
        if(num1>num2){
            System.out.println("num1 is maximum");
        return num1;
        }
        else {
            System.out.println("num2 is maximum");
        }
        return num2;

    }

}
