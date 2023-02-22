package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ADSLinkedListTest {

    @Test
    void add() {
    }

    @Test
    void insert() {
        ADSLinkedList<Integer> linkedList = new ADSLinkedList();
        linkedList.insert(0, 1);
        linkedList.insert(0, 2);
        linkedList.insert(0, 3);

        assertEquals(3, linkedList.remove(0));
    }

    @Test
    void remove() {
        ADSLinkedList<Integer> linkedList = new ADSLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);


        assertEquals(3, linkedList.remove(2));
    }

    @Test
    void removeIndex0() {
        ADSLinkedList<Integer> linkedList = new ADSLinkedList();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.remove(0);
        linkedList.remove(0);
        assertEquals(3, linkedList.remove(0));

    }

}