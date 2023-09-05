package br.com.ex2;

public class DescontoPorValor extends Desconto{

    public DescontoPorValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcular(Pedido pedido) {
        if(pedido.getValor() > 1000.0){
            System.out.println("Desconto por valor");
            return pedido.getValor() * 0.1;
        }
        return getProximo().calcular(pedido);
    }
}
