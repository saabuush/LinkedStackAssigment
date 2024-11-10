import java.util.Scanner;

public class meetday {
    public static void main(String[] args) {
        //declare variables
        int dayofweek, meetday;
        final int WEEKDAYS=7;
        //create object scaneer
        Scanner input= new Scanner (System.in);
        System.out.println("enter day of the week");
        dayofweek=input.nextInt();
        // calculate day meet
        meetday=(dayofweek+10)%WEEKDAYS;
        System.out.println("the of meeting is "+meetday);


    }
}
