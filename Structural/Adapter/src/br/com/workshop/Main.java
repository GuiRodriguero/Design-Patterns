package br.com.workshop;

public class Main {
    public static void main(String[] args) {
        //Usando ObjectAdapter
        Funcionario employee = populateEmployee();
        CardDesigner cardDesigner = new CardDesigner();
//        String card2 = cardDesigner.designCard(employee);
//        System.out.println(card2);

        /*
        * método designCard pede Cliente, mas estamos passando Funcionario (pois queremos um cartão para ele)
        * Usando Adapter:
        * 1 - Criar classe Adapter e implementar Cliente (implementar métodos e fazer a correspondência/tradução)
        * 2 - Ao invés de usar o CardDesigner direto, vamos instanciar o Adapter*/
    }

    public static Funcionario populateEmployee(){
        Funcionario funcionario = new Funcionario();
        funcionario.setNomeCompleto("Guilherme Rodriguero");
        funcionario.setLocalEscritorio("SP");
        return funcionario;
    }
}
