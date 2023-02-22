package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ADSLinkedListStackTest {

    @Test
    void isEmpty() {
        ADSLinkedListStack<Integer> listStack = new ADSLinkedListStack<>();
        listStack.push(1);
        listStack.push(2);

        assertFalse(listStack.isEmpty());
    }

    @Test
    void pop() {
        ADSLinkedListStack<Integer> listStack = new ADSLinkedListStack<>();
        listStack.push(1);
        listStack.push(2);

        listStack.pop();
        assertEquals(1, listStack.pop());
    }

    @Test
    void push() {
        ADSLinkedListStack<Integer> listStack = new ADSLinkedListStack<>();
        listStack.push(1);
        listStack.push(2);


    }
}