package chapter7;

import java.util.Scanner;

public class Array_evenOdd {
        public static void main(String[] args) {
            Scanner input=   new Scanner(System.in);
            System.out.println("enter array size");
            int size = input.nextInt();
            int [] arrayNumbers= new int[size];
            for (int i=0; i<arrayNumbers.length; i++){
                System.out.println("enter element" + (i+1));
                arrayNumbers[i] = input.nextInt();

            }
            for (int value:arrayNumbers){
                System.out.print(value+ " ");
            }

            oddEvenCounter(arrayNumbers);

        }
        public static void oddEvenCounter(int [] numbers){
            int evenCounter =0;
            int oddCounter =0;
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenCounter++;
                } else {
                    oddCounter++;
                }

            }
            System.out.println("\nthe even numbers in the list are: " + evenCounter);
            System.out.println("the odd numbers in the list are: " + oddCounter);

}


    }

