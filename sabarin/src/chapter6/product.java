package chapter6;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= input.nextInt();
        System.out.println("enter number 2");
        int num2= input.nextInt();
        System.out.println(pro(num1,num2));
    }
    public static int pro(int num1,int num2){
        return num1*num2;
    }

}
