import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //declare variables
        String carname = "toyoto";
        String carmodel = "ab2008";
        double carprice;
        final int TAX = 65;
        //create object scanner
        System.out.println("the car name is " + carname);
        System.out.println("the car model is " + carmodel);
        Scanner input = new Scanner(System.in);
        System.out.println("enter the carprice ");
        carprice = input.nextDouble();
        double total = carprice + TAX;
        System.out.println("the car price is " + total);


    }
}
