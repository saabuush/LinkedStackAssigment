import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter the number of the day");
        int days=input.nextInt();
        switch (days){
            case 1 : System.out.println("sat");break;
            case 2: System.out.println("sun");break;
            case 3 : System.out.println("mon");break;
            case 4: System.out.println("thurs");break;
            case 5: System.out.println("wed");break;
            case 6 : System.out.println("thur");break;
            case 7: System.out.println("fri");
            default: System.out.println("maalin jirto ma ahan");


        }
    }
}
