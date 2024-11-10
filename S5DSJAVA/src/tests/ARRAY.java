package tests;

import java.util.Arrays;

public class ARRAY<T>{

    private final T[] First_name;
    private final T[] Last_name;


    public ARRAY(T[] first_N, T[] last_N){
        First_name=first_N;
        Last_name=last_N;

    }

    public String[] Full_name(){
       String[] Full_name=new String[First_name.length];
       for (int i=0; i<First_name.length; i++){
            Full_name[i]=First_name[i]+" "+Last_name[i];
       }
       return Full_name;

    }



    public static void main(String[] args) {
        String[] First_name ={"sabrina","farhia","Rihaam"};
        String[] Last_name ={"Abukar","Abdulle","Hassan"};
        ARRAY<String> full_name = new ARRAY<>(First_name, Last_name);
        String[] Full_name=full_name.Full_name();


//        for (String name:Full_name){
//            System.out.println(name);

        System.out.println(Arrays.toString(Full_name));

        }
    }





