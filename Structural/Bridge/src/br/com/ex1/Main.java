package br.com.ex1;

public class Main {
    public static void main(String[] args) {
        FIFOCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(99);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        //
        System.out.println(collection.poll());
    }
}
