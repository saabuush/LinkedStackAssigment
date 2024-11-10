import java.util.Scanner;

public class days {

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("enter  the day name");
            String days=input.next();
            switch (days){
                case "sat": System.out.println("day 1");break;
                case "sun": System.out.println("day 2");break;
                case "mon": System.out.println("day 3");break;
                case "thurs": System.out.println("day 4");break;
                case "wed": System.out.println("day 5");break;
                case "thur": System.out.println("day 6");break;
                case "fri": System.out.println("day 7");
                default: System.out.println("maalin jirto ma ahan");


            }
        }
    }


