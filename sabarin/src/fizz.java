import java.util.Scanner;

public class fizz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //create variable to store the number
        int number;
        //what we display the user
        System.out.print("enter the number :");
        number = input.nextInt();
        //I use if condition to take decision
        if (number<=0){
            System.out.println("please enter number greater 0");
        }
        if (number%5==0 && number%3==0){
            System.out.println("it's fizzbuzz");

        } else if (number%5==0) {
            System.out.println("it's buzz");

        } else if (number%3==0) {
            System.out.println("it's fizz");

        }
        else {
            System.out.println("the number can't divisible 5 and 3");
        }


    }

}