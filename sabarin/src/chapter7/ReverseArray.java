package chapter7;

public class ReverseArray {
    public static void main(String[] args) {
        ///ans4 reversed array
        int[] array = {1, 2, 3, 4, 5};


        for (int g : array) {
            System.out.println(g);

        }}
        public static void reverseArray( int [] arr){
            // Swap elements at start and end index
            for (int i = 0; i < arr.length / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }

        }


}

