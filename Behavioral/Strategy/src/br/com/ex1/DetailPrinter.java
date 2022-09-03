package br.com.ex1;

import java.util.Collection;
import java.util.Map;

/**
 * Implementação do Strategy
 */
public class DetailPrinter implements OrderPrinter{

    /**
     * Define um dos modos que podemos printar uma lista de {@link Order}
     */
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("************* Detail Report ***********");
        double total = 0;
        for(Order order : orders) {
            double orderTotal = 0;
            System.out.println(order.getId()+" \t"+order.getDate());
            for(Map.Entry<String, Double> entry : order.getItems().entrySet()) {
                System.out.println("\t\t"+entry.getKey()+"\t"+entry.getValue());
                orderTotal+=entry.getValue();
            }
            System.out.println("----------------------------------------");
            System.out.println("\t\t Total  "+orderTotal);
            System.out.println("----------------------------------------");
            total += orderTotal;
        }
        System.out.println("----------------------------------------");
        System.out.println("\tGrand Total "+total);
    }
}
