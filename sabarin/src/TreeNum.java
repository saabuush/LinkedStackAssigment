import java.util.Scanner;

public class TreeNum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("enter the number 1:");
        num1 = input.nextInt();
        System.out.print("enter the number 2:");
        num2 = input.nextInt();
        System.out.print("enter the number 2:");
        num3 = input.nextInt();
        if (num1 > num2 & num1 > num3)

            System.out.print("the gretest number is" + num1);
        else if (num2 > num1 & num2 > num3)
            System.out.print("the gretest number is" + num2);
        else
            System.out.print("the gretest number is" + num3);
    }
}