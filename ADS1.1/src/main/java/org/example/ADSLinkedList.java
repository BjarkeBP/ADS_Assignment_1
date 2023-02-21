package org.example;

public class ADSLinkedList<T> implements ADSListADT<T> {

    private Node<T> first;
    private int size;

    public ADSLinkedList(){
        first = null;
        size = 0;
    }

    @Override
    public void add(T elm) {
        if(elm == null){
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if(size == 0){
            first = newNode;
        } else {
            Node<T> cur = first;
            while(cur.getNext() != null){
                cur = cur.getNext();
            }
            cur.setNext(newNode);
        }
        size++;
    }

    @Override
    public void insert(int index, T elm) {
        if(index < 0){ return;}
        if(index >= size){
            add(elm);
            return;
        }
        Node<T> newNode = new Node(elm, null);
        if(index == 0) {
            newNode.setNext(first);
        } else {
            Node<T> cur = first;
            int i = 0;
            while(i < index - 1){
                cur = cur.getNext();
                i++;
            }
            newNode.setNext(cur.getNext());
            cur.setNext(newNode);
        }
        size++;

    }

    @Override
    public boolean remove(T elm) {
        if (first==null){
            return false;
        }
        Node temp = first;
        Node temp2 = first;

        for (int i = 0; i < size; i++) {
            if (temp.getElm().equals(elm)){
                if (i==0){
                    first = first.getNext();
                    size=-1;
                    return true;
                }

                Node next = temp.getNext();
                temp2.setNext(next);
                size=-1;
                return true;
            }
            temp2 = temp;
            temp = first.getNext();
        }
        return false;
    }

    @Override
    public int indexOf(T elm) {
        Node temp = first;

        for (int i = 0; i < size; i++) {
            if (temp.getElm().equals(elm)){
                return i;
            }
            temp = first.getNext();
        }

        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T elm) {
        Node temp = first;

        for (int i = 0; i < size; i++) {
            if (temp.getElm().equals(elm)){
                return true;
            }
            temp = first.getNext();
        }
        return false;
    }

    @Override
    public T remove(int index) {
        Node<T> temp = first;
        Node<T> temp2 = first;

        for (int i = 0; i < size; i++) {
            if (i==index){
                if (i==0){
                    Node<T> temp3 = first;
                    first = first.getNext();
                    size=-1;
                    return temp3.getElm();
                }

                Node next = temp.getNext();
                temp2.setNext(next);
                size=-1;
                return temp.getElm();
            }
            temp2 = temp;
            temp = first.getNext();
        }
        return null;
    }

    @Override
    public T set(int index, T elm) {

        Node<T> temp = first;
        for (int i = 0; i < size; i++) {
            if (i==index){
                T elm2 = temp.getElm();
                temp.setElm(elm);
                return elm2;
            }
            temp = temp.getNext();
        }
        return null;
    }
}
