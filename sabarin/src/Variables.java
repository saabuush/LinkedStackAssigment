import java.util.* ;

public class Variables {
    public static void main(String[] args) {
        //declare variables
        double raduis;
        double area;
        //create object from the scanner

        Scanner input=new Scanner(System.in);
        System.out.println("enter radius");
        raduis=input.nextDouble();
        //compute area of circle
        area=raduis*raduis*3.14159;
        System.out.println("area of circle is "+area);

    }
}
