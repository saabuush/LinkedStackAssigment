package chapter6;

import java.util.Scanner;

public class difference {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= input.nextInt();
        System.out.println("enter number 2");
        int num2= input.nextInt();
        System.out.println(differences(num1,num2));

    }
    public static int differences(int num1,int num2){
        return num1-num2;
    }
}
