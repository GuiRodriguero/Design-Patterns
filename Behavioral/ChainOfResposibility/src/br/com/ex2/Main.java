package br.com.ex2;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(5, 5000);
        Pedido pedido2 = new Pedido(50, 5000);
        Pedido pedido3 = new Pedido(50, 90);

        Desconto desconto = createChain();

        System.out.println("Desconto de: " + desconto.calcular(pedido));
        System.out.println("Desconto de: " + desconto.calcular(pedido2));
        System.out.println("Desconto de: " + desconto.calcular(pedido3));
    }

    private static Desconto createChain(){
        DescontoPorItens descontoPorItens = new DescontoPorItens(null);
        DescontoPorValor descontoPorValor = new DescontoPorValor(descontoPorItens);
        return descontoPorValor;
    }
}
