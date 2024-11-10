import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        //declare variables
        double number1,number2,number3;
        //create object scnner
        Scanner input=new Scanner(System.in);
        System.out.println("enter number1");
        number1=input.nextDouble();
        System.out.println("enter number2");
        number2=input.nextDouble();
        System.out.println("enter number3");
        number3=input.nextDouble();
        double average=(number1+number2+number3)/3;
        System.out.println("the average of three numbers is "+average);





    }
}
