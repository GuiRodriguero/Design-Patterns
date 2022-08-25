package br.com.ex1;

/**
 * Refined Abstraction
 */
public class Queue<T> implements FIFOCollection<T>{

    private LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
