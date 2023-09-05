package br.com.ex1;

import java.util.LinkedList;

public class Main {

    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
        createOrders();

        //pritando e passando a strategy desejada (br.com.ex1.SummaryPrinter ou br.com.ex1.DetailPrinter) para printar a lista de Orders do modo que queremos
        PrintService service = new PrintService(new SummaryPrinter());
        service.printOrders(orders);

    }

    private static void createOrders() {
        Order o = new Order("100");
        o.addItem("Soda", 2);
        o.addItem("Chips", 10);
        orders.add(o);

        o = new Order("200");
        o.addItem("Cake", 20);
        o.addItem("Cookies", 5);
        orders.add(o);

        o = new Order("300");
        o.addItem("Burger", 8);
        o.addItem("Fries", 5);
        orders.add(o);
    }
}
