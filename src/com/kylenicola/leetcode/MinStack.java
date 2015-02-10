package com.kylenicola.leetcode;

import java.util.Stack;

/**
 * Created by kyle on 2/9/15.
 */

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 */

/*
All operations should take O(1) time.
    Use two stacks.  stack works for all numbers while
    mins only takes into account the minimum numbers
     */
public class MinStack {
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> mins = new Stack<Integer>();

    public void push(int x) {
        if(mins.size() == 0 || mins.peek() >= x)
        {
            mins.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        int i = stack.pop();
        if(mins.peek() == i)
        {
            mins.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}

