package exmplesChap10;

import java.util.Scanner;
import java.util.Stack;

public class StringBetter {

    public String Reverse_better(String input) {
        Stack<Character> stack = new Stack<>();
        for (char i : input.toCharArray()) {
            stack.push(i);
        }
        StringBetter reverse = new StringBetter();
        while (!stack.isEmpty())
            reverse.append(stack.pop());
        return reverse.toString();

}

    private void append(Character pop) {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        Reverse test = new Reverse();
        String Output=test.reverse(input.next());
        System.out.println("the result reversed "+Output);

    }
}
