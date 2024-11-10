package chapter6;

import java.util.Scanner;

public class my_information {
    public static void main(String[] args) {
        display();
    }

    public static void display(){
        Scanner input=new Scanner(System.in);

        System.out.println("enter your name");
        String name= input.nextLine();
        System.out.println("enter your age");
         int  age= input.nextInt();
        System.out.println("enter your tell");
        long tell= input.nextLong();

        System.out.printf("your name is %d and your age is %d and your tell is %d",
                name,age,tell);
    }
}
