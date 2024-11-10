package chapter7;


public class RemoveElementArray {
    public static void main(String[] args) {

        int target=4;
        int index=0;
        int [] array= {2,4,6,8,10};
        int [] newArray=new int[array.length-1];

        for (int i=0;i<array.length-1; i++){
            if (array[i]!=target){
                newArray[index++]=array[i];

            }}
            for (int i:newArray){
                System.out.println(i);
            }




    }


}
