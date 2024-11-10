import java.util.Scanner;

public class month {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("enter the number of months");
            int months = input.nextInt();
            if (months == 1) {
                System.out.println("it is january");

            } else if (months == 2) {
                System.out.println("it is february");

            } else if (months == 3) {
                System.out.println("it is march");

            } else if (months == 4) {
                System.out.println("it is abril");

            } else if (months == 5) {
                System.out.println("it is may");
            } else if (months == 6)
                System.out.println("it is june");

            else if(months==7 ){
                System.out.print("it is july");

            }  else if(months==8 ) {
                System.out.print("it is Aug");

            }else if(months==9 ){
                System.out.print("it is september");

            }else if(months==10 ){
                System.out.print("it is october");

            }else if(months==11 ){
                System.out.print("it is november");

            }else if (months==12 ){
                System.out.print("it is december");


            }
            else {

                System.out.println("that months is no valid");

            }
        }
    }





