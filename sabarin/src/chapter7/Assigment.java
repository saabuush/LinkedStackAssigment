package chapter7;

public class Assigment {
    public static void main(String[] args) {

                //ans1 even and odd
                //  evenAndOdd();
//ans2 remove element
//                int target=6;
//        int index=0;
//     int[] evennumbers={2,4,6,8,10};
//     int[] newArray=new int[evennumbers.length-1];
//     for (int i=0;i<evennumbers.length;i++){
//         if (evennumbers[i]!=target){
//             newArray[index++]=evennumbers[i];
//         }
//     }
//        for (int j:newArray){
//            System.out.println(j);
//        }


                // ans3 insert element
//        int[] arr = {1, 2, 3, 4, 5};
//        int newElement = 6;
//        int position = 5;
//        insertElement(arr, position, newElement);

                ///ans4 reversed array
                int[] array={1,2,3,4,5};

                reverseArray(array);
                for (int g:array){
                    System.out.println(g);
                }
            }

// ans1 even and odd array
//    public static void evenAndOdd(){
//        int[] numArray=new int[4];
//        numArray[0]=1;
//        numArray[1]=2;
//        numArray[2]=3;
//        numArray[3]=4;
//        for (int i=0;i<numArray.length;i++){
//            if (numArray[i]%2==0){
//                System.out.println(numArray[i]+" is even");
//            }
//            else {
//                System.out.println(numArray[i]+" is odd");
//            }
//        }
//    }

            //answ3 Insert element
//    public static void insertElement(int[] arr, int pos, int newElement) {
//        int newArr[] = new int[arr.length + 1];
//        int j=0;
//        for (int i = 0; i < newArr.length; i++) {
//            if (i == pos) {
//                newArr[i] = newElement;
//            } else {
//                newArr[i] = arr[j];
//                j++;
//            }
//        }
//        System.out.println("this is original array");
//        for (int x:arr){
//
//            System.out.println(x);
//        }
//        System.out.println("this is new array");
//        for (int y:newArr){
//
//            System.out.println(y);
//        }

            //  }



            public static void reverseArray(int[] arr) {


                // Swap elements at start and end index
                for (int i = 0; i < arr.length / 2; i++) {
                    int temp = arr[i];
                    arr[i] = arr[arr.length - 1 - i];
                    arr[arr.length - 1 - i] = temp;
                }
            }}




