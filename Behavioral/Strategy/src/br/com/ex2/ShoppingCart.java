package br.com.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Context
 */
public class ShoppingCart {
    //List of items
    List<Item> items;

    public ShoppingCart(){
        this.items=new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
