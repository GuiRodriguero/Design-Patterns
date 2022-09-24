package br.com.workshop;

/**
 * Código alvo que exige a interface Customer
 */
public class CardDesigner {

    public String designCard(Cliente customer){
        String card = "";
        card += customer.getNome();
        card += "\n" + customer.getEndereco();
        return card;
    }
}
