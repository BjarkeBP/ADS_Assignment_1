package org.example;

public class ADSLinkedListStack<T> implements StackInterface<T>{

    private ADSListADT<T> LinkedList;

    public ADSLinkedListStack() {
        LinkedList = new ADSLinkedList<T>();
    }

    @Override
    public boolean isEmpty() {
        if(LinkedList.size()<=0){
            return true;
        }
        return false;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            return null;
        }
        T temp = LinkedList.remove(0);
        LinkedList.insert(0, temp);
        return temp;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            return null;
        }
        return LinkedList.remove(0);
    }

    @Override
    public void push(T item) {
        LinkedList.insert(0, item);
    }
}
