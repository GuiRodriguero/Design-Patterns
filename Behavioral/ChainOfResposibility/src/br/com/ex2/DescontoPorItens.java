package br.com.ex2;

public class DescontoPorItens extends Desconto{

    public DescontoPorItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcular(Pedido pedido) {
        if(pedido.getQuantidade() > 10){
            System.out.println("Desconto por itens");
            return pedido.getValor() * 0.5;
        }
        return getProximo().calcular(pedido);
    }
}
