package com.company;

import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {

                ArrayDeque<Integer> stack = new ArrayDeque<>();
                stack.push(1);
                stack.push(2);
                stack.push(3);
                System.out.println(stack.peek());
                System.out.println(stack.pop());
                System.out.println(stack.peek());



            // write your code here
    }
}
