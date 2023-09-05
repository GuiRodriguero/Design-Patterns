package br.com.workshop;

public class Main {
    public static void main(String[] args) {
        //Usando ObjectAdapter
        Funcionario funcionario = populateFuncionario();
        CardDesigner cardDesigner = new CardDesigner();
//        String card2 = cardDesigner.designCard(funcionario);
//        System.out.println(card2);

        /*
        * Descomentar linhas 8 e 9
        * Método designCard pede Cliente, mas estamos passando Funcionario (pois queremos um cartão para ele). Para nós, não faz sentido o Funcionario implementar Cliente.
        * Sendo assim, podemos usar o Adapter para resolver este problema em "sujar" nossa classe Funcionario:
        *
        * 1 - Criar classe Adapter (Ex.: FuncionarioAdapter):
        *   * Criar o parâmetro private Funcionario funcionario;
        *   * Implementar Cliente (implementar métodos e fazer a correspondência/tradução)
        *   * Um construtor com o parâmetro Funcionario
        *
        * 2 - No main, ao invés de usar o CardDesigner direto, vamos instanciar o Adapter passando o Funcionario. Feito isso, chamamos o método cardDesigner.designCard()
        *     passando o FuncionarioAdapter.
        */
    }

    public static Funcionario populateFuncionario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeCompleto("Guilherme Rodriguero");
        funcionario.setLocalEscritorio("SP");
        return funcionario;
    }
}
