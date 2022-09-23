package br.com.workshop;

import static br.com.workshop.TipoPagamento.CREDIT;
import static br.com.workshop.TipoPagamento.PAYPAL;

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

    public String pay(TipoPagamento tipo){
        if(tipo == CREDIT){
            return "Pagando com Cartão de Crédito";
        }else if(tipo == PAYPAL){
            return  "Pagando com PayPal";
        }else{
            return "Tipo de Pagamento inválido";
        }
    }
}
