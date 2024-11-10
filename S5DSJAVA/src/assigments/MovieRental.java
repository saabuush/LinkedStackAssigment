package assigments;

public class MovieRental {
    //VARIABLES
    String rental_id ,customer_name ,movie_title;
    int daysRented;
    float cost_perDay=1;
    float totalCost=daysRented*cost_perDay;

    //constructor
    MovieRental(String id ,String name , String title , int dayRented ){
        rental_id=id;
        customer_name=name;
        movie_title=title;
        daysRented=dayRented;
        totalCost++;

    }
    // method
    void ExtendedRental(int extra_days){
        daysRented+=extra_days;
        totalCost++;
        System.out.println(extra_days  + " " + totalCost + " " + daysRented );

    }
    void return_movie(){
        daysRented=0;
        totalCost=0;


    }
    void apply_late_fee( int days_late , float late_fee_days){
        days_late+=daysRented;
        late_fee_days+=cost_perDay;
        System.out.println("the days and  cost are"+daysRented+" "+" "+cost_perDay);


    }

    public static void main(String[] args) {
        MovieRental costumer1 = new MovieRental("c1220165","sabrina",
                "titanic",6);
        System.out.println("the costumer1 is"+costumer1.totalCost);
        







    }


}
