import java.util.Scanner;

public class MeterToKilometer {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double meters,kilometers;
        System.out.print("enter distance in meters:");
        meters= Scanner.nextDouble();
        kilometers =meters /1000;
        System.out.println(meters + "meters is equal to" +  kilometers +  " kilometer");
    }

}

