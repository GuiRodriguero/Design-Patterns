package br.com.workshop;

/**
 * Código alvo que exige a interface Customer
 */
public class CardDesigner {

    public String designCard(Cliente cliente){
        String card = "";
        card += cliente.getNome();
        card += "\n" + cliente.getEndereco();
        return card;
    }
}
