package br.com.workshop;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(5, 5000);
        Pedido pedido2 = new Pedido(50, 5000);
        Pedido pedido3 = new Pedido(50, 90);

        calcularDesconto(pedido);
        calcularDesconto(pedido2);
        calcularDesconto(pedido3);

        /*
        * Chain Pattern:
        * 1 - (Handler) Interface/Classe abstrata Desconto (private Desconto sucessor, getters, setter, construtor)
        * 2 - Método abstrato em Desconto para calcular o desconto (refatorando o que temos logo abaixo)
        * 3 - (Elos da Chain) Criar as implementações de Desconto (por quantidade de valor) implementando calcular e o construtor
        * 4 - Criar método Desconto createChain aqui no Main
        * 5 - no main() -> Instanciar Desconto e chamar/printar o método de calcular*/

    }

    private static void calcularDesconto(Pedido pedido){
        if(pedido.getQuantidade() > 10){
            calcularDescontoQuantidade(pedido);
        }else if(pedido.getValor() > 1000.0){
            calcularDescontoValor(pedido);
        }
    }

    private static double calcularDescontoQuantidade(Pedido pedido){
        System.out.println("Desconto por itens");
        return pedido.getValor() * 0.5;
    }
    private static double calcularDescontoValor(Pedido pedido){
        System.out.println("Desconto por valor");
        return pedido.getValor() * 0.1;
    }
}
