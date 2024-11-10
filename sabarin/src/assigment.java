import java.util.Scanner;

public class assigment {
    public static void main(String[] args) {
        int num= (int)(Math.random()*10);

        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        int user= input.nextInt();
        if(num==user){
            System.out.println("your guess" + user + "=" +num );
    } else if (num>user) {
            System.out.println(" your guess is less than  "+ num);
        }
        else {
            System.out.println("your guess is high than " + num);
        }
        System.out.println("the generate number  is " + num);
    }}