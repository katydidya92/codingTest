package com.example.codingtest.dataStructure;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Stack;

public class StackTest<T> {

    @Test
    void stackTest() {
        Stack<Integer> stackList = new Stack<>();
        stackList.push(1);
        stackList.push(2);
        System.out.println(stackList);

        stackList.pop();
        System.out.println(stackList);

        stackList.push(1);
        System.out.println(stackList);

        System.out.println("========================");

        StackTest<Integer> myStack = new StackTest<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

    private ArrayList<T> arrayList = new ArrayList<>();

    public void push(T item) {
        arrayList.add(item);
    }

    public T pop() {
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.remove(arrayList.size() - 1);
    }
}
