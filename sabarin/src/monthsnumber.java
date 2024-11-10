import java.util.Scanner;

public class monthsnumber {
        public static void main(String[] args) {
            //create scanner object
            Scanner input = new Scanner(System.in);
            //create variable to store the month number entered by the user
            int month;
            //what we display to the user
            System.out.print("Enter the number of the month (1-12): ");
            month = input.nextInt();
            // create variable to store the number of days in the month
            int days = 0;
            //using switch to make decision
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    days = 31;break;
                case 4, 6, 9, 11:
                    days = 30;break;
                case 2:
                    //we use to take decision 28 or 29
                    System.out.print("Enter the year: ");
                    int year = input.nextInt();
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }break;
                default: System.out.println("Error: Invalid month entered.");break;
            }
            // Display the number of days
            if (days != 0) {
                System.out.println("Number of days in the month: " + days);
}
    }






    }




