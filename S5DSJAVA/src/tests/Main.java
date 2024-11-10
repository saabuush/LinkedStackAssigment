package tests;

public class Main {
        public static void main(String[] args) {
            limitedstack<Integer> stack = new limitedstack<>(3);

            // Test pushing values onto the stack
            System.out.println(stack.push(10));  // true
            System.out.println(stack.push(20));  // true
            System.out.println(stack.push(30));  // true
            System.out.println(stack.push(40));  // false, stack is full

            // Test popping values from the stack
            System.out.println(stack.pop());  // 30
            System.out.println(stack.pop());  // 20
            System.out.println(stack.pop());  // 10
            System.out.println(stack.pop());  // null, stack is empty
        }
    }
