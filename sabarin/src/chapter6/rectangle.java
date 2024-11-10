package chapter6;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter radius");
        double radius=input.nextDouble();
        System.out.println("the area of circle is  "+rect(radius));

    }

    public static double rect(double radius ){
        return radius*radius*3.14159;
    }

}
