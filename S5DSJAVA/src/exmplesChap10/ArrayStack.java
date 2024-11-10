package exmplesChap10;

import assigments.Exam_Result;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack <T>{

    private  final  static int DEFAULT_CAPACITY =2;
    private int Top;
    private T[] stack;
    ArrayStack(){
    this(DEFAULT_CAPACITY);}

    public ArrayStack(int initialCapacity){
        Top=0;
        stack=(T[]) new Object[initialCapacity];
    }



    public void push(T element ){
        if(Size()==stack.length)
            ExpandCapacity();

        stack[Top]=element;
        Top++;

    }

    public void ExpandCapacity(){
        stack= Arrays.copyOf(stack,stack.length*2);
    }

    public int Size(){
        return Top;
    }


    public boolean IsEmpty(){
        return Top==0;
    }



    public T pop()
        throws EmptyStackException{
        Top--;
        T result=stack[Top];
        stack[Top] = null;
        return result;

        }


        public T peek()throws EmptyStackException{
        if (IsEmpty()) throw new EmptyStackException();

        return stack[Top-1];


        }

//get the capacity
    public int getCapacity() {
        return stack.length;


    }
//is_full
    public boolean Is_full(){
        return Top==stack.length;


    }
//display
    public void display() {
        for (int i = Top-1; i>=0; i--) {

            System.out.println(stack[i]);

        }}



    public static void main(String[] args) {



        ArrayStack<String> arrayStack= new ArrayStack<>(3);
//        arrayStack.push("sabrina");
//        arrayStack.push("farhia");
//        arrayStack.push("maryan");
        System.out.println(arrayStack.Size());
        arrayStack.display();
        System.out.println(arrayStack.Top);
        arrayStack.peek();
        arrayStack.getCapacity();
        System.out.println(arrayStack.Is_full());

//        ArrayStack<String> last= new ArrayStack<>();
//        last.push("mire");
//        last.push("hassan");
//        last.push("xirsi");

//        ArrayStack<String>  full_name= new ArrayStack<>();
//        full_name.push(last+""+arrayStack);
//        System.out.println(full_name);





    }


}

