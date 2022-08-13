package br.com.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * Implementação do Builder do UserDTO. Aqui é onde iremos dizer qual classe iremos criar (UserWebDTO) e como ela será criada
 */
public class UserWebDTOBuilder implements UserDTOBuilder{

    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n " + address.getCity() + "\n"
                + address.getState() + " " + address.getZipcode();
        return this;
    }

    @Override
    public UserDTO build() {
        return new UserWebDTO(firstName + " " + lastName, address, age);
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
