package practical_lab;

public class Cars {
    //variables
    String Car_name;
    double Car_price;
    int Car_wheels;
    static int Total_cars;

    //constructor
    Cars( String name, double price, int wheels){
        Car_name = name;
        Car_price = price;
        Car_wheels = wheels;
        Total_cars++; // increment total cars after every object creation.

    }

    //methods
    //method display_details of the car
    void display_details(){
        System.out.println("Car details: " + Car_name + "  "
                + Car_price +"  "+ Car_wheels);
    }

    //method display_Total_cars
    public static void Display_totalCars(){

        System.out.println("Total cars: " + Total_cars);

    }

    public static void main(String[] args) {
        Cars car1 = new Cars("Corolla", 20000, 4);
        car1.display_details();
        Cars car2 = new Cars("BMW", 50000,4);
        car2.display_details();
        Cars.Display_totalCars(); // static method call
    }
}
