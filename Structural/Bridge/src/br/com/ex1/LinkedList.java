package br.com.ex1;

/**
 * Representa o nosso Implementor. Tem sua hierarquia própria (não se relacionando com a hierarquia da abstração ({@link FIFOCollection})
 * Esta classe provê operações que podem ser usadas pela nossa abstração para que ela entregue a funcionalidade dela
 */
public interface LinkedList<T> {

    void addFirst(T element);
    T removeFirst();
    void addLast(T element);
    T removeLast();
    int getSize();
}
