package br.com.builder;

public class Address {
    private String houseNumber;
    private String street;
    private String city;
    private String zipcode;
    private String state;

    public Address() {
    }

    public Address(String houseNumber, String street, String city, String zipcode, String state) {
        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
