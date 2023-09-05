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
        * O que está de errado?? CarrinhoDeCompras#pagar()
        *
        * 1 - Identificar a estratégia comum (pagar)
        * 2 - Identificar nossos candidatos a estratégia concreta (cartão de crédito e pay pal)
        * 3 - carrinho.pagar será refatorado.
        *       - Receberá a interface (estratégia) como parâmtro
        *       - Chamaremos o método pagar dessa estratégia.
        *
        * Agora, devemos criar a estratégia comum e as concretas:
        * 4 - Criar Interface PagamentoStrategy com o método -> void pay(int amount)
        * 5 - Criar Classes CartaoCreditoStrategy e PayPalStrategy (Concrete Strategy) que implementam PagamentoStrategy (Strategy)
        *     Cada uma das estratégias concretas, terão seu próprio jeito de pagar. Para fins de exemplo, apenas coloque um sysout com o 'total' e uma mensagem para diferenciar cada uma
        * 6 - No nosso main (Context), agora podemos fazer -> carrinho.pagar(new ConcreteStrategy())
        */

    }
}
