import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        //declare variable
        int num1=(int) (System.currentTimeMillis()%10);
        int num2=(int) (System.currentTimeMillis() /10 %10);
        System.out.println("what is "+num1 +"+"+ num2+"?");
        //create object scanner
        Scanner input=new Scanner(System.in);
        int result= input.nextInt();

        System.out.println(num1 + " + " +num2 +" = "+ result + " is "+(num1+num2==result));
    }
}
