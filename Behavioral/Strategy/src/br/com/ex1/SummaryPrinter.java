package br.com.ex1;

import java.util.Collection;

/**
 * Implementação do Strategy
 */
public class SummaryPrinter implements OrderPrinter{

    /**
     * Define um dos modos que podemos printar uma lista de {@link Order}
     */
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("*************** Summary Report *************");
        double total = 0;
        for(Order order : orders) {
            System.out.println(order.getId()+ "\t"+order.getDate()+"\t"+order.getItems().size()+"\t"+order.getTotal());
            total += order.getTotal();
        }
        System.out.println("*******************************************");
        System.out.println("\t\t\t  Total "+total);
    }
}
