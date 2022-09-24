package br.com.workshop;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        carrinho.addItem(item1);
        carrinho.addItem(item2);

        carrinho.pagar(TipoPagamento.CREDIT);

        /*
        * Strategy:
        * 1 - Identificar a estratégia comum
        * 2 - Identificar nossos candidatos a estratégia concreta
        * 3 - cart.pay será refatorado. receberá a estratégia e chamaremos o método da estratégia*/

    }
}
