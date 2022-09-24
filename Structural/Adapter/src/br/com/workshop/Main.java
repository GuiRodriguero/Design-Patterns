package br.com.workshop;

public class Main {
    public static void main(String[] args) {
        //Usando ObjectAdapter
        Funcionario employee = new Funcionario();
        populateEmployee(employee);
        CardDesigner cardDesigner = new CardDesigner();
        //String card2 = cardDesigner.designCard(employee);
        //System.out.println(card2);

        /*
        * método designCard pede Cliente, mas estamos passando Funcionario (pois queremos um cartão para ele)
        * Usando Adapter:
        * 1 - Criar classe Adapter e implementar Customer (implementar métodos e fazer a correspondência/tradução)
        * 2 - Ao invés de usar o CardDesigner direto, vamos instanciar o Adapter*/
    }

    public static void populateEmployee(Funcionario employee){
        employee.setNomeCompleto("Guilherme Rodriguero");
        employee.setLocalEscritorio("SP");
    }
}
