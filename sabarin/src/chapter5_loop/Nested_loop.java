package chapter5_loop;

public class Nested_loop {
    public static void main(String[] args) {
            for (int f=1 ; f<10;f++ ) {
                System.out.println(" ");
                for (int s = 0; s < 10; s++) {
                    System.out.printf("%d * %d = %d \n", s, f, s * f);
                }


            }}}
