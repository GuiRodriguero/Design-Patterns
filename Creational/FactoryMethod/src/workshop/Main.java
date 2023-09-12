package workshop;

public class Main {
    public static void main(String[] args) {

        /*
        * Neste nosso modelo, temos Carro e Moto. Sem o uso de nenhum pattern, colocaríamos os atributos nas respectivas classes e faríamos a instanciação aqui no Main
        * Com isso, teríamos um código repetitivo e com a lógica de instanciação junto com a regra de negócio (o que não é ideal)
        *
        * Aplicando o Factory Method:
        * 1 - Primeiro devemos criar a classe abstrata Veiculo.
        *   Podemos colocar o atributo: private int rodas;
        *   Depois, criamos o getter e setter;
        *   Por fim, criamos um método para que as classes filhas possam informar a quantidade de rodas de cada veículo: abstract void montarVeiculo(Veiculo veiculo);
        *
        * 2 - Nas classes Carro e Moto, herdamos Veiculo (pois Carro e Moto são TIPOS DE Veicuo) e fazemos o override deste método criado acima e colocamos a quantidade de rodas respectiva de cada veículo
        *
        * 3 - Criar a classe abstrata VeiculoFactory:
        *   Primeiro, criamos o método abstrato que vai criar e retornar uma instância de um Veículo -> abstract Veiculo instanciarVeiculo()
        *   Depois, criamos o método public Veiculo criar() {...}
        *       Nele, devemos obter uma instância de Veiculo a partir do método instanciarVeiculo()
        *       Chamar o método montarVeiculo() para este Veiculo obtido
        *       retornar este veículo
        *
        * 4 - Agora, precisamos das classes Factory de Carro e Moto. Devemos Criar CarroFactory e MotoFactory que herdam de VeiculoFactory. Fazemos o override do método instanciarVeiculo()
        * e retornamos um new Carro e new Moto, respectivamente.
        *
        * 5 - Aqui no Main (nossa classe simulando a regra de negócio), podemos simplesmente usar new MotoFactory().criar() ou new CarroFactory().criar() e teremos em mãos um Veículo com
        * informações básicas já preenchida para cada tipo de veículo (por enquanto só temos número de rodas)
        *
        * Esta é uma solução muito mais elegante do que criar estes objetos aqui nesta classe. Pode não parecer pois estamos lidando com exemplos simples, mas em grandes projetos, o ganho é exponencial
        */
    }
}
