package br.com.ex1;

import java.util.Map;

/**
 * Aqui estamos implementando os passos descritos na classe abstrata
 */
public class TextPrinter extends OrderPrinter{

    @Override
    protected String start() {
        return "Order Details";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order #"+order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder("Items\n---------------------------------\n");

        for(Map.Entry<String, Double> entry : order.getItems().entrySet()) {
            builder.append(entry.getKey()+ " $"+entry.getValue()+"\n");
        }
        builder.append("---------------------------------");

        return builder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Total: $"+order.getTotal();
    }

    @Override
    protected String end() {
        return "";
    }


}
