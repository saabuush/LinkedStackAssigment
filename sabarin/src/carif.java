import java.util.Scanner;

public class carif {
    public static void main(String[] args) {
        //declare variable
        double carpri ;
        //create object scanner
        Scanner input=new Scanner(System.in);
        System.out.println("enter the price of car");
        carpri= input.nextDouble();
        //using if to check car price
        if (carpri>=3000){
            System.out.println("the price of is " + carpri);
        }
    }
}
