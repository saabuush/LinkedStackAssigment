package tests;

public class limitedstack<T> {

        private Node<T> top;
        private int size;
        private int limit;

        // Constructor to initialize the stack with a size limit
        public limitedstack(int limit) {
            this.top = null;
            this.size = 0;
            this.limit = limit;
        }

        // Method to check if the stack is full
        public boolean isFull() {
            return size == limit;
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return size == 0;
        }

        // Method to push an element onto the stack
        public boolean push(T value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push new element.");
                return false;
            }
            Node<T> newNode = new Node<>(value);
            newNode.next = top;
            top = newNode;
            size++;
            return true;
        }

        // Method to pop an element from the stack
        public T pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return null;
            }
            T poppedValue = top.value;
            top = top.next;
            size--;
            return poppedValue;
        }

        // Method to peek at the top element of the stack
        public T peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return null;
            }
            return top.value;
        }

        // Inner class for a linked list node
        private static class Node<T> {
            T value;
            Node<T> next;

            Node(T value) {
                this.value = value;
                this.next = null;
            }
        }

        // Method to get the current size of the stack
        public int getSize() {
            return size;
        }
    }

