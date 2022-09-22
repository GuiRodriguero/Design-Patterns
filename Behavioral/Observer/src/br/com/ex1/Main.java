package br.com.ex1;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("101");
        PriceObserver price = new PriceObserver();
        order.attach(price);

        QuantityObserver quant = new QuantityObserver();
        order.attach(quant);

        order.addItem(50);
        order.addItem(179);

        System.out.println(order);
        //Disconto (somar todos os prices de order adicionados e olhar PriceOberserver)
        //Frete (somar a quantidade de order adicionados e olhar QuantityOberserver)
    }
}
