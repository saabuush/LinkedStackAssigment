package exmplesChap10;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println("Original stack"+s1.toString());
        int Top = s1.peek();
        System.out.println("Top element "+Top);
        System.out.println("Stack after accessing top element "+s1);
        int out=s1.pop();
        System.out.println("Removed element "+out);
        System.out.println("stack after pop operation " +s1);

    }
}
