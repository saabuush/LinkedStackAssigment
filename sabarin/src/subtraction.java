import java.util.Scanner;

public class subtraction {
    public static void main(String[] args) {
        //declare variable
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("what is " + num1 + "-" + num2 + "?");
        //create object scanner
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        if (num1 - num2 == result) {
            System.out.println("you are correct");
        } else {
            System.out.println("you are not correct");
        }


    }}
