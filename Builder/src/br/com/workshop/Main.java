package br.com.workshop;

public class Main {
    public static void main(String[] args) {

        /*
        * Aplicando o Builder para facilitar a criação da entidade Teste
        *
        * Criar Builder -> Criar Concrete Builder -> Criar Director
        *
        * 1 - Criar interface TesteBuilder (Builder). Este Builder deve ter 1 método para cada parâmetro (name, material, valorReferencia) do nosso "Product" (Retornando o Builder)
        * e 1 método para juntar tudo (Retornando o objeto alvo da criação)
        *
        * 2 - Criar implementação da Interface (Concrete Builder).
        * devemos também declarar os atributos do nosso "Product". Cada método deve retornar this.
        *
        * 3 - No Main, criar um método estático que recebe o Builder e retorna o objeto criado (Director)
        */
    }
}
