package br.com.ex1;

import java.util.LinkedList;

/**
 * Classe que representa o context no nosso UML do Strategy
 */
public class PrintService {

    private OrderPrinter strategy;

    /**
     * Quando a regra de negócio quiser printar a lista de Order, ela irá instanciar esta
     * classe passando qual estratégia será usada
     * @param strategy
     */
    public PrintService(OrderPrinter strategy){
        this.strategy = strategy;
    }

    public void printOrders(LinkedList<Order> orders){
        strategy.print(orders);
    }
}
