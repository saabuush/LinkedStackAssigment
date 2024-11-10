import java.util.Scanner;

public class forAndWhile {
    public static void main(String[] args) {

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        int incorrect=0;
        System.out.println("what is"+num1 + "+"+ num2+"?");
        Scanner input=new Scanner(System.in);
        int ans=input.nextInt();
        while (num1+num2!=ans) {
            incorrect++;
            System.out.printf("your answer is incorect \n what is %d+%d ", num1,num2);
            ans=input.nextInt();
        }
        System.out.println("well done");
        System.out.printf("your made %d tries",incorrect);



    }}