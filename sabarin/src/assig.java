import java.util.Scanner;

public class assig {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the mathematical operators + , - ,/ ,*");
        String sign= input.next();
        System.out.println("enter num1");
        int num1=input.nextInt();
        System.out.println("enter num2");
        int num2= input.nextInt();

        switch (sign){
            case "+": System.out.println(num1+num2);break;
            case  "-": System.out.println(num1-num2);break;
            case  "*": System.out.println(num1*num2);break;
            case  "/": System.out.println(num1/num2);break;
            default:
                System.out.println("calamada ma jirto");
        }

    }
}
