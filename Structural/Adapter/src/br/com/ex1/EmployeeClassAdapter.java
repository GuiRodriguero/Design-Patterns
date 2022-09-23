package br.com.ex1;

/**
 * Adapter do tipo ClassAdapter (caracterizado por herdar a classe que tem a funcionalidade desejada)
 * <p></p>
 * Deixei como {@link Deprecated} por não ser a abordagem mais comum/ideal
 */
@Deprecated
public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
