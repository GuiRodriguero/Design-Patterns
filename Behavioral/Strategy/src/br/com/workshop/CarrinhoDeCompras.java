package br.com.workshop;

import static br.com.workshop.TipoPagamento.CREDIT;
import static br.com.workshop.TipoPagamento.PAYPAL;

import java.util.ArrayList;
import java.util.List;

/**
 * Context
 */
public class CarrinhoDeCompras {
    //List of items
    List<Item> items;

    public CarrinhoDeCompras(){
        this.items=new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calcularTotal(){
        return items.stream()
                .mapToInt(Item::getPreco)
                .sum();
    }

    public void pagar(TipoPagamento tipo){
        int total = calcularTotal();
        if(tipo == CREDIT){
            System.out.println("Pagando " + total + " com Cartão de Crédito");
        }else if(tipo == PAYPAL){
            System.out.println("Pagando " + total + " com PayPal");
        }
    }
}
