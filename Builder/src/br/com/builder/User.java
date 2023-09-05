package br.com.builder;

import java.time.LocalDate;

/**
 * Este é o ponto inicial para a decisão do uso deste Design Pattern. Como podemos ver, esta classe possui
 * 2 atributos que não são tipo primitivos (um deles sendo uma outra classe do nosso sistema), sendo assim decidimos
 * aplicar o Builder para facilitar a criação de objetos desta classe
 */
public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

    public User() {
    }

    public User(String firstName, String lastName, LocalDate birthday, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
