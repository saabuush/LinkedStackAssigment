package exmplesChap10;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {

    public String  reverse(String input){
        Stack <Character>stack= new Stack<>();
        for (int i=0; i<input.length();i++)
            stack.push(input.charAt(i));
        StringBuilder Reversed= new StringBuilder();
        while (!stack.isEmpty())
            Reversed.append(stack.pop());
        return Reversed.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        Reverse test = new Reverse();
        String Output=test.reverse(input.next());
        System.out.println("the result reversed"+Output);

    }
}
