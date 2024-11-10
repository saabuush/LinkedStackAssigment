package ExamplesChap9;

public class circle {
    //variables
    double radius;

    //Constructors
    //->No argument constructor
    circle(){
        radius = 1.0;
    }
    //-> constructor with arguments
    circle(double newRadius){
        radius = newRadius;
    }

    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
    void setRadius(double value) {
        radius = value;
    }
    //create object from Circle class
    public static void main(String[] args) {

    circle myCircle = new circle();
    //myCircle.setRadius(10);
    //myCircle.radius = 10;
        System.out.println("Radius: " + myCircle.radius);
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("---------------------------");
    //create object2 from Circle class
    circle yourCircle = new circle(4);
        System.out.println("Radius: " + yourCircle.radius);
        System.out.println("Area: " + yourCircle.getArea());
}

}
