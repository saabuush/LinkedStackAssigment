package chapter7;

import java.util.Random;
import java.util.Scanner;

public class examples {

        public static void main(String[] args) {
            //ex1//
            //printarry();//
            //ex2//
            //example2();//
            //EX4
            //example4();//
            //summing();//
            largest();



        }

        //example1//
    /*public static void printarry() {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 4;
        numbers[2] = 7;
        numbers[3] = 6;
        numbers[4] = 9;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }*/
        //ex2//
    /*public static void example2(){
        int[] values=new int[5];
        for (int i=1;i<5;i++){
            values[i]=i+values[i-1];
        }
        values[0]=values[1]+values[4];
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
    //ex3 initializing array with input values//
    /*public static void example3() {
        double[]mylist;

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("enter"+mylist.length+"values");
        for(int i=0; i< mylist.length;i++)
            mylist[i]=input.nextDouble();
    }*/
        //ex4//
    /*public static void example4(){
        double[]mylists=new double[5];
        for(int i=0;i<mylists.length;i++){
            mylists[i]=Math.random()*100;

        }
        for (int i=0;i<mylists.length;i++){
            System.out.println(mylists[i]+"");
        }
    }*/
        //ex5//
        public static void summing(){
            double total=0;
            double[]mylist={6,7,8,9,10};
            for (int i=0;i<mylist.length;i++){
                total+=mylist[i];
            }
            {
                System.out.println(total+"");
            }
        }
        //ex6 finding the largest number//
        public static void largest() {
            double []mylis={1,2,3,4,5,6};

            double max =mylis[3];
            for (int i=1;i<mylis.length;i++){
                if(mylis[i]>max)
                    max=mylis[i];
                System.out.println(mylis[i]+"");

            }





        }
    }


