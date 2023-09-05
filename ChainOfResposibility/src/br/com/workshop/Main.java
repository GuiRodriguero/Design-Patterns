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
        * Chain Pattern: Nosso sistema aplica desconto na compra com base na quantidade ou valor do pedido. Para resolver este problema, podemos aplicar o pattern Chain
        * 1 - Começamos pela criação do HANDLER (Classe abstrata) Desconto
        *   Deve conter:
        *       - private Desconto sucessor
        *       - getters, setter, construtor com o parâmetro sucessor.
        *       - Criar método abstract double calcular(Pedido pedido) para podermos calcular o desconto (isso vai refatorar essa bagunça que o main está)
        *
        * 3 - (Elos da Chain) Criar as implementações de Desconto (por quantidade e valor)
        *       DescontoPorItens extends Desconto (deve ter o construtor com o parâmetro Desconto sucessor) + sobrescrever o método calcular
        *           Se a quantidade for maior que 10, retornamos um desconto de 50%. Do contrário, retornamos getProximo().calcular(pedido)
        *       DescontoPorValor extends Desconto (deve ter o construtor com o parâmetro Desconto sucessor) sobrescrever o método calcular
        *           Se o valor for maior que 1000.0, retornamos um desconto de 10%. Do contrário, retornamos getProximo().calcular(pedido)
        *
        * 4 - Agora, no main, precisamos criar um método que crie a nossa Chain. Este método deve retorar o Handler (Desconto).
        *       A nossa chain é composta pelas classes que herdam de Desconto, então para criá-la devemos fazer dentro deste método:
        *       DescontoPorItens descontoPorItens = new DescontoPorItens(null);
        *       DescontoPorValor descontoPorValor = new DescontoPorValor(descontoPorItens);
        *
        *       Note como estamos indicando, no construtor, quem é o próximo elemento da Chain, caso ele próprio não consiga lidar com aquele Pedido
        *
        * 5 - no main() -> Desconto desconto = createChain();
        * 6 - Agora, podemos apagar os métodos calcularDescontoQuantidade e calcularDescontoValor e calcular o desconto via: desconto.calcular(pedido)
        */

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
