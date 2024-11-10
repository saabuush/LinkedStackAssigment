package chapter6;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number ");
        int num= input.nextInt();
        System.out.println(even_odds(num));


    }
    public static int even_odds(int number){
        if(number %2==0){
            System.out.println("the number is even");
        }
        else {
            System.out.println("the number is odd");
        }
        return number;
        }

    }


