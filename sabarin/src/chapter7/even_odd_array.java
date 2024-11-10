package chapter7;

import java.util.Scanner;

public class even_odd_array {
    public static void main(String[] args) {
        even_odd();

    }
    public static void even_odd(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the positions");
        int pos= input.nextInt();

        int[] even_odd =new int[pos];

        for(int i = 0; i <= even_odd.length - 1; i++) {
            System.out.println("enter the numbers");
            even_odd[i]= input.nextInt();

            if (even_odd[i] %2==0){
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }

        }

        }
    }

