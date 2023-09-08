package br.com.workshop;

public class Main {
    public static void main(String[] args) {

        /*
        * Aplicando o Builder para facilitar a criação da entidade Teste
        *
        * Criar Builder -> Criar Concrete Builder -> Criar Director
        *
        * 1 - Criar interface TesteBuilder (Builder). Este Builder deve ter 1 método para cada parâmetro (nome, material, valorReferencia) do nosso "Product" (Teste) (Retornando o Builder)
        * e 1 método para juntar tudo (Retornando o objeto que estamos querendo criar) Ex.: Teste build();
        *
        * 2 - Criar implementação da Interface TesteBuilder (Concrete Builder).
        * Declarar os atributos do nosso "Product".
        * Implementar os métodos da interface: Cada método deve atribuir o valor obtido como parâmetro (this.nome = nome) e retornar this.
        *
        * 3 - No Main, criar um método estático que instancia o Builder.
        *       Agora podemos tirar proveito do encadeamento de métodos que o "return this;" nos oferece. Com o builder em mãos, podemos
        *       fazer: builder.metodo1("xxx").metodo2(123).build();
        */
    }
}
