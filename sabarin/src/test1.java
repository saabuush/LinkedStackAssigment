import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        input.next();
        System.out.println("enter number is sub");
        int num1=(int) (Math.random()*10);
        int num2=(int) (Math.random()*10);
        final int numofque=5;
        int correct=0;
        int incorrect=0;
        String output= "";
        int count=0;
        while (count<numofque){

            if (num2>num1){
                int tem=num1;
                num1=num2;
                num2=tem;
            }
            System.out.println("what is"+num1+"-"+num2+"?");
            int ans=input.nextInt();
            if (num1-num2==ans){
                System.out.println("your answer is the right");
                correct++;
            }
            else {
                System.out.println("your answer is wrong");
                incorrect++;
            }
            count++;
            output+="\n what is "+ num1+"-"+num2+"?"+ans+((num1-num2==ans)?"right":"wrong");

        }
        System.out.println("Number of correct answer is: "+correct);
        System.out.println("number of incorrect answer is "+incorrect);
        System.out.println(output);
    }
}
