package tests;

import java.util.Scanner;

public class linkedTeach<T> {
        int count;
        Node<T> top ;  //head

        linkedTeach(){
            count = 0;
            top = null;
        }
        //operations
        //size
        int size(){return count;}
        //isempty
        boolean isEmpty(){
            return count == 0; // top == null;
        }

        //push
        void push(T element){
            Node<T> tempAddress = new Node<>(element);
            //System.out.println("temp address: " + tempAddress);
            tempAddress.setNext(top);
            top = tempAddress;
            count++;
        }

        //pop
        T pop(){
            if(isEmpty()){
                System.out.println("Empty Stack!");
                return null;
            }
            T removedElement = top.getElement();
            top = top.getNext();
            count--;
            return removedElement;
        }
        //peek
        T peek(){
            if(isEmpty()){
                System.out.println("Empty Stack!");
                return null;
            }
            return top.getElement();
        }
        //display linkedstack elements
        void display(){
            //if is empty
            if(isEmpty())
                System.out.println("Stack is empty!");
            else{
                Node<T> currentAddress = top;
                while (currentAddress != null){
                    System.out.println(currentAddress.getElement());
                    currentAddress = currentAddress.getNext();
                }
            }
        }
        //searchElement
        void searchElement(T data){
            boolean found = false;
            int counter = 0;
            if(isEmpty())
                System.out.println("Stack is empty!");
            else{
                Node<T> currentAddress = top;
                while (currentAddress != null){
                    if(data.equals(currentAddress.getElement())){
                        found = true;
                        counter++;
                    }
                    currentAddress = currentAddress.getNext();
                }
            }
            //display result
            if(!found)
                System.out.println("not found!");
            else
                System.out.println("found " + counter + " times");
        }

    public void reverse() {
        Node<T> prev = null;
        Node<T> current = top;
        Node<T> next = null;

        while (current != null) {
            // Save the next node
            next = current.getNext();

            // Reverse the current node's pointer
            current.setNext(prev);

            // Move pointers one step forward
            prev = current;
            current = next;
        }

        // Update the top to the new head of the reversed list
        top = prev;
    }



    //main method
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            linkedTeach<String> names = new linkedTeach<>();
            names.push("Ali");
            names.push("Ali");
            names.push("Gedi");
            names.push("Hawa");

            System.out.println("removed element : " + names.pop());
            System.out.println("top: " + names.peek() );
            System.out.println("size: " + names.size() );
            System.out.println("empty: " + names.isEmpty() );
            names.display();
            System.out.println("Enter name to search: ");
            String data = scanner.next();
            names.searchElement(data);
            System.out.println("original element");
            names.display();

            names.reverse();
            System.out.println("reverse element");
            names.display();
            names.pop();
            names.display();
        }
    }

