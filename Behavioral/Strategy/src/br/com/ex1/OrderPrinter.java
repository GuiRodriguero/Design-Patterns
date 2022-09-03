package br.com.ex1;

import java.util.Collection;

/**
 * Strategy
 */
public interface OrderPrinter {
    /**
     * Método que define como iremos printar nossa coleção de {@link Order}.
     * Cada classe filha fará de um jeito
     */
    void print(Collection<Order> orders);
}
