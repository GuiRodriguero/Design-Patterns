package br.com.ex1;

/**
 * Classe que tem a funcionalidade que queremos, porém não implementa a classe que o código alvo exige
 *
 * Aqui temos algumas diferenças em relação a interface alvo ({@link Customer}), porém temos alguns atributos que
 * podem ser substitutos diretos, como:
 * br.com.ex1.Employee -> br.com.ex1.Customer
 * fullName -> name
 * jobTitle -> designation
 * officeLocation -> address
 */
public class Employee {

    private String fullName;
    private String jobTitle;
    private String officeLocation;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }
}
