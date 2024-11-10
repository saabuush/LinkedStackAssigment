package Chap4LinkedStack;

public class LinkedStack<T> {
    private int count ;
    private Node<T> Top;// head
    public LinkedStack(){
        count = 0;
        Top=null;
    }
    public  boolean isEmpty(){
        return count==0;
    }
    public int Size(){
        return count;
    }
    public void push(T element) {
        Node<T>temp = new Node<>(element);
        temp.setNext(Top);
        Top=temp;
        count++;
    }
    public T pop() {
        if (isEmpty()){
            System.out.println("Empty stack");
            return null;
        }
        T poppedElement = Top.getElement();
        Top = Top.getNext();
        count--;
        return poppedElement;
    }
    public T peek(){
        if (isEmpty()){
            System.out.println("Empty stack");
            return null;
    }
        return Top.getElement();
    }
    public void printStack(){
        if (isEmpty()) {
            System.out.println("Empty stack");
        }else {
            Node<T> current = Top;
            while (current!=null){
                System.out.println(current.getElement());
                current=current.getNext();
            }
        }}
        public boolean SearchElements(T element){
            boolean found = false;
     if (isEmpty()){
         System.out.println("Empty stack");
     }else {
          Node<T> current = Top;
        while (current!=null){
            if (element.equals(current.getElement())){
                found = true;
                current=current.getNext();
            }}
    }
            return found;
        }
        public int counter(T data ) {
            Node<T> current = Top;
            int number = 0;
            while (current != null) {
                if (data.equals(current.getElement())) {
                    number++;
                    current = current.getNext();
                }

            }
            return number;
        }
    public void removeMiddleElements() {
        if (isEmpty()) {
            System.out.println("Empty stack");
        }else if (Top.getNext()!=null && Top.getNext().getNext()==null) {
                System.out.println("Stack only has Top and Bottom elements");
            }
        else {
        Node<T> current = Top;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        Top.setNext(current.getNext());
        count = 2;
    }}

    public static void main(String[] args) {
        LinkedStack<String>  Names = new LinkedStack<>();
        Names.push("Sabrina");
        Names.push("Farah");
        Names.push("Rihana");
        Names.push("Sara");
        Names.push("lara");

        System.out.println("stack before delete middle elements");
        Names.printStack();
        System.out.println("stack after delete middle elements");
        Names.removeMiddleElements();
        Names.printStack();


//        System.out.println("Top element: "+Names.peek());
//        System.out.println("Popped element: "+Names.pop());
//        System.out.println("Stack size: "+Names.Size());
//        Names.printStack();
//        System.out.println(Names.SearchElements("Sabrina"));
//        System.out.println(Names.counter("Farah"));
    }


}
