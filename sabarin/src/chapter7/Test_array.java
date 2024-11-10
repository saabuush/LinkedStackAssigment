package chapter7;

public class Test_array {
    public static void main(String[] args) {

//        int [] my_list;
//        my_list=new int [10];
//        my_list[0]=7;
//        my_list[5]=9;
//        my_list[2]=4;
//        System.out.println(my_list[2]);

        int[] values=new int[5];
        for (int i=1; i<5; i++){
            values[i]=i+values[i-1];
        }
        values[0]=values[1]+values[4];


    }
}
