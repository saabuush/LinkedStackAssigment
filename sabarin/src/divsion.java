import java.util.Scanner;

public class divsion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int number= input.nextInt();
        if (number % 2==0 && number%3==0)
        {
            System.out.println(number+"is divisible by 2 and 3");
        }
        else if (number % 2==0 || number %3==0 ) {
            System.out.println(number+" is divisible one of them");
        }
        else if (number%2==0 ^ number %3==0){
            System.out.println( number+"is  divisible ");

        }
    }
}
