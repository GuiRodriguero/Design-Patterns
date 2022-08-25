/**
 * Código alvo que exige a interface Customer
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
