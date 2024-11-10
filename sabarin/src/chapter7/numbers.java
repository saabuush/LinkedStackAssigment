package chapter7;

import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        sums();

    }
    public static int sums() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the position you want");
        int position = input.nextInt();
        int[] numbers = new int[position];

        for(int i = 0; i <= numbers.length - 1; i++) {
            System.out.println("enter the numbers");

           numbers[i]= input.nextInt();

        }
        int sum=0;

           for (int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]+" ");
            sum+=numbers[i];
        }
        return sum;
        }
    }

