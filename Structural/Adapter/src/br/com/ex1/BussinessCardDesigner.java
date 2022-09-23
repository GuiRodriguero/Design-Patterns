package br.com.ex1;

/**
 * Código alvo que exige a interface br.com.ex1.Customer
 */
public class BussinessCardDesigner {

    public String designCard(Customer customer){
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
