import java.util.Scanner;

public class bodymassindex {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double bmi=input.nextDouble();
        if (bmi<=18.5){
            System.out.println("underweight");

        } else if (bmi<25.0) {
            System.out.println("normal");

        } else if (bmi<=30.0) {
            System.out.println("overweight");

        }
        else {
            System.out.println("obesa");
        }
    }
}
